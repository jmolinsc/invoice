package com.app.invoice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.app.invoice.model.Cte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CteRepository extends JpaRepository<Cte, String> {

    Page<Cte> findAll(Pageable pageable);

    @Query("SELECT p FROM Cte p " +
            "WHERE (LOWER(p.cliente) LIKE LOWER(CONCAT('%',:searchTerm, '%')) " +
            "OR LOWER(p.nombre) LIKE LOWER(CONCAT('%',:searchTerm, '%')) " +
            "OR LOWER(p.familia) LIKE LOWER(CONCAT('%',:searchTerm, '%')))")
    Page<Cte> getPagedData_jpql(@Param("searchTerm") String searchTerm, Pageable pageable);

    @Query(value = "SELECT * FROM Cte p " +
            "WHERE (LOWER(p.cliente) LIKE LOWER(CONCAT('%',:searchTerm, '%')) " +
            "OR LOWER(p.nombre) LIKE LOWER(CONCAT('%',:searchTerm, '%')) " +
            "OR LOWER(p.familia) LIKE LOWER(CONCAT('%',:searchTerm, '%')))", nativeQuery = true)
    Page<Cte> getPagedData_native(@Param("searchTerm") String searchTerm, Pageable pageable);
}
