package com.bluescript.boqdetails.controller;

import com.bluescript.boqdetails.entity.BOQDetailsEntity;
import com.bluescript.boqdetails.request.BOQDetailsRequest;
import com.bluescript.boqdetails.response.BOQDetailsDeleteResponse;
import com.bluescript.boqdetails.service.BOQDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/BOQDetails")
public class BOQDetailsController {

    @Autowired
    BOQDetailsService boqDetailsService;

    @PostMapping
    public BOQDetailsEntity createBOQ(@RequestBody BOQDetailsRequest boqDetailsRequest){
        return boqDetailsService.createBOQ(boqDetailsRequest);
    }

    @GetMapping("/{boqId}")
    public BOQDetailsEntity getBOQ(@PathVariable ("boqId") String boqId){
        return boqDetailsService.getBOQ(boqId);
    }

    @DeleteMapping("{boqId}")
    public BOQDetailsDeleteResponse deleteBOQ(@PathVariable("boqId") String boqId){
        return boqDetailsService.deleteBOQ(boqId);
    }

    @PutMapping("{boqId}")
    public BOQDetailsEntity updateBOQ(@PathVariable("boqId") String boqId,@RequestBody BOQDetailsRequest boqDetailsRequest){
        return boqDetailsService.updateBOQ(boqId,boqDetailsRequest);
    }
}
