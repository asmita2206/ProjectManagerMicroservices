package com.bluescript.boqdetails.repository;

import com.bluescript.boqdetails.entity.BOQDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BOQDetailsRepo extends JpaRepository<BOQDetailsEntity,String> {

   Optional <BOQDetailsEntity> findByboqId(String boqId);
}
