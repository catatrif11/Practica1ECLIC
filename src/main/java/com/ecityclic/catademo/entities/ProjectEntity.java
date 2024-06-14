package com.ecityclic.catademo.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

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
@Table(name="projects")
public class ProjectEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_project")
    private long idProject;
    
    @Column(name="name")
    private String projectName;
   
    @OneToMany(mappedBy = "project")
    private Set<EmployeeEntity> employees;
}
