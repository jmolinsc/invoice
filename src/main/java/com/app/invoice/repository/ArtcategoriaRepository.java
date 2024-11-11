package com.app.invoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.invoice.model.Artcategoria;

public interface ArtcategoriaRepository extends JpaRepository<Artcategoria, Integer> {

    @Query(value = "SELECT * FROM Artcategoria", nativeQuery = true)
    List<Artcategoria> findAllArtCategoria();

}
