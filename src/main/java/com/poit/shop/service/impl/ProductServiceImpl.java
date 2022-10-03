package com.poit.shop.service.impl;

import com.poit.shop.entity.Product;
import com.poit.shop.repository.ProductRepository;
import com.poit.shop.service.ProductService;
import java.util.Comparator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product getCheapestOne() {
        var products = productRepository.findAll();
        return products.stream().min(Comparator.comparingInt(Product::getPrice)).orElse(null);
    }
}
