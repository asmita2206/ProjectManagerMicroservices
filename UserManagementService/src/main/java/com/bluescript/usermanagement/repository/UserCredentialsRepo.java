package com.bluescript.usermanagement.repository;

import com.bluescript.usermanagement.entity.UserCredentialsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserCredentialsRepo extends JpaRepository<UserCredentialsEntity,String> {

  Optional<UserCredentialsEntity> findByuserName(String userName);
}
