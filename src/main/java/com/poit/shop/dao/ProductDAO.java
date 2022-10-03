package com.poit.shop.dao;

import com.poit.shop.dao.exception.DAOException;
import com.poit.shop.entity.Product;
import com.poit.shop.entity.criteria.Criteria;
import java.util.List;

public interface ProductDAO {
    List<Product> find(Criteria criteria) throws DAOException;
    void create(Product product) throws DAOException;
}
