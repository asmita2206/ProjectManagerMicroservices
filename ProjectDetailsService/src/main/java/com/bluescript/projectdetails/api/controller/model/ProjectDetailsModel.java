package com.bluescript.projectdetails.api.controller.model;

public class ProjectDetailsModel {

    private String projectId;
    private String clientId;
    private String companyId;
    private String projectName;
    private String clientName;


    public ProjectDetailsModel() {
    }

    public ProjectDetailsModel(String projectId, String clientId, String companyId, String projectName, String clientName) {
        this.projectId = projectId;
        this.clientId = clientId;
        this.companyId = companyId;
        this.projectName = projectName;
        this.clientName = clientName;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "ProjectDetailsModel{" +
                "projectId=" + projectId +
                ", clientId=" + clientId +
                ", companyId=" + companyId +
                ", projectName='" + projectName + '\'' +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
