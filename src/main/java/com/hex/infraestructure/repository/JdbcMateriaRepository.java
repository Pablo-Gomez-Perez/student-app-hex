package com.hex.infraestructure.repository;

import java.sql.Connection;
import java.util.List;

import com.hex.domain.model.Materia;
import com.hex.domain.repository.MateriaRepository;

public class JdbcMateriaRepository implements MateriaRepository{
    private final Connection connection;

    public JdbcMateriaRepository(Connection connection){
        this.connection = connection;
    }

    @Override
    public void save(Materia materia) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Materia findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Materia> listAll() {
        // TODO Auto-generated method stub
        return null;
    }

    

}
