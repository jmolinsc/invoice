package com.app.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.invoice.model.Municipio;
import com.app.invoice.repository.MunicipioRepository;

@Service
public class MunicipioImpl implements MunicipioService {

    @Autowired
    MunicipioRepository municipioRepository;

    @Override
    public List<Municipio> findAllMunicipios() {
        return municipioRepository.findAllMuncipio();
    }

}
