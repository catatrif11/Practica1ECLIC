package com.ecityclic.catademo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="employeeinfo")
public class EmployeeInfoEntity implements Serializable {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	private String name;
	
	@Column(name="fecha_nacimiento")
	private String fecha;
	
	
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private EmployeeEntity ee;

}
