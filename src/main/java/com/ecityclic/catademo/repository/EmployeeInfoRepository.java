package com.ecityclic.catademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecityclic.catademo.entities.EmployeeInfoEntity;
import com.ecityclic.catademo.entities.ProjectEntity;

public interface EmployeeInfoRepository extends JpaRepository<EmployeeInfoEntity, Long> {
	public EmployeeInfoEntity findById(long id);
	
	public EmployeeInfoEntity findByEeDni(@Param("dni") String dni);
}
