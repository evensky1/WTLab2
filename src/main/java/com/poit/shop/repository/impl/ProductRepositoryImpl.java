package com.poit.shop.repository.impl;

import com.poit.shop.dao.ProductDAO;
import com.poit.shop.dao.exception.DAOException;
import com.poit.shop.entity.Product;
import com.poit.shop.entity.criteria.Criteria;
import com.poit.shop.repository.ProductRepository;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductDAO productDAO;

    @Override
    public List<Product> findAll() {
        try {
            return productDAO.find(new Criteria(""));
        } catch (DAOException e) {
            return Collections.emptyList();
        }
    }
}
