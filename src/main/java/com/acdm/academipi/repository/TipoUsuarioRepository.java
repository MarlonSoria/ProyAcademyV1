package com.acdm.academipi.repository;

import com.acdm.academipi.entity.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario,Integer> {
}
