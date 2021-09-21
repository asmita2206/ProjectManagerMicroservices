package com.bluescript.inquirydetails.controller;

import com.bluescript.inquirydetails.entity.InquiryDetailsEntity;
import com.bluescript.inquirydetails.request.InquiryDetailsRequest;
import com.bluescript.inquirydetails.response.InquiryDetailsDeleteResponse;
import com.bluescript.inquirydetails.service.InquiryDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inquiryDetails")
public class InquiryDetailsController {

    @Autowired
    InquiryDetailsService inquiryDetailsService;

    @PostMapping
    public InquiryDetailsEntity createInquiry(@RequestBody InquiryDetailsRequest inquiryDetailsRequest){
        return inquiryDetailsService.createInquiry(inquiryDetailsRequest);
    }

    @GetMapping("/{inquiryId}")
    public InquiryDetailsEntity getInquiry(@PathVariable ("inquiryId") String inquiryId){
        return inquiryDetailsService.getInquiry(inquiryId);
    }

    @DeleteMapping("/{inquiryId}")
    public InquiryDetailsDeleteResponse deleteInquiry(@PathVariable ("inquiryId") String inquiryId){
        return inquiryDetailsService.deleteInquiry(inquiryId);
    }

    @PutMapping("/{inquiryId}")
    public InquiryDetailsEntity updateInquiry(@PathVariable ("inquiryId") String inquiryId,@RequestBody InquiryDetailsRequest inquiryDetailsRequest){
        return inquiryDetailsService.updateInquiry(inquiryId,inquiryDetailsRequest);

    }
}
