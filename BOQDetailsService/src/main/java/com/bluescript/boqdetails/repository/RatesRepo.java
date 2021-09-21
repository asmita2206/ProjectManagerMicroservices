package com.bluescript.boqdetails.repository;

import com.bluescript.boqdetails.entity.RatesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RatesRepo extends JpaRepository<RatesEntity,String> {

   Optional<RatesEntity> findByratesId(String ratesId);
}
