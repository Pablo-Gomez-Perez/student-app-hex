package com.hex.domain.repository;

import java.util.List;

import com.hex.domain.model.Maestro;

public interface MaestroRepository {

    public void save(Maestro maestro);
    public Maestro findById(int id);
    public List<Maestro> listAll();

}
