package com.app.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.invoice.model.Departamento;
import com.app.invoice.repository.DepartamentoRepository;

@Service
public class DepartamentoImpl implements DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    @Override
    public List<Departamento> findAllDepartamentos() {
        return departamentoRepository.findAllDepartamentos();
    }

}
