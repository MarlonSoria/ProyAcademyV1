package com.acdm.academipi.repository;

import com.acdm.academipi.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula,Integer> {
}
