package extra_clase1_jonathanrosero;

import java.util.Scanner;
//en esta clase Titulo se ingresa y obtiene el nombre del titulo y la universidad del docente.

public class Titulo {

    private String nombre;
    private String nombre_universidad;
    private Scanner scan = new Scanner(System.in);

    public void ingresar_titulo() {
        System.out.println("Ingrese el titulo del docente: ");
        nombre = scan.nextLine();
        System.out.println();
    }

    public String obtener_titulo() {
        return nombre;
    }

    public void ingresar_universidad() {
        System.out.println("Ingrese la universidad del titulo del docente: ");
        nombre_universidad = scan.nextLine();
        System.out.println();
    }

    public String obtener_nombre_universidad() {
        return nombre_universidad;
    }
}
