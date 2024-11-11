package com.app.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.invoice.model.Listaprecios;
import com.app.invoice.repository.ListapreciosRepository;

@Service
public class ListapreciosImpl implements ListapreciosService {

    @Autowired
    ListapreciosRepository listapreciosRepository;

    @Override
    public List<Listaprecios> findAll() {
        return listapreciosRepository.findAll();

    }

}
