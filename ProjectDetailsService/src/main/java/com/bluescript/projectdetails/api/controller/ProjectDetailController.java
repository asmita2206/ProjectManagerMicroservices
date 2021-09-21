package com.bluescript.projectdetails.api.controller;

import com.bluescript.projectdetails.api.controller.request.ProjectDetailRequest;
import com.bluescript.projectdetails.entity.ProjectDetailsEntity;
import com.bluescript.projectdetails.exception.NoRecordFoundException;
import com.bluescript.projectdetails.repository.ProjectDetailRepo;
import com.bluescript.projectdetails.response.ProjectDetailResponse;
import com.bluescript.projectdetails.service.ProjectDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/rest/ProjectDetails")
public class ProjectDetailController {

    @Autowired
    ProjectDetailRepo projectDetailRepo;
    @Autowired
    ProjectDetailService projectDetailService;

    @PostMapping
    public ProjectDetailsEntity insertProjectDetails(@RequestBody @Valid ProjectDetailRequest projectDetailRequest) {

        ProjectDetailsEntity projectDetailsEntity=projectDetailService.insertProjectDetails(projectDetailRequest);
      //  return "your record is saved successfully !!";

        return projectDetailsEntity;


  }

    @GetMapping("/{projectId}")
    public ProjectDetailsEntity getDetails(@PathVariable("projectId") String projectId) throws NoRecordFoundException {

        return projectDetailService.getDetails(projectId);
    }
/*
        @GetMapping("/get/{companyId}")
        public List<ProjectDetailsModel> getDetailsby(@PathVariable("companyId")  String companyId) {

            return projectDetailService.getDetailsby(companyId);

        }*/


    @DeleteMapping("/{projectId}")
    public ProjectDetailResponse deleteProjectDetails(@PathVariable("projectId") String projectId) throws NoRecordFoundException {

       return projectDetailService.deleteProjectDetails(projectId);
       // return "Your {projectId} record is deleted successfully !!";

    }


    @PutMapping("/{companyId}")
    public ProjectDetailsEntity updateOrsave(@PathVariable("companyId") String companyId, @Valid @RequestBody ProjectDetailRequest projectDetailRequest) throws NoRecordFoundException {

      return projectDetailService.updateOrsave(companyId,projectDetailRequest);

    }

    @PutMapping("/update/{projectId}")
    public ProjectDetailsEntity updateOrsaveBy(@PathVariable("projectId") String projectId,@Valid @RequestBody ProjectDetailRequest projectDetailRequest) throws NoRecordFoundException {
         return projectDetailService.updateOrsaveBy(projectId,projectDetailRequest);


    }
}
