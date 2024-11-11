package com.app.invoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.invoice.model.Municipio;
import com.app.invoice.model.Pais;

public interface MunicipioRepository extends JpaRepository<Municipio, Integer> {

    @Query(value = "SELECT * FROM Municipio", nativeQuery = true)
    List<Municipio> findAllMuncipio();

}
