package com.app.invoice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.invoice.model.Art;

public interface ArtRepository extends JpaRepository<Art, String> {

    Page<Art> findAll(Pageable pageable);

    @Query("SELECT p FROM Art p " +
            "WHERE (LOWER(p.articulo) LIKE LOWER(CONCAT('%',:searchTerm, '%')) " +
            "OR LOWER(p.descripcion1) LIKE LOWER(CONCAT('%',:searchTerm, '%')) " +
            "OR LOWER(p.cuenta4) LIKE LOWER(CONCAT('%',:searchTerm, '%')))")
    Page<Art> getPagedData_jpql(@Param("searchTerm") String searchTerm, Pageable pageable);

    @Query(value = "SELECT * FROM Art p " +
            "WHERE (LOWER(p.articulo) LIKE LOWER(CONCAT('%',:searchTerm, '%')) " +
            "OR LOWER(p.descripcion1) LIKE LOWER(CONCAT('%',:searchTerm, '%')) " +
            "OR LOWER(p.cuenta4) LIKE LOWER(CONCAT('%',:searchTerm, '%')))", nativeQuery = true)
    Page<Art> getPagedData_native(@Param("searchTerm") String searchTerm, Pageable pageable);
}
