/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.APIlogin.APIlogin.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.APIlogin.APIlogin.Repository.SkillsRepo;
import java.util.List;
import com.APIlogin.APIlogin.model.Skills;
/**
 *
 * @author Fede R
 */
@Service
public class SkillsService implements ISkillsService {

    @Autowired
    private SkillsRepo skillsRepo;
    
    
    @Override
    public List<Skills> getSkills(){
        return skillsRepo.findAll();
    };
    
    @Override
    public void addSkills(Skills s){
        skillsRepo.save(s);
    };
    
    @Override
    public void deleteSkill(Long id){
        skillsRepo.deleteById(id);
    };
    
    @Override
    public Skills findSkill(Long id){
        return skillsRepo.findById(id).orElse(null);
    };    
}
