package com.app.invoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.invoice.model.Almgrupo;
import com.app.invoice.model.Unidad;

public interface UnidadRepository extends JpaRepository<Unidad, Integer> {

    @Query(value = "SELECT * FROM Unidad", nativeQuery = true)
    List<Unidad> findAllUnidad();

}
