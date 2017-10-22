package paquete_academico;

import paquete_general.Pais;

public class Docente {
    private String nombres;
    private String apellidos;
    private Pais pais;

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

    public Pais obtener_Pais() {
        return pais;
    }

    public void ingresar_Pais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return String.format("%s %s - %s", this.obtener_Nombres(), this.obtener_Apellidos(), this.obtener_Pais());
    }
    
    
    
    
}
