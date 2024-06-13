package com.ecityclic.catademo.entities;

import java.io.Serializable;
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
@Table(name="employee")
public class EmployeeEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    
    private String dni;
    
    
    @Column(name="project_id", nullable = true,  columnDefinition = "VARCHAR(100) DEFAULT NULL ")
    private long projectId;

    @ManyToOne
    @JoinColumn(name = "id_project", referencedColumnName="id_project" )
    private ProjectEntity project;
    
    
    
    @OneToOne
    @JoinColumn(referencedColumnName="id" )
    private EmployeeInfoEntity eeinfo;
}
