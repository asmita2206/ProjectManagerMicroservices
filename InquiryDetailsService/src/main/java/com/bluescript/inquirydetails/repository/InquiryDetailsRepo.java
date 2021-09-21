package com.bluescript.inquirydetails.repository;

import com.bluescript.inquirydetails.entity.InquiryDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InquiryDetailsRepo extends JpaRepository<InquiryDetailsEntity,String> {
   Optional <InquiryDetailsEntity> findByinquiryId(String inquiryId);
}
