package com.acdm.academipi.service;

import com.acdm.academipi.entity.TipoCurso;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TipoCursoService {

    public List<TipoCurso> listarTipoCurso();

    public Optional<TipoCurso> listarTipoCursoPorId(Integer id);

    public void guardar(TipoCurso tipoCurso);

    public void actualizar(TipoCurso tipoCurso);

    public void eliminar(Integer id);

}
