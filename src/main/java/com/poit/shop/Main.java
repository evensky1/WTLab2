package com.poit.shop;

import com.poit.shop.dao.impl.ProductDAOImpl;
import com.poit.shop.repository.impl.KettleRepositoryImpl;
import com.poit.shop.repository.impl.ProductRepositoryImpl;
import com.poit.shop.service.impl.KettleServiceImpl;
import com.poit.shop.service.impl.ProductServiceImpl;

public class Main {

    public static void main(String[] args) {
        var productService = new ProductServiceImpl(new ProductRepositoryImpl(new ProductDAOImpl()));
        var kettleService = new KettleServiceImpl(new KettleRepositoryImpl(new ProductDAOImpl()));

        System.out.println(productService.getCheapestOne().toString());
        System.out.println("----------------------------------------");
        kettleService.getAll().forEach(k -> System.out.println(k.toString()));
    }
}
