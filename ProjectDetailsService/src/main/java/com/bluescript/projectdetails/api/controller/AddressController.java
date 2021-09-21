package com.bluescript.projectdetails.api.controller;

import com.bluescript.projectdetails.entity.AddressEntity;
import com.bluescript.projectdetails.repository.AddressRepo;
import com.bluescript.projectdetails.api.controller.request.AddressRequest;
import com.bluescript.projectdetails.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/rest/Address")
public class AddressController {

    @Autowired
    AddressRepo addressRepo;
    @Autowired
    AddressService addressService;

    @PostMapping
    public AddressEntity insertAddress(@RequestBody @Valid AddressRequest addressRequest) {

        AddressEntity addressEntity=addressService.insertAddress(addressRequest);
            return addressEntity;

    }


    @GetMapping("/{projectId}")
    public AddressEntity getAddressBy(@PathVariable("projectId")  String projectId) {

        return addressService.getAddressBy(projectId);

    }

    @DeleteMapping("/{addressId}")
    public String deleteAddressBy(@PathVariable("addressId") int addressId){

        addressService.deleteAddressBy(addressId);
        return "Your {addressId} record is deleted successfully !!";

    }


    @PutMapping("/update/{addressId}")
    public ResponseEntity< AddressEntity> updateOrsave(@PathVariable("addressId") int addressId, @Valid  @RequestBody AddressRequest addressRequest) {

        ResponseEntity<AddressEntity> addressEntity= addressService.updateOrsave(addressId,addressRequest);
       return addressEntity;


    }

    @PutMapping("/{projectId}")
    public ResponseEntity<AddressEntity> update(@PathVariable("projectId") String projectId, @Valid @RequestBody AddressRequest addressRequest){

        ResponseEntity<AddressEntity> addressEntity= addressService.update(projectId,addressRequest);
        return addressEntity;


    }


}
