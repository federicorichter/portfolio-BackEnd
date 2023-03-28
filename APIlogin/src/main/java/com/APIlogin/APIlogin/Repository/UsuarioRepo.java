/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.APIlogin.APIlogin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.APIlogin.APIlogin.model.Usuario;
//import java.util.List;
/**
 *
 * @author Fede R
 */
@Repository
public interface UsuarioRepo extends JpaRepository<Usuario,Long> {
    Usuario findByEmail(String email);
    Usuario findByContraseña(String Contraseña);
}
