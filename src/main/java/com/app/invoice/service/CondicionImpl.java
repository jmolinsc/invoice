package com.app.invoice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.invoice.model.Condicion;
import com.app.invoice.repository.CondicionRepository;

@Service
public class CondicionImpl implements CondicionService {

   @Autowired
   CondicionRepository condicionRepository;

   @Override
   public List<Condicion> findAllCondiciones() {
      return condicionRepository.findAllCondiciones();
   }

   @Override
   public List<Condicion> findAll() {
      return condicionRepository.findAll();
   }

}
