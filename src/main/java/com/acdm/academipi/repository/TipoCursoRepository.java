package com.acdm.academipi.repository;

import com.acdm.academipi.entity.TipoCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoCursoRepository extends JpaRepository<TipoCurso,Integer> {
}
