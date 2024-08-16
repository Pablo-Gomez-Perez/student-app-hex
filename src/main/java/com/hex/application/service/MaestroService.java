package com.hex.application.service;

import java.util.List;

import com.hex.domain.model.Maestro;
import com.hex.domain.repository.MaestroRepository;

public class MaestroService {
    private final MaestroRepository maestroRepository;
    
    public MaestroService(MaestroRepository maestroRepository){
        this.maestroRepository = maestroRepository;
    }

    public void registerMaestro(Maestro maestro){
        this.maestroRepository.save(maestro);
    }

    public Maestro getMaestro(int id){
        return this.maestroRepository.findById(id);
    }

    public List<Maestro> listAllMaestros(){
        return this.maestroRepository.listAll();
    }
}
