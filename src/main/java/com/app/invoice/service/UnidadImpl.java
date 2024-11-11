package com.app.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.invoice.model.Unidad;
import com.app.invoice.repository.UnidadRepository;

@Service
public class UnidadImpl implements UnidadService {

    @Autowired
    UnidadRepository unidadRepository;

    @Override
    public List<Unidad> findAllUnidad() {
        return unidadRepository.findAllUnidad();
    }

}
