package com.bluescript.projectdetails.repository;

import com.bluescript.projectdetails.entity.CompanyDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyDetailsRepo extends JpaRepository<CompanyDetailsEntity,String> {

  CompanyDetailsEntity findBycompanyId(String companyId);
  List<CompanyDetailsEntity> findByCompanyId(String companyId);

}
