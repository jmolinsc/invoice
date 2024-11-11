package com.app.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.invoice.model.Artcategoria;
import com.app.invoice.repository.ArtcategoriaRepository;


@Service
public class ArtcategoriaImp implements ArtcategoriaService {

    @Autowired
    ArtcategoriaRepository artcategoriaRepository;

    @Override
    public List<Artcategoria> findAllArtCategoria() {

        return artcategoriaRepository.findAllArtCategoria();
    }

}
