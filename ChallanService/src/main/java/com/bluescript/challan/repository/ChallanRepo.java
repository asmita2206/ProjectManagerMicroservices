package com.bluescript.challan.repository;

import com.bluescript.challan.entity.ChallanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChallanRepo extends JpaRepository<ChallanEntity,String> {

   Optional<ChallanEntity> findBychallanId(String challanId);
}
