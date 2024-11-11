package com.app.invoice.service;

import java.util.List;

import com.app.invoice.datatable.Page;
import com.app.invoice.datatable.PagingRequest;
import com.app.invoice.model.Alm;

public interface AlmService {

    Page<Alm> getPaginatedDatatable(PagingRequest pagingRequest);
   
}
