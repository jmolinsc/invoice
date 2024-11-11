package com.app.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.invoice.model.Artfamilia;
import com.app.invoice.repository.ArtfamiliaRepository;

@Service
public class ArtfamiliaImpl implements ArtfamiliaService {

    @Autowired
    ArtfamiliaRepository artfamiliaRepository;

    @Override
    public List<Artfamilia> findAllArtfamilias() {

        return artfamiliaRepository.findAll();
    }

}
