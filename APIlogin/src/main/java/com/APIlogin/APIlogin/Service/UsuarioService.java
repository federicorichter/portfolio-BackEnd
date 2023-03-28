/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.APIlogin.APIlogin.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.APIlogin.APIlogin.Repository.UsuarioRepo;
import java.util.List;
import com.APIlogin.APIlogin.model.Usuario;
/**
 *
 * @author Fede R
 */
@Service
public class UsuarioService implements IUsuarioService {
    
    @Autowired
    private UsuarioRepo userRepo;
    
    @Override
    public List<Usuario> getUsuarios(){
        return userRepo.findAll();
    }
    
    @Override 
    public void addUsuario(Usuario u){
        userRepo.save(u);
    }
    
    @Override
    public void deleteUsuario(Long id){
        userRepo.deleteById(id);
    }
    /*
    @Override
    public boolean findPersona(String email, String password){
        return userRepo.findByEmail(email)==null && userRepo.findByContraseña(password)!=null && userRepo.findByContraseña(password)==userRepo.findByEmail(email);
    }
    */
    /*
    @Override
    public boolean existePersona(String email, String password){
        Usuario u1 = userRepo.findByEmail(email);
        Usuario u2 = userRepo.findByContraseña(password);
        
        if(u1==null || u2==null){
            return false;
        }
        return (u1.getContraseña().equals(u2.getContraseña()) && u1.getEmail().equals(u2.getEmail()));
            
    }
    */
    @Override
    public boolean existeEmails(String email){
        return userRepo.findByEmail(email)!=null;
    }
    
    @Override
    public String contraseñaCorrecta(String email){
        return userRepo.findByEmail(email).getContraseña();
    }
}
