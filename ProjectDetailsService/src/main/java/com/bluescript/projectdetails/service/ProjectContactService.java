package com.bluescript.projectdetails.service;

import com.bluescript.projectdetails.api.controller.request.ProjectContactRequest;
import com.bluescript.projectdetails.constants.StringConstants;
import com.bluescript.projectdetails.entity.ProjectContactEntity;
import com.bluescript.projectdetails.repository.ProjectContactRepo;
import com.bluescript.projectdetails.utils.ProjectDetailsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectContactService {

    @Autowired
    ProjectContactRepo projectContactRepo;

    public ProjectContactEntity insertProjectContact(ProjectContactRequest projectContactRequest) {

        String projectId= ProjectDetailsUtils.generateId(StringConstants.projectId_prefix);
        ProjectContactEntity projectContactEntity=new ProjectContactEntity();
        projectContactEntity.setProjectId(projectId);
        projectContactEntity.setContactType(projectContactRequest.getContactType());
        projectContactEntity.setContactNumber(projectContactRequest.getContactNumber());
        projectContactEntity.setContactName(projectContactRequest.getContactName());
        projectContactEntity.setContactEmail(projectContactRequest.getContactEmail());

        return projectContactRepo.save(projectContactEntity);
    }

    public List<ProjectContactEntity> getContactDetails(String projectId) {
        List<ProjectContactEntity> projectContactEntity=projectContactRepo.findByProjectId(projectId);

        if(!projectContactEntity.isEmpty())
            return projectContactEntity;
        else
            //return new  ResponseEntity<>"not found {}" +projectId,HttpStatus.NOT_FOUND);
            ResponseEntity.status(HttpStatus.NOT_FOUND);
         return projectContactEntity;
    }

    public ProjectContactEntity getContactDetailsById(int projectContactId ) {
        ProjectContactEntity projectContactEntity= projectContactRepo.findByProjectContactId(projectContactId);

        if(projectContactEntity!=null)
           return projectContactEntity;
        else
             ResponseEntity.status(HttpStatus.NOT_FOUND);
        return projectContactEntity;
    }

    public ProjectContactEntity deleteProjectContact(int projectContactId) {

        ProjectContactEntity projectContactEntity=projectContactRepo.findByProjectContactId(projectContactId);
        if(projectContactEntity!=null)
            projectContactRepo.delete(projectContactEntity);
        return projectContactEntity;
    }

    public ResponseEntity<ProjectContactEntity> updateOrsave(int projectContactId, ProjectContactRequest projectContactRequest) {

        ProjectContactEntity projectContactEntity=projectContactRepo.findByProjectContactId(projectContactId);

        if(projectContactEntity!=null) {
            projectContactEntity.setContactEmail(projectContactRequest.getContactEmail());
            projectContactEntity.setContactName(projectContactRequest.getContactName());
            projectContactEntity.setContactNumber(projectContactRequest.getContactNumber());
            projectContactEntity.setContactType(projectContactRequest.getContactType());
            projectContactEntity.getProjectId();
            return new ResponseEntity<>(projectContactRepo.save(projectContactEntity), HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<ProjectContactEntity> updateOrsaveBy(String projectId, ProjectContactRequest projectContactRequest) {

        ProjectContactEntity projectContactEntity=projectContactRepo.findByprojectId(projectId);
        if(projectContactEntity!=null) {
            projectContactEntity.setContactEmail(projectContactRequest.getContactEmail());
            projectContactEntity.setContactName(projectContactRequest.getContactName());
            projectContactEntity.setContactNumber(projectContactRequest.getContactNumber());
            projectContactEntity.setContactType(projectContactRequest.getContactType());
            projectContactEntity.getProjectId();
            return new ResponseEntity<>(projectContactRepo.save(projectContactEntity), HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
