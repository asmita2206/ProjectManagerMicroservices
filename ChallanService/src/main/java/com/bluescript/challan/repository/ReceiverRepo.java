package com.bluescript.challan.repository;

import com.bluescript.challan.entity.ReceiverEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReceiverRepo extends JpaRepository<ReceiverEntity,String> {

   Optional <ReceiverEntity>findByreceiverId(String receiverId);
}
