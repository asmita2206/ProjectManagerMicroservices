package com.bluescript.projectdetails.response;

public class CompanyDetailsResponse {

    String companyId;
    String companyAddress;
    String companyName;

    public String getCompanyId() {
        return companyId;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CompanyDetailsResponse() {
    }
}
