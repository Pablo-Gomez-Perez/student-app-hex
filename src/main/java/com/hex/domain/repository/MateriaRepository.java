package com.hex.domain.repository;

import java.util.List;

import com.hex.domain.model.Materia;

public interface MateriaRepository {
    public void save(Materia materia);
    public Materia findById(int id);
    public List<Materia> listAll();
}
