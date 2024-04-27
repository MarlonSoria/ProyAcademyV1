package com.acdm.academipi.service;

import com.acdm.academipi.entity.TipoUsuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TipoUsuarioService {
    public List<TipoUsuario> listarTipoUsuario();

    public Optional<TipoUsuario> listarTipoUsuarioPorId(Integer id);

    public void guardar(TipoUsuario tipoUsuario);

    public void actualizar(TipoUsuario tipoUsuario);

    public void eliminar(Integer id);



}
