package com.poit.shop.dao.impl;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.poit.shop.dao.ProductDAO;
import com.poit.shop.dao.exception.DAOException;
import com.poit.shop.entity.Product;
import com.poit.shop.entity.criteria.Criteria;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    private static final String PATH
        = "C:\\Users\\fromt\\IdeaSpace\\WTLab2\\src\\main\\resources\\datafolder\\db.xml";

    @Override
    public List<Product> find(Criteria criteria) throws DAOException {
        var result = new ArrayList<Product>();
        try (var fileInputStream = new FileInputStream(PATH)) {
            var mapper = new XmlMapper();
            var xmlString = new String(fileInputStream.readAllBytes());
            var products = mapper.readValue(xmlString, ProductWrapper.class).getProducts();

            List<Product> concreteProducts;
            if (!criteria.getGroupSearchName().equals("")) {
                concreteProducts = products.stream().filter(
                    product -> product.getClass().getSimpleName()
                        .equals(criteria.getGroupSearchName())
                ).toList();
            } else {
                concreteProducts = products;
            }

            if (criteria.getCriteriaMap().isEmpty()) {
                return concreteProducts;
            } else {
                criteria.getCriteriaMap()
                    .forEach((key, value) -> result.addAll(
                        concreteProducts.stream().filter(p -> {
                            try {
                                return p.getClass().getDeclaredField(key).equals(value);
                            } catch (NoSuchFieldException e) {
                                throw new RuntimeException(e);
                            }
                        }).toList()
                    ));
            }

            return result;
        } catch (IOException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void create(Product product) throws DAOException {
        try {
            var fileInputStream = new FileInputStream(PATH);
            var mapper = new XmlMapper();
            var xmlString = new String(fileInputStream.readAllBytes());
            fileInputStream.close();
            var productWrapper = mapper.readValue(xmlString, ProductWrapper.class);
            productWrapper.add(product);

            var fileOutputStream = new FileOutputStream(PATH);
            fileOutputStream.write(mapper.writeValueAsBytes(productWrapper));
            fileOutputStream.close();

        } catch (IOException e) {
            throw new DAOException(e.getMessage());
        }
    }
}