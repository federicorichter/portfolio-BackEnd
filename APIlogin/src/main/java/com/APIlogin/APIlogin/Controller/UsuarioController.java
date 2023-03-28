/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.APIlogin.APIlogin.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.APIlogin.APIlogin.Service.IUsuarioService;
import com.APIlogin.APIlogin.model.Usuario;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Fede R
 */

@RestController
public class UsuarioController {
    
    @Autowired
    private IUsuarioService interUsuario;
    
    @GetMapping("/usuarios/traer")
    @ResponseBody
    public List<Usuario> verUsuarios(){
        return interUsuario.getUsuarios();
    }
    
    @PostMapping("/usuarios/login")
    public String login(@RequestBody Usuario u){
        if(interUsuario.existeEmails(u.getEmail())){
            if(interUsuario.contraseñaCorrecta(u.getEmail()).equals(u.getContraseña())){
                return "Login correcto";
            }
            else{
                return "Contraseña incorrecta";
            }
        }
        else{
            return "El mail no coincide con ninguna cuenta";
        }
    }
    
    @PostMapping("/usuarios/crear")
    public String addUsuario(@RequestBody Usuario u){
        if(!interUsuario.existeEmails(u.getEmail())){
        interUsuario.addUsuario(u);
         return "Se agrego correctamente la persona";
    }
        else{
            return "El email ya ha sido registrado";
        }
    }


}
