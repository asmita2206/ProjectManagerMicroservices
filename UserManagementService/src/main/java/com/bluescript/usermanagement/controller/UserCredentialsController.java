package com.bluescript.usermanagement.controller;

import com.bluescript.usermanagement.entity.UserCredentialsEntity;
import com.bluescript.usermanagement.request.UserCredentialsRequest;
import com.bluescript.usermanagement.response.UserCredentialsDeleteResponse;
import com.bluescript.usermanagement.service.UserCredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/UserCredentials")
public class UserCredentialsController {

    @Autowired
    UserCredentialsService credentialsService;

    @PostMapping
    public UserCredentialsEntity createUser(@RequestBody UserCredentialsRequest credentialsRequest){
        return credentialsService.createUser(credentialsRequest);
    }

    @GetMapping("/{userName}")
    public UserCredentialsEntity getUser(@PathVariable ("userName") String userName){
        return credentialsService.getUser(userName);
    }

    @DeleteMapping("/{userName}")
    public UserCredentialsDeleteResponse deleteUser(@PathVariable ("userName") String userName){
        return credentialsService.deleteUser(userName);
    }

    @PutMapping("/{userName}")
    public UserCredentialsEntity updateUser(@PathVariable ("userName") String userName,@RequestBody UserCredentialsRequest credentialsRequest){
        return credentialsService.updateUser(userName,credentialsRequest);
    }
}

