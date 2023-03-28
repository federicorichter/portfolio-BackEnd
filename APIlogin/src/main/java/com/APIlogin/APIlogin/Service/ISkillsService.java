/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.APIlogin.APIlogin.Service;

import com.APIlogin.APIlogin.model.Skills;
import java.util.List;
/**
 *
 * @author Fede R
 */
public interface ISkillsService {
    public List<Skills> getSkills();
    public void addSkills(Skills s);
    public void deleteSkill(Long id);
    public Skills findSkill(Long id);
}
