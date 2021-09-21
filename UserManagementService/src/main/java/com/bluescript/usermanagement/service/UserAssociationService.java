package com.bluescript.usermanagement.service;

import com.bluescript.usermanagement.constants.StringConstants;
import com.bluescript.usermanagement.entity.UserAssociationEntity;
import com.bluescript.usermanagement.exception.NoRecordFoundException;
import com.bluescript.usermanagement.repository.UserAssociationRepo;
import com.bluescript.usermanagement.request.UserAssociationRequest;
import com.bluescript.usermanagement.response.UserAssociationDeleteResponse;
import com.bluescript.usermanagement.utils.UserManagementUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAssociationService {

    @Autowired
    UserAssociationRepo associationRepo;

    public UserAssociationEntity createAssociation(UserAssociationRequest associationRequest) {

        String userAssociationId= UserManagementUtils.generateId(StringConstants.userAssociationId_prefix);
        UserAssociationEntity associationEntity=new UserAssociationEntity();
        associationEntity.setUserAssociationId(userAssociationId);
        associationEntity.setUserName(associationRequest.getUserName());
        associationEntity.setCompanyId(associationRequest.getCompanyId());
        associationEntity.setProjectId(associationRequest.getProjectId());
        associationEntity.setRole(associationRequest.getRole());

        return associationRepo.save(associationEntity);
    }

    public UserAssociationEntity getAssociation(String userAssociationId) {

        UserAssociationEntity associationEntity=associationRepo.findByuserAssociationId(userAssociationId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +userAssociationId);
        });
        return associationEntity;
    }

    public List<UserAssociationEntity> getAssociationBy(String projectId) {

        List<UserAssociationEntity> associationEntity=associationRepo.findByprojectId(projectId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +projectId);
        });
        return associationEntity;
    }

    public UserAssociationDeleteResponse deleteAssociation(String userAssociationId) {

        UserAssociationEntity associationEntity=associationRepo.findByuserAssociationId(userAssociationId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +userAssociationId);
        });
        UserAssociationDeleteResponse deleteResponse=new UserAssociationDeleteResponse(userAssociationId,true);
        associationEntity.setDeleted(true);
        associationRepo.save(associationEntity);
       // associationRepo.delete(associationEntity);
        return deleteResponse;
    }

    public UserAssociationEntity updateAssociation(String userAssociationId, UserAssociationRequest associationRequest) {

        UserAssociationEntity associationEntity=associationRepo.findByuserAssociationId(userAssociationId).orElseThrow(()->{
            return new NoRecordFoundException("no_record_found :" +userAssociationId);
        });

        associationEntity.getUserAssociationId();
        associationEntity.setUserName(associationRequest.getUserName());
        associationEntity.setCompanyId(associationRequest.getCompanyId());
        associationEntity.setProjectId(associationRequest.getProjectId());
        associationEntity.setRole(associationRequest.getRole());

        return associationRepo.save(associationEntity);


    }
}
