package com.bluescript.usermanagement.model;

public class UserAssociationModel {

    private String userAssociationId;
    private String userName;
    private String role;
    private String companyId;
    private String projectId;
    private String deleted;

    public UserAssociationModel() {
    }

    public UserAssociationModel(String userAssociationId, String userName, String role, String companyId, String projectId, String deleted) {
        this.userAssociationId = userAssociationId;
        this.userName = userName;
        this.role = role;
        this.companyId = companyId;
        this.projectId = projectId;
        this.deleted = deleted;
    }

    public String getUserAssociationId() {
        return userAssociationId;
    }

    public void setUserAssociationId(String userAssociationId) {
        this.userAssociationId = userAssociationId;
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

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}
