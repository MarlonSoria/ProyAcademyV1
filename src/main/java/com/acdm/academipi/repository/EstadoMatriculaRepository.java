package com.acdm.academipi.repository;

import com.acdm.academipi.entity.EstadoMatricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoMatriculaRepository extends JpaRepository<EstadoMatricula,String> {
}
