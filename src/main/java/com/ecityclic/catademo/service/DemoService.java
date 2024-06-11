package com.ecityclic.catademo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecityclic.catademo.entities.EmployeeEntity;
import com.ecityclic.catademo.repository.EmployeeRepository;

@Service
public class DemoService extends BaseService<EmployeeEntity>{
	
	public EmployeeEntity getEmployeeEntity(long id) {
		return ((EmployeeRepository)this.repository).findById(id);
	}
	
	public EmployeeEntity saveEmployeeEntity(EmployeeEntity employee){
		return ((EmployeeRepository)this.repository).save(employee); // el mètode save estè predefinit per springboot JPA
	}
	
	
	public List<EmployeeEntity> getEmployeesByName(String name){
		return ((EmployeeRepository)this.repository).findByName(name);
	}
	
	public EmployeeEntity deleteEmployeeById(long id) {
		return ((EmployeeRepository)this.repository).deleteById(id);
	}
	
}
