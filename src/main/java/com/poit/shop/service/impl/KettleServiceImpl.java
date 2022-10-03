package com.poit.shop.service.impl;

import com.poit.shop.entity.Kettle;
import com.poit.shop.repository.KettleRepository;
import com.poit.shop.service.KettleService;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class KettleServiceImpl implements KettleService {

    private final KettleRepository kettleRepository;

    @Override
    public List<Kettle> getAll() {
        return kettleRepository.findAll();
    }
}
