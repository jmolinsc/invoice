package com.app.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.invoice.model.Artfabricante;
import com.app.invoice.repository.ArtfabricanteRepository;

@Service
public class ArtfabricanteImpl implements ArtfabricanteService {

    @Autowired
    ArtfabricanteRepository artfabricanteRepository;

    @Override
    public List<Artfabricante> findAll() {
        return artfabricanteRepository.findAll();
    }

}
