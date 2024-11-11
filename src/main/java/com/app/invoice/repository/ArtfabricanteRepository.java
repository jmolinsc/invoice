package com.app.invoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.invoice.model.Artcategoria;
import com.app.invoice.model.Artfabricante;

public interface ArtfabricanteRepository extends JpaRepository<Artfabricante, Integer> {

    @Query(value = "SELECT * FROM Artfabricante", nativeQuery = true)
    List<Artfabricante> findAllArtfabricante();
}
