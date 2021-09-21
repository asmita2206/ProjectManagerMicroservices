package com.bluescript.projectdetails.repository;

import com.bluescript.projectdetails.entity.ProjectContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectContactRepo extends JpaRepository<ProjectContactEntity,Integer> {

    List<ProjectContactEntity> findByProjectId(String projectId);
    ProjectContactEntity findByprojectId(String projectId);
    ProjectContactEntity findByProjectContactId(int projectContactId);
}
