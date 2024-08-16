package com.hex.infraestructure.repository;

import java.sql.Connection;
import java.util.List;

import com.hex.domain.model.Alumno;
import com.hex.domain.repository.AlumnoRepository;

public class JdbcMaestroRepository implements AlumnoRepository{
    private final Connection connection;

    public JdbcMaestroRepository(Connection connection){
        this.connection = connection;
    }

    @Override
    public void save(Alumno alumno) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Alumno findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Alumno> listAll() {
        // TODO Auto-generated method stub
        return null;
    }

    
}
