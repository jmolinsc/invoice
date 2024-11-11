package com.app.invoice.repository;

import com.app.invoice.model.Inv;
import org.springframework.data.jpa.repository.JpaRepository;



public interface InvRepository extends JpaRepository<Inv, Integer> {

}
