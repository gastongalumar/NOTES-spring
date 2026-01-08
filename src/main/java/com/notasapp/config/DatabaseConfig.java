package com.notasapp.config;

import com.notasapp.model.Usuario;
import com.notasapp.repository.I_UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DatabaseConfig {

    @Bean
    public CommandLineRunner initDatabase(I_UsuarioRepository usuarioRepository,
                                          PasswordEncoder passwordEncoder) {
        return args -> {
            // Crear usuario admin por defecto si no existe
            if (usuarioRepository.findByUsername("admin").isEmpty()) {
                Usuario admin = new Usuario();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("admin123"));
                admin.setEmail("admin@notasapp.com");
                admin.setEnabled(true);
                usuarioRepository.save(admin);
                System.out.println("=== USUARIO POR DEFECTO CREADO ===");
                System.out.println("Usuario: admin");
                System.out.println("Contraseña: admin123");
                System.out.println("================================");
            }

            // Crear usuario de prueba si no existe
            if (usuarioRepository.findByUsername("usuario").isEmpty()) {
                Usuario usuario = new Usuario();
                usuario.setUsername("usuario");
                usuario.setPassword(passwordEncoder.encode("usuario123"));
                usuario.setEmail("usuario@notasapp.com");
                usuario.setEnabled(true);
                usuarioRepository.save(usuario);
                System.out.println("Usuario de prueba 'usuario' creado");
            }
        };
    }
}