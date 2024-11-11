package com.app.invoice.service;

import com.app.invoice.datatable.Page;
import com.app.invoice.datatable.PagingRequest;
import com.app.invoice.model.Alm;
import com.app.invoice.model.Art;

public interface ArtService {

    Page<Art> getPaginatedDatatable(PagingRequest pagingRequest);

}
