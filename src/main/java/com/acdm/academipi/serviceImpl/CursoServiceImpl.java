package com.acdm.academipi.serviceImpl;

import com.acdm.academipi.entity.Curso;
import com.acdm.academipi.repository.CursoRepository;
import com.acdm.academipi.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository curRepo;


    @Override
    public List<Curso> listarCurso() {
        return curRepo.findAll();
    }

    @Override
    public Optional<Curso> listarCursoPorId(Integer id) {
        return curRepo.findById(id);
    }

    @Override
    public void guardar(Curso curso) {
            curRepo.save(curso);

    }

    @Override
    public void actualizar(Curso curso) {


    }

    @Override
    public void eliminar(Integer id) {
        curRepo.deleteById(id);

    }
}
