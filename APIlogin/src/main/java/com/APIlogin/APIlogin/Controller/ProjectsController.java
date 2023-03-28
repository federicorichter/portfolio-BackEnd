/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.APIlogin.APIlogin.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.APIlogin.APIlogin.Service.IProjectsService;
import com.APIlogin.APIlogin.model.Projects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 *
 * @author Fede R
 */
@RestController
public class ProjectsController {
    
    @Autowired
    private IProjectsService interProject;
    
    @GetMapping("/projects/traer")
    @ResponseBody
    public List<Projects> verProjects(){
        return interProject.getProject();
    }
    
    @PostMapping("/projects/crear")
    public String addSkill(@RequestBody Projects p){
        interProject.addProject(p);
        return "Se agrego el proyecto";
    }
    
    @DeleteMapping("/projects/delete/{id}")
    public String deleteProject(Long id){
        interProject.deleteProject(id);
        return "Proyecto eliminado";
    }
    
    @PutMapping("/projects/editar/{id}")
    public Projects modificarProject(@PathVariable Long id,
                                 @RequestParam("name") String name,
                                 @RequestParam("project") String project,
                                 @RequestParam("tech") String[] tech){
        Projects s = interProject.findProject(id);
        
        s.setName(name);
        s.setProject(project);
        s.setTech(tech);
        interProject.addProject(s);
        return s;
    }
    
    
}
