package com.acdm.academipi.service;

import com.acdm.academipi.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UsuarioService {

    public List<Usuario> listarUsuario();

    public Optional<Usuario> listarUsuarioPorId(Integer id);

    public void guardar(Usuario usuario);

    public void actualizar(Usuario usuario);

    public void eliminar(Integer id);

}

