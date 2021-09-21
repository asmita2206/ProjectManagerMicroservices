package com.bluescript.usermanagement.controller;

import com.bluescript.usermanagement.constants.StringConstants;
import com.bluescript.usermanagement.entity.UserAssociationEntity;
import com.bluescript.usermanagement.request.UserAssociationRequest;
import com.bluescript.usermanagement.response.UserAssociationDeleteResponse;
import com.bluescript.usermanagement.service.UserAssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/UserAssociation")
public class UserAssociationController {
    @Autowired
    UserAssociationService associationService;

    @PostMapping
    public UserAssociationEntity createAssociation(@RequestBody UserAssociationRequest associationRequest){
        return associationService.createAssociation(associationRequest);
    }

    @GetMapping("/{userAssociationId}")
    public UserAssociationEntity getAssociation(@PathVariable ("userAssociationId") String userAssociationId){
        return associationService.getAssociation(userAssociationId);
    }

    @GetMapping("/get/{projectId}")
    public List<UserAssociationEntity> getAssociationBy(@PathVariable ("projectId") String projectId){
        return associationService.getAssociationBy(projectId);
    }

    @DeleteMapping("{userAssociationId}")
    public UserAssociationDeleteResponse deleteAssociation(@PathVariable ("userAssociationId")String userAssociationId){
        return associationService.deleteAssociation(userAssociationId);
    }

   @PutMapping("/{userAssociationId}")
    public UserAssociationEntity updateAssociation(@PathVariable ("userAssociationId") String userAssociationId,@RequestBody UserAssociationRequest associationRequest){
        return associationService.updateAssociation(userAssociationId,associationRequest);
   }
}
