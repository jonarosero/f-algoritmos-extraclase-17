package paquete_academico;

public class Carrera {
    private String nombre;
    private String modalidad;

    public String obtener_Nombre() {
        return nombre;
    }

    public void ingresar_Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_Modalidad() {
        return modalidad;
    }

    public void ingresar_Modalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        return String.format("%s - modalidad(%s)", this.obtener_Nombre(), this.obtener_Modalidad());
    }
    
    
}
