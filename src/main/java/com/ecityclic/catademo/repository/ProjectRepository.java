package com.ecityclic.catademo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecityclic.catademo.entities.EmployeeEntity;
import com.ecityclic.catademo.entities.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
	public ProjectEntity findById(long id);
	
}
