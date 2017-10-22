package paquete_academico;

import paquete_general.Pais;

public class Universidad {
    private String nombre;
    private String siglas;
    private Pais pais;

    public String obtener_Nombre() {
        return nombre;
    }

    public void ingresar_Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_Siglas() {
        return siglas;
    }

    public void ingresar_Siglas(String siglas) {
        this.siglas = siglas;
    }

    public Pais obtener_Pais() {
        return pais;
    }

    public void ingresar_Pais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return String.format("%s(%s) - %s", this.obtener_Nombre().toUpperCase(), this.obtener_Siglas().toUpperCase(), this.obtener_Pais()); 
    }
    
    
}
