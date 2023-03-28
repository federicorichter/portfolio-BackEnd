/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.APIlogin.APIlogin.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 *
 * @author Fede R
 */
@Getter@Setter
@Entity
@Table(name="skills")
public class Skills {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long Id;
    private String name;
    private int quality;

    public Skills() {
    }

    public Skills(Long Id, String name, int quality) {
        this.Id = Id;
        this.name = name;
        this.quality = quality;
    }
    
    
}
