package com.notasapp.service;

import com.notasapp.dto.CategoriaDTO;
import com.notasapp.model.Usuario;
import java.util.List;

public interface I_CategoriaService {

    CategoriaDTO crearCategoria(CategoriaDTO categoriaDTO, Usuario usuario);
    CategoriaDTO actualizarCategoria(Long id, CategoriaDTO categoriaDTO, Usuario usuario);
    void eliminarCategoria(Long id, Usuario usuario);
    List<CategoriaDTO> obtenerCategorias(Usuario usuario);
    CategoriaDTO obtenerCategoria(Long id, Usuario usuario);
    boolean existeCategoria(String nombre, Usuario usuario);
}