package com.notasapp.repository;

import com.notasapp.model.Categoria;
import com.notasapp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface I_CategoriaRepository extends JpaRepository<Categoria, Long> {

    // Buscar todas las categorías de un usuario
    List<Categoria> findByUsuario(Usuario usuario);

    // Buscar categoría por nombre y usuario
    Optional<Categoria> findByUsuarioAndNombre(Usuario usuario, String nombre);

    // Buscar categoría por ID y usuario
    Optional<Categoria> findByIdAndUsuario(Long id, Usuario usuario);

    // Verificar si existe categoría con ese nombre para el usuario
    boolean existsByUsuarioAndNombre(Usuario usuario, String nombre);
}