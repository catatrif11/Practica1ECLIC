package com.ecityclic.catademo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ecityclic.catademo.entities.EmployeeEntity;


public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
	// FUNCIONS DE JAVA QUE SERÁN TRADUIDES A QUERYS SQL
	// MOLTES ESTÀN PREDEFINIDES
	
	public EmployeeEntity findById(long id);

	List<EmployeeEntity> findByName(String name);
	
	public EmployeeEntity deleteById(long id); // 
	
	
//	@Query("SELECT e "
//			+ "FROM EmployeeEntity e "
//			+ "WHERE e.projectId IN "
//			+ "(SELECT p.idProject"
//				+ " FROM ProjectEntity p "
//				+ "WHERE p.projectName = :projectName)")
//	List<EmployeeEntity> findEmployeesByProjectName(@Param("projectName") String projectName);
	
	
	
	// CONSULTES ENTRE DOS TAULES DIFERENTS NOMENCLATURA:
	// FindBy + "NOM_TAULA_RELACIONADA" + "COLUMNA" /||+ AND + "ALTRES_CONSULTES"
	
	List<EmployeeEntity> findByProjectProjectName(@Param("name") String name);
}
