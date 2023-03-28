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
import com.APIlogin.APIlogin.Service.ISkillsService;
import com.APIlogin.APIlogin.model.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 *
 * @author Fede R
 */
@RestController
public class SkillsController {
    
    @Autowired
    private ISkillsService interSkills;
    
    @GetMapping("/skills/traer")
    @ResponseBody
    public List<Skills> verSkills(){
        return interSkills.getSkills();
    }
    
    @PostMapping("/skills/crear")
    public String addSkill(@RequestBody Skills s){
        interSkills.addSkills(s);
        return "Se agregó skill correctamente";
    }
    
    @DeleteMapping("/skills/delete/{id}")
    public String deleteSkill(Long id){
        interSkills.deleteSkill(id);
        return "Se eliminó skill correctamente";
    }
    
    @PutMapping("/skills/editar/{id}")
    public Skills modificarSkill(@PathVariable Long id,
                                 @RequestParam("name") String name,
                                 @RequestParam("quality") int quality){
        Skills s = interSkills.findSkill(id);
        
        s.setName(name);
        s.setQuality(quality);
        interSkills.addSkills(s);
        return s;
    }
    
}
