package com.acdm.academipi.service;

import com.acdm.academipi.entity.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EstudianteService {

    public List<Estudiante> listarEstudiante();

    public Optional<Estudiante> listarEstudiantePorId(Integer id);

    public void guardar(Estudiante estudiante);

    public void actualizar(Estudiante estudiante);

    public void eliminar(Integer id);


}
