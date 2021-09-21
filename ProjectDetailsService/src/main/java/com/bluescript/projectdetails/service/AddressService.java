package com.bluescript.projectdetails.service;

import com.bluescript.projectdetails.api.controller.request.AddressRequest;
import com.bluescript.projectdetails.constants.StringConstants;
import com.bluescript.projectdetails.entity.AddressEntity;
import com.bluescript.projectdetails.repository.AddressRepo;
import com.bluescript.projectdetails.utils.ProjectDetailsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    public AddressEntity getAddressBy(String projectId) {
      AddressEntity addressEntity= addressRepo.findByprojectId(projectId);

       if(addressEntity==null)
           return addressEntity;
       else
           ResponseEntity.status(HttpStatus.NOT_FOUND);
           return addressEntity;
    }

    public AddressEntity insertAddress(AddressRequest addressRequest) {

        String projectId= ProjectDetailsUtils.generateId(StringConstants.projectId_prefix);
        AddressEntity addressEntity=new AddressEntity();
        addressEntity.setProjectId(projectId);
        addressEntity.setAddressType(addressRequest.getAddressType());
        addressEntity.setLine1(addressRequest.getLine1());
        addressEntity.setLine2(addressRequest.getLine2());
        addressEntity.setLine3(addressRequest.getLine3());
        addressEntity.setPincode(addressRequest.getPincode());

        return addressRepo.save(addressEntity);


    }

    public void deleteAddressBy(int addressId) {
        AddressEntity addressEntity=addressRepo.findByAddressId(addressId);
        if(addressEntity!=null) {
            addressRepo.delete(addressEntity);}
    }

    public ResponseEntity<AddressEntity> updateOrsave(int addressId,AddressRequest addressRequest) {


        AddressEntity addressEntity = addressRepo.findByAddressId(addressId);
        if (addressEntity != null) {
            addressEntity.setPincode(addressRequest.getPincode());
            addressEntity.setLine1(addressRequest.getLine1());
            addressEntity.setLine2(addressRequest.getLine2());
            addressEntity.setLine3(addressRequest.getLine3());
            addressEntity.setAddressType(addressRequest.getAddressType());
            addressEntity.getAddressId();
            addressEntity.getProjectId();
            return new ResponseEntity<>(addressRepo.save(addressEntity),HttpStatus.OK);

        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<AddressEntity> update(String projectId, AddressRequest addressRequest) {

        AddressEntity addressEntity = addressRepo.findByprojectId(projectId);
        if (addressEntity != null) {
            addressEntity.setPincode(addressRequest.getPincode());
            addressEntity.setLine1(addressRequest.getLine1());
            addressEntity.setLine2(addressRequest.getLine2());
            addressEntity.setLine3(addressRequest.getLine3());
            addressEntity.setAddressType(addressRequest.getAddressType());
            addressEntity.getAddressId();
            addressEntity.getProjectId();
            return new ResponseEntity<>(addressRepo.save(addressEntity),HttpStatus.OK);

        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
