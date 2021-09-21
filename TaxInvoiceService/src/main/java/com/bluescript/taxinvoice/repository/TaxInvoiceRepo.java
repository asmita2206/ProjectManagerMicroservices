package com.bluescript.taxinvoice.repository;

import com.bluescript.taxinvoice.entity.TaxInvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaxInvoiceRepo extends JpaRepository<TaxInvoiceEntity,String> {

  Optional<TaxInvoiceEntity> findBytaxInvoiceId(String taxInvoiceId);

  Optional<List<TaxInvoiceEntity>>findByprojectId(String projectId);
}
