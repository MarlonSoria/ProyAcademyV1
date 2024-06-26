package com.acdm.academipi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_tipocursos")
public class TipoCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tipocurso;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "tipoCurso")
    private List<Curso> cursos;

    // Getters y Setters
}

