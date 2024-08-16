package com.hex.application.service;

import java.util.List;

import com.hex.domain.model.Materia;
import com.hex.domain.repository.MateriaRepository;

public class MateriaService {

    private final MateriaRepository materiaRepository;

    public MateriaService(MateriaRepository materiaRepository){
        this.materiaRepository = materiaRepository;
    }


    public void registerMateria(Materia materia){
        this.materiaRepository.save(materia);
    }

    public Materia getMateria(int id){
        return this.materiaRepository.findById(id);
    }

    public List<Materia> listAllMaterias(){
        return this.materiaRepository.listAll();
    }
}
