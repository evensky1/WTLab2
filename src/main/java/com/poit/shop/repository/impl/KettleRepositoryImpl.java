package com.poit.shop.repository.impl;

import com.poit.shop.dao.ProductDAO;
import com.poit.shop.dao.exception.DAOException;
import com.poit.shop.entity.Kettle;
import com.poit.shop.entity.criteria.Criteria;
import com.poit.shop.repository.KettleRepository;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class KettleRepositoryImpl implements KettleRepository {
    private final ProductDAO productDAO;

    @Override
    public List<Kettle> findAll() {
        var kettleCriteria = new Criteria(Kettle.class.getSimpleName());
        try {
            return productDAO.find(kettleCriteria).stream().map(Kettle.class::cast).toList();
        } catch (DAOException e) {
            return Collections.emptyList();
        }
    }

    @Override
    public List<Kettle> findAllByColor(String color) {
        var kettleCriteria = new Criteria(Kettle.class.getSimpleName());
        kettleCriteria.add("color", color);
        try {
            return productDAO.find(kettleCriteria).stream().map(Kettle.class::cast).toList();
        } catch (DAOException e) {
            return Collections.emptyList();
        }
    }
}
