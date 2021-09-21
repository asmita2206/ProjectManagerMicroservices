package com.bluescript.projectdetails.repository;

import com.bluescript.projectdetails.entity.ProjectDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectDetailRepo extends JpaRepository<ProjectDetailsEntity,String> {

  Optional<ProjectDetailsEntity> findByProjectId(String projectId);
    List<ProjectDetailsEntity> findByprojectId(String projectId);

    List<ProjectDetailsEntity> findByCompanyId(String companyId);
    Optional<ProjectDetailsEntity> findBycompanyId(String companyId);
}
