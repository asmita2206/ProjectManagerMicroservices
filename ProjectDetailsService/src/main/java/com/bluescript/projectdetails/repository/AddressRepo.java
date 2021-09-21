package com.bluescript.projectdetails.repository;
import com.bluescript.projectdetails.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepo extends JpaRepository<AddressEntity,Integer> {

    List<AddressEntity> findByProjectId(String projectId);
    AddressEntity findByprojectId(String projectId);
    AddressEntity findByAddressId(int addressId);
}
