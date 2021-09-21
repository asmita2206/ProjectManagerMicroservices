package com.bluescript.usermanagement.repository;

import com.bluescript.usermanagement.entity.UserAssociationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserAssociationRepo extends JpaRepository<UserAssociationEntity,String> {

 Optional<UserAssociationEntity> findByuserAssociationId(String userAssociationId);

   Optional <List<UserAssociationEntity>> findByprojectId(String projectId);
}
