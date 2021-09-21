package com.bluescript.taxinvoice.controller;

import com.bluescript.taxinvoice.constants.StringConstants;
import com.bluescript.taxinvoice.entity.TaxInvoiceEntity;
import com.bluescript.taxinvoice.request.TaxInvoiceRequest;
import com.bluescript.taxinvoice.response.TaxInvoiceDeleteResponse;
import com.bluescript.taxinvoice.service.TaxInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TaxInvoice")
public class TaxInvoiceController {

    @Autowired
    TaxInvoiceService invoiceService;

    @PostMapping
    public TaxInvoiceEntity createInvoice(@RequestBody TaxInvoiceRequest invoiceRequest){
        return invoiceService.createInvoice(invoiceRequest);
    }

    @GetMapping("/{taxInvoiceId}")
    public TaxInvoiceEntity getInvoice(@PathVariable ("taxInvoiceId") String taxInvoiceId){
        return invoiceService.getInvoice(taxInvoiceId);
    }

    @GetMapping ("/get/{projectId}")
    public List<TaxInvoiceEntity> getInvoiceBy(@PathVariable ("projectId") String projectId){
        return invoiceService.getInvoiceBy(projectId);
    }

    @DeleteMapping("/{taxInvoiceId}")
    public TaxInvoiceDeleteResponse deleteInvoice(@PathVariable ("taxInvoiceId") String taxInvoiceId ){
        return invoiceService.deleteInvoice(taxInvoiceId);
    }

    @PutMapping("/{taxInvoiceId}")
    public TaxInvoiceEntity updateInvoice(@PathVariable ("taxInvoiceId") String taxInvoiceId,@RequestBody TaxInvoiceRequest invoiceRequest){
        return invoiceService.updateInvoice(taxInvoiceId,invoiceRequest);
    }
}
