package com.bluescript.projectdetails.service;

import com.bluescript.projectdetails.repository.ProjectDetailRepo;
import com.bluescript.projectdetails.constants.StringConstants;
import com.bluescript.projectdetails.entity.ProjectDetailsEntity;
import com.bluescript.projectdetails.exception.NoRecordFoundException;
import com.bluescript.projectdetails.api.controller.request.ProjectDetailRequest;
import com.bluescript.projectdetails.response.ProjectDetailResponse;
import com.bluescript.projectdetails.utils.ProjectDetailsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectDetailService {

    @Autowired
    ProjectDetailRepo projectDetailRepo;

    public ProjectDetailsEntity insertProjectDetails(ProjectDetailRequest projectDetailRequest) {

        String projectId= ProjectDetailsUtils.generateId(StringConstants.projectId_prefix);
        String clientId=ProjectDetailsUtils.generateId(StringConstants.clientId_prefix);
        String companyId=ProjectDetailsUtils.generateId(StringConstants.companyId_prefix);
        ProjectDetailsEntity projectDetailsEntity=new ProjectDetailsEntity();
        projectDetailsEntity.setProjectName(projectDetailRequest.getProjectName());
        projectDetailsEntity.setClientName(projectDetailRequest.getClientName());
        projectDetailsEntity.setClientId(clientId);
        projectDetailsEntity.setCompanyId(companyId);
        projectDetailsEntity.setProjectId(projectId);

        return projectDetailRepo.save(projectDetailsEntity);
    }


   /* public List<ProjectDetailsModel> getDetailsby(String companyId) {
        List<ProjectDetailsModel> projectDetailsModels=projectDetailRepo.findByCompanyId(companyId);

        if(!projectDetailsModels.isEmpty())
            return projectDetailsModels;
        else
            ResponseEntity.status(HttpStatus.NOT_FOUND);
        return projectDetailsModels;
    }
*/
    public ProjectDetailsEntity getDetails(String projectId) throws NoRecordFoundException {
        ProjectDetailsEntity projectDetailsEntity = projectDetailRepo.findByProjectId(projectId).orElseThrow(()->{
           return new NoRecordFoundException("no_Id_forund :" +projectId);
       });

        return projectDetailsEntity;
    }


    public ProjectDetailResponse deleteProjectDetails(String projectId) throws NoRecordFoundException {

        ProjectDetailsEntity projectDetailsEntity = projectDetailRepo.findByProjectId(projectId).orElseThrow(()->{
            return new NoRecordFoundException("no_Id_forund :" +projectId);
        });
        ProjectDetailResponse projectDetailResponse=new ProjectDetailResponse(projectId,true);

        projectDetailsEntity.getProjectId();
            projectDetailRepo.delete(projectDetailsEntity);
            return projectDetailResponse;

    }

    public ProjectDetailsEntity updateOrsave(String companyId, ProjectDetailRequest projectDetailRequest) throws NoRecordFoundException {

        ProjectDetailsEntity projectDetailsEntity=projectDetailRepo.findBycompanyId(companyId).orElseThrow(()->{
            return new NoRecordFoundException("NO_Id_found" +companyId);
        });

        projectDetailsEntity.setProjectName(projectDetailRequest.getProjectName());
        projectDetailsEntity.setClientName(projectDetailRequest.getClientName());
        projectDetailsEntity.getProjectId();
            return projectDetailRepo.save(projectDetailsEntity);
    }

    public ProjectDetailsEntity updateOrsaveBy(String projectId, ProjectDetailRequest projectDetailRequest) throws NoRecordFoundException {

        ProjectDetailsEntity projectDetailsEntity = projectDetailRepo.findByProjectId(projectId).orElseThrow(()->{
            return new NoRecordFoundException("no_Id_forund :" +projectId);
        });

        projectDetailsEntity.setProjectName(projectDetailRequest.getProjectName());
        projectDetailsEntity.setClientName(projectDetailRequest.getClientName());
        projectDetailsEntity.getCompanyId();
            return projectDetailRepo.save(projectDetailsEntity);

    }
}
