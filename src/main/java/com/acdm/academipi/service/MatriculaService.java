package com.acdm.academipi.service;

import com.acdm.academipi.entity.Matricula;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MatriculaService {

    public List<Matricula> listarMatricula();

    public Optional<Matricula> listarMatriculaPorId(Integer id);

    public void guardar(Matricula matricula);

    public void actualizar(Matricula matricula);

    public void eliminar(Integer id);

}
