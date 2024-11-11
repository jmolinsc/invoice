package com.app.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.invoice.model.Almgrupo;
import com.app.invoice.repository.AlmgrupoRepository;

@Service
public class AlmgrupoServiceImpl implements AlmgrupoService {

    @Autowired
    AlmgrupoRepository almgrupoRepository;

    @Override
    public List<Almgrupo> findAllAlta() {
        // TODO Auto-generated method stub
        return almgrupoRepository.findAllAlmgrupo();
    }

}
