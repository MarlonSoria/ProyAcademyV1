package com.acdm.academipi.service;


import com.acdm.academipi.entity.EstadoMatricula;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface EstadoMatriculaService {

    public List<EstadoMatricula> listarEstado();

    public Optional<EstadoMatricula> listarEstadoPorId(Integer id);

    public void guardar(EstadoMatricula estadoMatricula);

    public void actualizar(EstadoMatricula estadoMatricula);

    public void eliminar(Integer id);

}
