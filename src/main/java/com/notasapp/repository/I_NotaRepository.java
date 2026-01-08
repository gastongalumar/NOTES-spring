package com.notasapp.repository;

import com.notasapp.model.Nota;
import com.notasapp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface I_NotaRepository extends JpaRepository<Nota, Long> {

    // Buscar todas las notas activas (no archivadas) de un usuario
    List<Nota> findByUsuarioAndArchivadaFalse(Usuario usuario);

    // Buscar todas las notas archivadas de un usuario
    List<Nota> findByUsuarioAndArchivadaTrue(Usuario usuario);

    // Buscar todas las notas de un usuario
    List<Nota> findByUsuario(Usuario usuario);

    // Buscar notas por usuario y categoría
    @Query("SELECT n FROM Nota n JOIN n.categorias c WHERE n.usuario = :usuario AND c.id = :categoriaId")
    List<Nota> findByUsuarioAndCategoria(@Param("usuario") Usuario usuario,
                                         @Param("categoriaId") Long categoriaId);

    // Contar notas activas de un usuario
    long countByUsuarioAndArchivadaFalse(Usuario usuario);

    // Contar notas archivadas de un usuario
    long countByUsuarioAndArchivadaTrue(Usuario usuario);
}