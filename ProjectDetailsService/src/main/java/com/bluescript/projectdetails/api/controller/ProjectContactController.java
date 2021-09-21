package com.bluescript.projectdetails.api.controller;

import com.bluescript.projectdetails.api.controller.request.ProjectContactRequest;
import com.bluescript.projectdetails.entity.ProjectContactEntity;
import com.bluescript.projectdetails.repository.ProjectContactRepo;
import com.bluescript.projectdetails.service.ProjectContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/rest/ProjectContact")
public class ProjectContactController {

    @Autowired
    ProjectContactRepo projectContactRepo;
    @Autowired
    ProjectContactService projectContactService;

    @PostMapping
    public ProjectContactEntity insertProjectContact(@RequestBody @Valid ProjectContactRequest projectContactRequest) {

        ProjectContactEntity projectContactEntity= projectContactService.insertProjectContact(projectContactRequest);
         return projectContactEntity;
    }


    @GetMapping("/get/{projectId}")
    public List<ProjectContactEntity> getContactDetails(@PathVariable("projectId") String projectId) {

        return projectContactService.getContactDetails(projectId);


    }
    @GetMapping("/{projectContactId}")
    public ProjectContactEntity getContactDetailsById(@PathVariable("projectContactId")  int projectContactId)  {

        return projectContactService.getContactDetailsById(projectContactId);
    }

    @DeleteMapping("deleteByContactId/{projectContactId}")
    public String deleteProjectContact(@PathVariable("projectContactId") int projectContactId){

          projectContactService.deleteProjectContact(projectContactId);
          return "Your {projectContactId} record is deleted successfully !!";

        }

    @PutMapping("/update/{projectContactId}")
    public ResponseEntity< ProjectContactEntity> updateOrsave(@PathVariable("projectContactId") int projectContactId,@Valid @RequestBody ProjectContactRequest projectContactRequest){

        ResponseEntity <ProjectContactEntity> projectContactEntity=projectContactService.updateOrsave(projectContactId,projectContactRequest);
        return projectContactEntity;

    }

    @PutMapping("/{projectId}")
    public ResponseEntity<ProjectContactEntity> updateOrsaveBy(@PathVariable("projectId") String projectId, @RequestBody ProjectContactRequest projectContactRequest){

        ResponseEntity <ProjectContactEntity> projectContactEntity=projectContactService.updateOrsaveBy(projectId,projectContactRequest);
        return projectContactEntity;

    }

}