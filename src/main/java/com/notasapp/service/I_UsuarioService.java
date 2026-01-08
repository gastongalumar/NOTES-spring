package com.notasapp.service;

import com.notasapp.dto.LoginDTO;
import com.notasapp.model.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface I_UsuarioService extends UserDetailsService {

    Usuario registrarUsuario(Usuario usuario);
    String autenticarUsuario(LoginDTO loginDTO);
    Usuario obtenerUsuarioPorUsername(String username);
    boolean existeUsuario(String username);
}