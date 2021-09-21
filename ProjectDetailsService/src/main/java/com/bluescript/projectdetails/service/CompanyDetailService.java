package com.bluescript.projectdetails.service;

import com.bluescript.projectdetails.constants.StringConstants;
import com.bluescript.projectdetails.utils.ProjectDetailsUtils;
import com.bluescript.projectdetails.entity.CompanyDetailsEntity;
import com.bluescript.projectdetails.repository.CompanyDetailsRepo;
import com.bluescript.projectdetails.api.controller.request.CompanyDetailsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyDetailService {

    @Autowired
    CompanyDetailsRepo companyDetailsRepo;
    @Autowired
    StringConstants stringConstants;

    public CompanyDetailsEntity insertCompanyDetails(CompanyDetailsRequest companyDetailsRequest) {
        //String companyId = className.generate(classsnaME.COMAPNY_ID_PREFIX);
         String companyId= ProjectDetailsUtils.generateId(StringConstants.companyId_prefix);

         System.out.println(companyId);
        CompanyDetailsEntity companyDetailsEntity =new CompanyDetailsEntity();
        companyDetailsEntity.setCompanyId(companyId);
        companyDetailsEntity.setCompanyName(companyDetailsRequest.getCompanyName());
        companyDetailsEntity.setCompanyAddress(companyDetailsRequest.getCompanyAddress());
        return companyDetailsRepo.save(companyDetailsEntity);

    }

   public List<CompanyDetailsEntity> getCompanyDetails(String companyId) {
        List<CompanyDetailsEntity> companyDetailsEntity = companyDetailsRepo.findByCompanyId(companyId);

        if (!companyDetailsEntity.isEmpty()) {
            return companyDetailsEntity;

        } else
             ResponseEntity.status(HttpStatus.NOT_FOUND);
        return companyDetailsEntity;

    }


    public CompanyDetailsEntity deleteCompanyDetailsBy(String companyId) {
        CompanyDetailsEntity companyDetailsEntity = companyDetailsRepo.findBycompanyId(companyId);

           if (companyDetailsEntity != null)
               companyDetailsEntity.getCompanyId();
            companyDetailsRepo.delete(companyDetailsEntity);

           return companyDetailsEntity;

    }

    public ResponseEntity<CompanyDetailsEntity> updateOrSaveBy(String companyId, CompanyDetailsRequest companyDetailsRequest) {
        CompanyDetailsEntity companyDetailsEntity= companyDetailsRepo.findBycompanyId(companyId);
        if(companyDetailsEntity!=null) {
            companyDetailsEntity.setCompanyName(companyDetailsRequest.getCompanyName());
            companyDetailsEntity.setCompanyAddress(companyDetailsRequest.getCompanyAddress());
            companyDetailsEntity.getCompanyId();
            // companyDetailsModel1.setCompanyId(companyDetailsModel.getCompanyId());
            return new ResponseEntity<>(companyDetailsRepo.save(companyDetailsEntity), HttpStatus.OK);
        }else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}




