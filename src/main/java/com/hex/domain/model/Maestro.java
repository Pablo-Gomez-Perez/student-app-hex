package com.hex.domain.model;

public class Maestro {
    private int idMaestro;
    private String matricula;
    private String nombre;
    private String telefono;
    private String mail;

    public Maestro(int idMaestro, String matricula, String nombre, String telefono, String mail) {
        this.idMaestro = idMaestro;
        this.matricula = matricula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
    }

    public Maestro() {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
