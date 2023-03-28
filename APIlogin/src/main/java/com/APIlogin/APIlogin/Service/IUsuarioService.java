/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.APIlogin.APIlogin.Service;

import com.APIlogin.APIlogin.model.Usuario;
import java.util.List;
/**
 *
 * @author Fede R
 */
public interface IUsuarioService {
    
    public List<Usuario> getUsuarios();
    public void addUsuario(Usuario u);
    public void deleteUsuario(Long id);
    //public boolean existePersona(String email,String pass);
    public boolean existeEmails(String email);
    public String contraseñaCorrecta(String email);
    
}
