/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.APIlogin.APIlogin.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.APIlogin.APIlogin.Repository.ProjectsRepo;
import java.util.List;
import com.APIlogin.APIlogin.model.Projects;
/**
 *
 * @author Fede R
 */
@Service
public class ProjectsService implements IProjectsService{
    
    @Autowired
    private ProjectsRepo projectsRepo;
    
    @Override
    public List<Projects> getProject(){
        return projectsRepo.findAll();
    }
    
    @Override
    public void addProject(Projects p){
        projectsRepo.save(p);
    }
    
    @Override
    public void deleteProject(Long id){
        projectsRepo.deleteById(id);
    }
    
    @Override
    public Projects findProject(Long id){
        return projectsRepo.findById(id).orElse(null);
    }
}
