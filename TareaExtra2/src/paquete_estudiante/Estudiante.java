package paquete_estudiante;

import paquete_academico.Asignatura;
import paquete_academico.Universidad;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private Asignatura asignatura_1;
    private Asignatura asignatura_2;
    private Universidad universidad;

    public String obtener_Nombres() {
        return nombres;
    }

    public void ingresar_Nombres(String nombres) {
        this.nombres = nombres;
    }

    public String obtener_Apellidos() {
        return apellidos;
    }

    public void ingresar_Apellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Asignatura obtener_Asignatura_1() {
        return asignatura_1;
    }

    public void ingresar_Asignatura_1(Asignatura asignatura_1) {
        this.asignatura_1 = asignatura_1;
    }

    public Asignatura obtener_Asignatura_2() {
        return asignatura_2;
    }

    public void ingresar_Asignatura_2(Asignatura asignatura_2) {
        this.asignatura_2 = asignatura_2;
    }

    public Universidad obtener_Universidad() {
        return universidad;
    }

    public void ingresar_Universidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return String.format("Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Universidad: %s\n"
                + "Tiene las asignaturas:\n"
                + "\t%s\n"
                + "\t%s\n", this.obtener_Nombres(), this.obtener_Apellidos(), this.obtener_Universidad(), this.obtener_Asignatura_1(), this.obtener_Asignatura_2());
    }
    
}
