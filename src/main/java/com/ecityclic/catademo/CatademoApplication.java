package com.ecityclic.catademo;
import com.ecityclic.catademo.controller.EmployeeController;
import com.ecityclic.catademo.helper.*;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ToString
@Slf4j
@SpringBootApplication
public class CatademoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(CatademoApplication.class, args);
		}
}
