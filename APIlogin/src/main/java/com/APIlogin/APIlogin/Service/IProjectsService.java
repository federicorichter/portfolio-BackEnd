/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.APIlogin.APIlogin.Service;

import com.APIlogin.APIlogin.model.Projects;
import java.util.List;
/**
 *
 * @author Fede R
 */
public interface IProjectsService {
    public List<Projects> getProject();
    public void addProject(Projects p);
    public void deleteProject(Long id);
    public Projects findProject(Long id);
}
