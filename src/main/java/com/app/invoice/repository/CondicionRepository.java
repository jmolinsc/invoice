package com.app.invoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.invoice.model.Condicion;

public interface CondicionRepository extends JpaRepository<Condicion, Integer> {

   @Query(value = "SELECT id,condicion,diasvencimiento,tipo FROM Condicion", nativeQuery = true)
   List<Condicion> findAllCondiciones();
}
