/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.APIlogin.APIlogin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.APIlogin.APIlogin.model.Skills;


/**
 *
 * @author Fede R
 */
@Repository
public interface SkillsRepo extends JpaRepository<Skills,Long> {
    
}
