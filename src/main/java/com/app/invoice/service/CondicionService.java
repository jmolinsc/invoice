package com.app.invoice.service;

import java.util.List;
import java.util.Optional;

import com.app.invoice.model.Condicion;

public interface CondicionService {
     List<Condicion> findAllCondiciones();

     List<Condicion> findAll();
}
