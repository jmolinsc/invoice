package com.app.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.invoice.datatable.Page;
import com.app.invoice.datatable.PagingRequest;
import com.app.invoice.datatable.PagingUtil;
import com.app.invoice.model.Alm;
import com.app.invoice.repository.AlmRepository;

@Service
public class AlmServiceImpl implements AlmService {

    @Autowired
    AlmRepository almRepository;

    @Override
    public Page<Alm> getPaginatedDatatable(PagingRequest pagingRequest) {
        //Mapping DataTables PagingRequest to spring's Pageable
        Pageable pageable = PagingUtil.toPageable(pagingRequest);
        String searchTerm = PagingUtil.toSearchTerm(pagingRequest);

        org.springframework.data.domain.Page<Alm> filteredRecordsPage
                = almRepository.getPagedData_jpql(searchTerm, pageable);

        int availableFilteredRecords = (int) filteredRecordsPage.getTotalElements();
        int totalRecords = (int) almRepository.count();

        return new Page<>(filteredRecordsPage.getContent(), availableFilteredRecords, totalRecords);
    }

}
