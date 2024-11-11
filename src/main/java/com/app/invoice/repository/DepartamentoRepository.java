package com.app.invoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.invoice.model.Departamento;
import com.app.invoice.model.Municipio;

public interface DepartamentoRepository extends JpaRepository<Departamento,Integer>{

     @Query(value = "SELECT * FROM Departamento", nativeQuery = true)
    List<Departamento> findAllDepartamentos();

}
