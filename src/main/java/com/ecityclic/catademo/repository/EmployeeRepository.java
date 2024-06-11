package com.ecityclic.catademo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecityclic.catademo.entities.EmployeeEntity;


public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
	// FUNCIONS DE JAVA QUE SERÁN TRADUIDES A QUERYS SQL
	// MOLTES ESTÀN PREDEFINIDES
	
	public EmployeeEntity findById(long id);

	List<EmployeeEntity> findByName(String name);
	
	public EmployeeEntity deleteById(long id); // 

}
