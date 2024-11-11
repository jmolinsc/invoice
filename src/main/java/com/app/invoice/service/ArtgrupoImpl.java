package com.app.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.invoice.model.Artgrupo;
import com.app.invoice.repository.ArtgrupoReporsitory;


@Service
public class ArtgrupoImpl implements ArtgrupoService {

    @Autowired
    ArtgrupoReporsitory artgrupoReporsitory;

    @Override
    public List<Artgrupo> findAll() {
        return artgrupoReporsitory.findAll();

    }

}
