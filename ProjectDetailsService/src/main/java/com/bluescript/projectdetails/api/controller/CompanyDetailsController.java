package com.bluescript.projectdetails.api.controller;

import com.bluescript.projectdetails.service.CompanyDetailService;
import com.bluescript.projectdetails.entity.CompanyDetailsEntity;
import com.bluescript.projectdetails.repository.CompanyDetailsRepo;
import com.bluescript.projectdetails.api.controller.request.CompanyDetailsRequest;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/rest/CompanyDetails")
public class CompanyDetailsController {

    @Autowired
    CompanyDetailsRepo companyDetailsRepo;
    @Autowired
    CompanyDetailService companyDetailService;

    @PostMapping
    public CompanyDetailsEntity insertCompanyDetails(@RequestBody @Valid CompanyDetailsRequest companyDetailsRequest) {

        CompanyDetailsEntity companyDetailsEntity= companyDetailService.insertCompanyDetails(companyDetailsRequest);


        return companyDetailsEntity;


    }


    @GetMapping("/{companyId}")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "Data not Found")})

    public List<CompanyDetailsEntity> getCompanyDetailsBy(@PathVariable("companyId") String companyId) {


        return companyDetailService.getCompanyDetails(companyId);

    }

    @DeleteMapping("/{companyId}")
    public String deleteCompanyDetailsBy(@PathVariable("companyId") String companyId) {

        companyDetailService.deleteCompanyDetailsBy(companyId);
        return "Your {companyId} record is deleted successfully !!";

    }


    @PutMapping("/{companyId}")
    public ResponseEntity<CompanyDetailsEntity> updateOrSaveBy(@PathVariable("companyId") String companyId, @RequestBody @Valid CompanyDetailsRequest companyDetailsRequest) {

        ResponseEntity<CompanyDetailsEntity> companyDetailsEntity = companyDetailService.updateOrSaveBy(companyId, companyDetailsRequest);
        return companyDetailsEntity;

    }
}

