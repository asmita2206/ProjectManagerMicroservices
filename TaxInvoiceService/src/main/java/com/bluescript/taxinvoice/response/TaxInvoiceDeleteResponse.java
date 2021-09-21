package com.bluescript.taxinvoice.response;

public class TaxInvoiceDeleteResponse {

    public String taxInvoiceId;
    private boolean taxInvoiceIdDeleted;

    public TaxInvoiceDeleteResponse(String taxInvoiceId, boolean taxInvoiceIdDeleted) {
        this.taxInvoiceId = taxInvoiceId;
        this.taxInvoiceIdDeleted = taxInvoiceIdDeleted;
    }

    public String getTaxInvoiceId() {
        return taxInvoiceId;
    }

    public void setTaxInvoiceId(String taxInvoiceId) {
        this.taxInvoiceId = taxInvoiceId;
    }

    public boolean isTaxInvoiceIdDeleted() {
        return taxInvoiceIdDeleted;
    }

    public void setTaxInvoiceIdDeleted(boolean taxInvoiceIdDeleted) {
        this.taxInvoiceIdDeleted = taxInvoiceIdDeleted;
    }
}
