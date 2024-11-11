package com.app.invoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.invoice.model.Almgrupo;

public interface AlmgrupoRepository extends JpaRepository<Almgrupo, Integer> {

    @Query(value = "SELECT * FROM Almgrupo", nativeQuery = true)
    List<Almgrupo> findAllAlmgrupo();

}
