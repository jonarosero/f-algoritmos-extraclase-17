package paquete_academico;

public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;
    private Docente docente;

    public String obtener_Nombre() {
        return nombre;
    }

    public void ingresar_Nombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtener_Creditos() {
        return creditos;
    }

    public void ingresar_Creditos(int creditos) {
        this.creditos = creditos;
    }

    public Carrera obtener_Carrera() {
        return carrera;
    }

    public void ingresar_Carrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Docente obtener_Docente() {
        return docente;
    }

    public void ingresar_Docente(Docente docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return String.format("%s(%d creditos) de la carrera %s. Docente: %s", this.obtener_Nombre(), this.obtener_Creditos(), this.obtener_Carrera(), this.obtener_Docente());
    }
    
    
    
    
}
