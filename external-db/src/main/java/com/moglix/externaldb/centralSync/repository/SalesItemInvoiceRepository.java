package com.moglix.externaldb.centralSync.repository;

import com.moglix.externaldb.centralSync.entity.SalesItemInvoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesItemInvoiceRepository extends JpaRepository<SalesItemInvoice, Integer> {
}