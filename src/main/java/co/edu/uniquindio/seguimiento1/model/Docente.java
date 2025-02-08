package co.edu.uniquindio.seguimiento1.model;

public class Docente {
    private String nombre;
    private String identificacion;

    public Docente(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void asignarNota(Estudiante estudiante, double nota) {
        if (nota >= 0 && nota <= 5) {
            estudiante.setNota(nota);
            System.out.println("Profesor " + nombre +
                    " asignó la nota " + nota + " a " + estudiante.getNombre());
        } else {
            System.out.println("Error: Nota fuera de rango (0 - 5)");
        }
    }

    public void asignarNota(Estudiante estudiante, String calificacion) {
        double nota = convertirNota(calificacion);
        if (nota != -1) {
            System.out.println("...............................");
            asignarNota(estudiante, nota);
            System.out.println("Calificacion: "+ calificacion);
            System.out.println("...............................");
        } else {
            System.out.println("Error: Calificación inválida");
        }
    }

    public void asignarNota(Estudiante estudiante, double nota, String comentario) {
        System.out.println("...............................");
        asignarNota(estudiante, nota);
        System.out.println("Comentario: " + comentario);
        System.out.println("...............................");
    }

    public void asignarNota(Estudiante estudiante,int sello, double nota){
        System.out.println("...............................");
        asignarNota(estudiante,nota);
        String selloAsigando = asignarSello(sello);
        System.out.println("Sello: " + selloAsigando);
        System.out.println("...............................");
    }

    private double convertirNota(String nota) {
        return switch (nota.toUpperCase()) {
            case "A" -> 5.0;
            case "B" -> 4.0;
            case "C" -> 3.0;
            case "D" -> 2.0;
            case "E" -> 1.0;
            case "F" -> 0.0;
            default -> -1;
        };
    }

    private String asignarSello(int sello) {
        return switch (sello) {
            case 5 -> "Sello de excelencia :D";
            case 4 -> "Sello de buen trabajo :)";
            case 3 -> "Sello de raspando :|";
            case 2 -> "Sello de casi pasas :(";
            case 1, 0 -> "Sello de no pasas D:";
            default -> "Nota inválida";
        };
    }
}

