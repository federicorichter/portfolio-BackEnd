/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.APIlogin.APIlogin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Fede R
 */
@Getter@Setter
@Entity
@Table(name="projects")
public class Projects {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long Id;
    private String name;
    private String project;
    private String[]tech;

    public Projects() {
    }

    public Projects(Long Id, String name, String project, String[] tech) {
        this.Id = Id;
        this.name = name;
        this.project = project;
        this.tech = tech;
    }
    
    

}
