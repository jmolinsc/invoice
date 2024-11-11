package com.app.invoice.service;
import java.util.List;
import java.util.Optional;

import com.app.invoice.datatable.Page;
import com.app.invoice.datatable.PagingRequest;
import com.app.invoice.model.Cte;


public interface CteService {

    Page<Cte> getPaginatedDatatable(PagingRequest pagingRequest);

    Optional<Cte> findById(String cliente);

    Cte save(Cte cte);

}
