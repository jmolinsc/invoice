package com.app.invoice.repository;

import com.app.invoice.model.Venta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {

    @Query(value = " SELECT X "
            + " FROM venta x "
            + " WHERE x.ID = :id", nativeQuery = true)
    Venta finByIdVenta(@Param("id") Integer id);

    @Query(value = " SELECT * "
            + " FROM venta ", nativeQuery = true)
    List<Venta> All();

}
