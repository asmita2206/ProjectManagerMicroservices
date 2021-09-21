package com.bluescript.usermanagement.service;

import com.bluescript.usermanagement.entity.UserCredentialsEntity;
import com.bluescript.usermanagement.exception.NoRecordFoundException;
import com.bluescript.usermanagement.repository.UserCredentialsRepo;
import com.bluescript.usermanagement.request.UserCredentialsRequest;
import com.bluescript.usermanagement.response.UserCredentialsDeleteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCredentialsService {

    @Autowired
    UserCredentialsRepo credentialsRepo;

    public UserCredentialsEntity createUser(UserCredentialsRequest credentialsRequest) {

        UserCredentialsEntity credentialsEntity=new UserCredentialsEntity();
        credentialsEntity.setUserName(credentialsRequest.getUserName());
        credentialsEntity.setPassword(credentialsRequest.getPassword());

        return credentialsRepo.save(credentialsEntity);
    }

    public UserCredentialsEntity getUser(String userName) {

        UserCredentialsEntity credentialsEntity=credentialsRepo.findByuserName(userName).orElseThrow(()->{
            return new NoRecordFoundException("invalid_userName :" +userName);
        });
        return credentialsEntity;
    }

    public UserCredentialsDeleteResponse deleteUser(String userName) {

        UserCredentialsEntity credentialsEntity=credentialsRepo.findByuserName(userName).orElseThrow(()->{
            return new NoRecordFoundException("invalid_userName :" +userName);
        });
        UserCredentialsDeleteResponse deleteResponse=new UserCredentialsDeleteResponse(userName,true);
        credentialsEntity.setDeleted(true);
        credentialsRepo.save(credentialsEntity);
      //  credentialsRepo.delete(credentialsEntity);
        return deleteResponse;
    }

    public UserCredentialsEntity updateUser(String userName,UserCredentialsRequest credentialsRequest) {
        UserCredentialsEntity credentialsEntity=credentialsRepo.findByuserName(userName).orElseThrow(()->{
            return new NoRecordFoundException("invalid_userName :" +userName);
        });

        credentialsEntity.setUserName(credentialsRequest.getUserName());
        credentialsEntity.setPassword(credentialsRequest.getPassword());

        return credentialsRepo.save(credentialsEntity);

    }
}
