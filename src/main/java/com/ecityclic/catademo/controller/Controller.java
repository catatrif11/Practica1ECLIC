package com.ecityclic.catademo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecityclic.catademo.entities.EmployeeEntity;
import com.ecityclic.catademo.entities.EmployeeInfoEntity;
import com.ecityclic.catademo.entities.ProjectEntity;
import com.ecityclic.catademo.helper.Helper;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class Controller {	
	

	@Autowired
	private Helper helper;
	
	
	@RequestMapping("/getEmployeeById/{id}") //ANOTACIÓ QUE VINCULA LA PETICIÓ DE POSTMAN AMB LA FUNCIÓ DE JAVA 
	public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable Long id)  { //BUSCAR EMPLEAT A PARTIR DE LA ID
		return ResponseEntity.ok(helper.getEmployee(id));

	}
	
	@PutMapping("/saveEmployee")  // @RequestMapping serveix per PUT/GET/PUSH/DELETE. @PostMapping SE POT SUBSTITUIR PER @RequestMapping 
	public void saveEmployee(@RequestBody EmployeeEntity employee) { // CREAR NOU EMPLEAT
		helper.saveEmployee(employee);
	}
	
	@GetMapping("/getEmployeesByName/{name}")
	public ResponseEntity<List<EmployeeEntity>> getEmployeeById (@PathVariable String name)  { //BUSCAR EMPLEAT A PARTIR DE LA ID
		return ResponseEntity.ok(helper.getEmployeesByName(name));

	}
	
	@PostMapping("/updateEmployee")
	public void updateEmployee(@RequestBody EmployeeEntity employee) { // @PostMapping, SI EXISTEIX UN EMPLOYEE AMB AQUELL ID, LO QUE FARA ES ACTUALITZAR-LO
		helper.saveEmployee(employee);
	} 
	

	@DeleteMapping("/deleteEmployeeById/{id}")
	public ResponseEntity<EmployeeEntity> deleteEmployee(@PathVariable Long id) { //@DeleteMapping, SI EXISTEIX UN EMPLOYEE ES BORRA
		return ResponseEntity.ok(helper.deleteEmployee(id)); // ES POT MODIFICAR PER UTILIZAR ALTRES ATRIBUTS, COM EL NOM O EL DNI
		// COM UTILITZEM EL ID (QUE ÉS ÚNIC) ENS ASSEGUREM QUE BORREM NOMÈS UN
	} 
	
	@GetMapping("/getAllEmployees/{name}")
	public ResponseEntity<List<EmployeeEntity>> getEmployeesFromProject(@PathVariable String name){
		return ResponseEntity.ok(helper.getEmployeesFromProject(name));
	}
	
	
	@GetMapping("/getEmployeeInfoByDni/{dni}") 
	public ResponseEntity<EmployeeInfoEntity> getEmployeeInfoByDni(@PathVariable String dni)  { 
		return ResponseEntity.ok(helper.getEmployeeInfoByDni(dni));

	}	
	
}
