package com.hex.domain.model;

public class Alumno {
    private int idAlumno;
    private String matricula;
    private int grado;
    private String nombre;
    private String numero;
    private String mail;

    public Alumno(int idAlumno, String matricula, int grado, String nombre, String numero, String mail) {
        this.idAlumno = idAlumno;
        this.matricula = matricula;
        this.grado = grado;
        this.nombre = nombre;
        this.numero = numero;
        this.mail = mail;
    }

    public Alumno() {
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Alumno [idAlumno=" + idAlumno + ", matricula=" + matricula + ", grado=" + grado + ", nombre=" + nombre
                + ", numero=" + numero + ", mail=" + mail + "]";
    }

}
