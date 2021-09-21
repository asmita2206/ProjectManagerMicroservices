package com.bluescript.usermanagement.request;

public class UserAssociationRequest {

    private String userName;
    private String role;
    private String companyId;
    private String projectId;

    public UserAssociationRequest() {
    }

    public UserAssociationRequest( String userName, String role, String companyId, String projectId) {
        this.userName = userName;
        this.role = role;
        this.companyId = companyId;
        this.projectId = projectId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}
