package com.poit.shop.repository;

import com.poit.shop.entity.Product;
import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}
