package com.bluescript.challan.repository;

import com.bluescript.challan.entity.TransportationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransportationRepo extends JpaRepository<TransportationEntity,String> {

   Optional<TransportationEntity>findBytransportationId(String transportationId);
}
