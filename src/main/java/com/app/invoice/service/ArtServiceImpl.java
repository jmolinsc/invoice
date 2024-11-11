package com.app.invoice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.invoice.datatable.Page;
import com.app.invoice.datatable.PagingRequest;
import com.app.invoice.datatable.PagingUtil;
import com.app.invoice.model.Art;
import com.app.invoice.repository.ArtRepository;


@Service
public class ArtServiceImpl implements ArtService {

    @Autowired
    ArtRepository artRepository;

    @Override
    public Page<Art> getPaginatedDatatable(PagingRequest pagingRequest) {

        // Mapping DataTables PagingRequest to spring's Pageable
        Pageable pageable = PagingUtil.toPageable(pagingRequest);
        String searchTerm = PagingUtil.toSearchTerm(pagingRequest);

        org.springframework.data.domain.Page<Art> filteredRecordsPage = artRepository.getPagedData_jpql(searchTerm,
                pageable);

        int availableFilteredRecords = (int) filteredRecordsPage.getTotalElements();
        int totalRecords = (int) artRepository.count();

        return new Page<>(filteredRecordsPage.getContent(), availableFilteredRecords, totalRecords);
    }

}
