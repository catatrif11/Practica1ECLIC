package com.ecityclic.catademo.service;

import org.springframework.stereotype.Service;

import com.ecityclic.catademo.entities.EmployeeInfoEntity;
import com.ecityclic.catademo.repository.EmployeeInfoRepository;


@Service
public class EmployeeInfoService extends BaseService<EmployeeInfoEntity>{
	
	
	public EmployeeInfoEntity getEmployeeInfoByDni(String dni) {
		EmployeeInfoEntity eeinfo = ((EmployeeInfoRepository)this.repository).findByEeDni(dni);
		return eeinfo;
	}
}
