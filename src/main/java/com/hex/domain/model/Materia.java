package com.hex.domain.model;

public class Materia {
    private int idMateria;
    private int idMaestro;
    private String matricula;
    private String nombre;

    public Materia(int idMateria, int idMaestro, String matricula, String nombre) {
        this.idMateria = idMateria;
        this.idMaestro = idMaestro;
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public Materia() {
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(int idMaestro) {
        this.idMaestro = idMaestro;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Materia [idMateria=" + idMateria + ", idMaestro=" + idMaestro + ", matricula=" + matricula + ", nombre="
                + nombre + "]";
    }

}
