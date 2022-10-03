package com.poit.shop.dao.impl;

import com.poit.shop.entity.Product;
import java.util.ArrayList;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductWrapper {
    private final ArrayList<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }
}
