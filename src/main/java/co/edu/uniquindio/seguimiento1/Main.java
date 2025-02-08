package co.edu.uniquindio.seguimiento1;

import co.edu.uniquindio.seguimiento1.model.Docente;
import co.edu.uniquindio.seguimiento1.model.Estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Santiago Herrera", "1234");
        Docente docente = new Docente("Duvan Molina", "01N");
        estudiante.mostrarDatos();
        docente.asignarNota(estudiante, 4.5);
        docente.asignarNota(estudiante, "B");
        docente.asignarNota(estudiante, 3.8, "Échale más ganas");
        docente.asignarNota(estudiante,5,4);
        
    }
}