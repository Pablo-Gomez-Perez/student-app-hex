package com.hex.application.service;

import java.util.List;

import com.hex.domain.model.Alumno;
import com.hex.domain.repository.AlumnoRepository;

public class AlumnoService {
    
    private final AlumnoRepository alumnoRepository;
    public AlumnoService(AlumnoRepository alumnoRepository){
        this.alumnoRepository = alumnoRepository;
    }

    public void registerAlumno(Alumno alumno){        
        this.alumnoRepository.save(alumno);
    }

    public Alumno getAlumno(int id){
        return this.alumnoRepository.findById(id);
    }

    public List<Alumno> getAllAlumnos(){
        return this.alumnoRepository.listAll();
    }
}
