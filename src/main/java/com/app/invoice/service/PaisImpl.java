package com.app.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.invoice.model.Pais;
import com.app.invoice.repository.PaisRepository;

@Service
public class PaisImpl implements PaisService {

    @Autowired
    PaisRepository paisRepository;

    @Override
    public List<Pais> findAllPais() {
        return paisRepository.findAllPais();
    }

}
