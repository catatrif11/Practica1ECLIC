package com.ecityclic.catademo.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecityclic.catademo.entities.EmployeeEntity;
import com.ecityclic.catademo.service.DemoService;

@Component
public class Helper {
	
	@Autowired
	private DemoService service;

	public EmployeeEntity getEmployee(long id) {
		return service.getEmployeeEntity(id);
	}
		
	public ResponseEntity<EmployeeEntity> saveEmployee(EmployeeEntity employee){
		return new ResponseEntity<EmployeeEntity>(service.saveEmployeeEntity(employee), HttpStatus.CREATED) ; 
	}
	
	public List<EmployeeEntity> getEmployeesByName(String name){
		return service.getEmployeesByName(name);
	}
	
	public EmployeeEntity deleteEmployee(long id) {
		return service.deleteEmployeeById(id);
		
	}
	
	public List<EmployeeEntity> getEmployeesFromProject(String name){
		return service.getEmployeesFromProject(name);
	}
		
	
}
