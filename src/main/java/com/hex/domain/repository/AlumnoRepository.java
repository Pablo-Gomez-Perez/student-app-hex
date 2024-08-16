package com.hex.domain.repository;

import java.util.List;

import com.hex.domain.model.Alumno;

public interface AlumnoRepository {
    public void save(Alumno alumno);
    public Alumno findById(int id);
    public List<Alumno> listAll();
}
