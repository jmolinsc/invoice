package com.app.invoice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.invoice.model.Alm;

public interface AlmRepository extends JpaRepository<Alm, String> {

    Page<Alm> findAll(Pageable pageable);

    @Query("SELECT p FROM Alm p " +
            "WHERE (LOWER(p.almacen) LIKE LOWER(CONCAT('%',:searchTerm, '%')) " +
            "OR LOWER(p.encargado) LIKE LOWER(CONCAT('%',:searchTerm, '%')) " +
            "OR LOWER(p.nombre) LIKE LOWER(CONCAT('%',:searchTerm, '%')) " +
            "OR LOWER(p.telefonos) LIKE LOWER(CONCAT('%',:searchTerm, '%')))")
    Page<Alm> getPagedData_jpql(@Param("searchTerm") String searchTerm, Pageable pageable);

    @Query(value = "SELECT * FROM Alm " +
            "WHERE (LOWER(almacen) LIKE LOWER(CONCAT('%', :searchTerm, '%')) " +
            "OR LOWER(nombre) LIKE LOWER(CONCAT('%', :searchTerm, '%')) " +
            "OR LOWER(telefonos) LIKE LOWER(CONCAT('%', :searchTerm, '%')))", nativeQuery = true)
    Page<Alm> getPagedData_native(@Param("searchTerm") String searchTerm, Pageable pageable);


}
