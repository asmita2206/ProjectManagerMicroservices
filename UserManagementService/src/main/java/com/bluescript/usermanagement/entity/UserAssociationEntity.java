package com.bluescript.usermanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_association")
public class UserAssociationEntity {

    @Id
    private String userAssociationId;
    private String userName;
    private String role;
    private String companyId;
    private String projectId;
    private boolean deleted;

    public UserAssociationEntity() {
    }

    public UserAssociationEntity(String userAssociationId, String userName, String role, String companyId, String projectId, boolean deleted) {
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

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "UserAssociationEntity{" +
                "userAssociationId='" + userAssociationId + '\'' +
                ", userName='" + userName + '\'' +
                ", role='" + role + '\'' +
                ", companyId='" + companyId + '\'' +
                ", projectId='" + projectId + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}
