package com.app.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.invoice.model.Artlinea;
import com.app.invoice.repository.ArtlineaRepository;

@Service
public class ArtlineaImpl implements ArtlineaService {

    @Autowired
    ArtlineaRepository artlineaRepository;

    @Override
    public List<Artlinea> findAll() {

        return artlineaRepository.findAll();

    }

}
