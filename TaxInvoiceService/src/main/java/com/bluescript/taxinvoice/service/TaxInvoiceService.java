package com.bluescript.taxinvoice.service;

import com.bluescript.taxinvoice.constants.StringConstants;
import com.bluescript.taxinvoice.entity.TaxInvoiceEntity;
import com.bluescript.taxinvoice.exception.NoRecordFoundException;
import com.bluescript.taxinvoice.repository.TaxInvoiceRepo;
import com.bluescript.taxinvoice.request.TaxInvoiceRequest;
import com.bluescript.taxinvoice.response.TaxInvoiceDeleteResponse;
import com.bluescript.taxinvoice.utils.TaxInvoiceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxInvoiceService {

    @Autowired
    TaxInvoiceRepo invoiceRepo;

    public TaxInvoiceEntity createInvoice(TaxInvoiceRequest invoiceRequest) {

        String taxInvoiceId= TaxInvoiceUtils.generateId(StringConstants.taxInvoiceId_prefix);
        TaxInvoiceEntity invoiceEntity=new TaxInvoiceEntity();
        invoiceEntity.setTaxInvoiceId(taxInvoiceId);
        invoiceEntity.setCompanyId(invoiceRequest.getCompanyId());
        invoiceEntity.setGst(invoiceRequest.getGst());
        invoiceEntity.setGstTotal(invoiceRequest.getGstTotal());
        invoiceEntity.setHsnOrSac(invoiceRequest.getHsnOrSac());
        invoiceEntity.setMiscCharges(invoiceRequest.getMiscCharges());
        invoiceEntity.setMiscChargesDesc(invoiceRequest.getMiscChargesDesc());
        invoiceEntity.setProjectContactId(invoiceRequest.getProjectContactId());
        invoiceEntity.setProjectId(invoiceRequest.getProjectId());
        invoiceEntity.setPurchaseOrderId(invoiceRequest.getPurchaseOrderId());
        invoiceEntity.setTaxInvoiceDate(invoiceRequest.getTaxInvoiceDate());
        invoiceEntity.setTaxInvoiceType(invoiceRequest.getTaxInvoiceType());
        invoiceEntity.setTotalAmount(invoiceRequest.getTotalAmount());

        return invoiceRepo.save(invoiceEntity);
    }

    public TaxInvoiceEntity getInvoice(String taxInvoiceId) {

        TaxInvoiceEntity invoiceEntity=invoiceRepo.findBytaxInvoiceId(taxInvoiceId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +taxInvoiceId);
        });
        return invoiceEntity;
    }

    public List<TaxInvoiceEntity> getInvoiceBy(String projectId) {

        List<TaxInvoiceEntity> invoiceEntity=invoiceRepo.findByprojectId(projectId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +projectId);
        });
        return invoiceEntity;
    }

    public TaxInvoiceDeleteResponse deleteInvoice(String taxInvoiceId) {

        TaxInvoiceEntity invoiceEntity=invoiceRepo.findBytaxInvoiceId(taxInvoiceId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +taxInvoiceId);
        });
        TaxInvoiceDeleteResponse deleteResponse=new TaxInvoiceDeleteResponse(taxInvoiceId,true);
        invoiceRepo.delete(invoiceEntity);

        return deleteResponse;
    }

    public TaxInvoiceEntity updateInvoice(String taxInvoiceId,TaxInvoiceRequest invoiceRequest) {

        TaxInvoiceEntity invoiceEntity=invoiceRepo.findBytaxInvoiceId(taxInvoiceId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +taxInvoiceId);
        });

        invoiceEntity.getTaxInvoiceId();
        invoiceEntity.setCompanyId(invoiceRequest.getCompanyId());
        invoiceEntity.setGst(invoiceRequest.getGst());
        invoiceEntity.setGstTotal(invoiceRequest.getGstTotal());
        invoiceEntity.setHsnOrSac(invoiceRequest.getHsnOrSac());
        invoiceEntity.setMiscCharges(invoiceRequest.getMiscCharges());
        invoiceEntity.setMiscChargesDesc(invoiceRequest.getMiscChargesDesc());
        invoiceEntity.setProjectContactId(invoiceRequest.getProjectContactId());
        invoiceEntity.setProjectId(invoiceRequest.getProjectId());
        invoiceEntity.setPurchaseOrderId(invoiceRequest.getPurchaseOrderId());
        invoiceEntity.setTaxInvoiceDate(invoiceRequest.getTaxInvoiceDate());
        invoiceEntity.setTaxInvoiceType(invoiceRequest.getTaxInvoiceType());
        invoiceEntity.setTotalAmount(invoiceRequest.getTotalAmount());

        return invoiceRepo.save(invoiceEntity);
    }
}
