package co.edu.uniquindio.seguimiento1.model;

import java.util.List;

public class Estudiante {
    private String nombre;
    private String identificacion;
    private double nota;

    public Estudiante(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void mostrarDatos() {
        System.out.println("Estudiante: " + nombre + ", Identificación: " + identificacion );
    }
}

