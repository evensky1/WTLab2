package com.poit.shop.repository;

import com.poit.shop.entity.Kettle;
import java.util.List;

public interface KettleRepository {
    List<Kettle> findAll();

    List<Kettle> findAllByColor(String color);
}
