package paquete_general;

public class Pais {
    private String nombre;

    public String obtener_Nombre() {
        return nombre;
    }

    public void ingresar_Nombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("%s", this.obtener_Nombre());
    }
    
    
}
