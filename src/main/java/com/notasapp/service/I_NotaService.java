package com.notasapp.service;

import com.notasapp.dto.NotaDTO;
import com.notasapp.model.Usuario;
import java.util.List;

public interface I_NotaService {

    NotaDTO crearNota(NotaDTO notaDTO, Usuario usuario);
    NotaDTO actualizarNota(Long id, NotaDTO notaDTO, Usuario usuario);
    void eliminarNota(Long id, Usuario usuario);
    NotaDTO obtenerNota(Long id, Usuario usuario);
    List<NotaDTO> listarNotasActivas(Usuario usuario);
    List<NotaDTO> listarNotasArchivadas(Usuario usuario);
    List<NotaDTO> listarTodasNotas(Usuario usuario);
    NotaDTO archivarNota(Long id, Usuario usuario);
    NotaDTO desarchivarNota(Long id, Usuario usuario);
    List<NotaDTO> filtrarNotasPorCategoria(Long categoriaId, Usuario usuario);
}