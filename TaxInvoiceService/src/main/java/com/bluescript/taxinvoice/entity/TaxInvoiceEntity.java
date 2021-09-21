package com.bluescript.taxinvoice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tax_invoice")
public class TaxInvoiceEntity {

    @Id
    public String taxInvoiceId;
    public String taxInvoiceDate;
    public String taxInvoiceType;
    public String hsnOrSac;
    public String gstTotal;
    public String gst;
    public String totalAmount;
    public String miscChargesDesc;
    public String miscCharges;
    public String companyId;
    public String projectContactId;
    public String projectId;
    public String purchaseOrderId;

    public TaxInvoiceEntity() {
    }

    public TaxInvoiceEntity(String taxInvoiceId, String taxInvoiceDate, String taxInvoiceType, String hsnOrSac, String gstTotal, String gst, String totalAmount, String miscChargesDesc, String miscCharges, String companyId, String projectContactId, String projectId, String purchaseOrderId) {
        this.taxInvoiceId = taxInvoiceId;
        this.taxInvoiceDate = taxInvoiceDate;
        this.taxInvoiceType = taxInvoiceType;
        this.hsnOrSac = hsnOrSac;
        this.gstTotal = gstTotal;
        this.gst = gst;
        this.totalAmount = totalAmount;
        this.miscChargesDesc = miscChargesDesc;
        this.miscCharges = miscCharges;
        this.companyId = companyId;
        this.projectContactId = projectContactId;
        this.projectId = projectId;
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getTaxInvoiceId() {
        return taxInvoiceId;
    }

    public void setTaxInvoiceId(String taxInvoiceId) {
        this.taxInvoiceId = taxInvoiceId;
    }

    public String getTaxInvoiceDate() {
        return taxInvoiceDate;
    }

    public void setTaxInvoiceDate(String taxInvoiceDate) {
        this.taxInvoiceDate = taxInvoiceDate;
    }

    public String getTaxInvoiceType() {
        return taxInvoiceType;
    }

    public void setTaxInvoiceType(String taxInvoiceType) {
        this.taxInvoiceType = taxInvoiceType;
    }

    public String getHsnOrSac() {
        return hsnOrSac;
    }

    public void setHsnOrSac(String hsnOrSac) {
        this.hsnOrSac = hsnOrSac;
    }

    public String getGstTotal() {
        return gstTotal;
    }

    public void setGstTotal(String gstTotal) {
        this.gstTotal = gstTotal;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getMiscChargesDesc() {
        return miscChargesDesc;
    }

    public void setMiscChargesDesc(String miscChargesDesc) {
        this.miscChargesDesc = miscChargesDesc;
    }

    public String getMiscCharges() {
        return miscCharges;
    }

    public void setMiscCharges(String miscCharges) {
        this.miscCharges = miscCharges;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getProjectContactId() {
        return projectContactId;
    }

    public void setProjectContactId(String projectContactId) {
        this.projectContactId = projectContactId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    @Override
    public String toString() {
        return "TaxInvoiceModel{" +
                "taxInvoiceId='" + taxInvoiceId + '\'' +
                ", taxInvoiceDate='" + taxInvoiceDate + '\'' +
                ", taxInvoiceType='" + taxInvoiceType + '\'' +
                ", hsnOrSac='" + hsnOrSac + '\'' +
                ", gstTotal='" + gstTotal + '\'' +
                ", gst='" + gst + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", miscChargesDesc='" + miscChargesDesc + '\'' +
                ", miscCharges='" + miscCharges + '\'' +
                ", companyId='" + companyId + '\'' +
                ", projectContactId='" + projectContactId + '\'' +
                ", projectId='" + projectId + '\'' +
                ", purchaseOrderId='" + purchaseOrderId + '\'' +
                '}';
    }
}
