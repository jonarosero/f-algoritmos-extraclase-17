package extra_clase1_jonathanrosero;

import java.util.Scanner;
//en esta clase Asignatura se ingresa y obtiene el nombre de las asignaturas que da el docente

public class Asignatura {

    private String nombre;
    private String creditos;
    private Scanner scan = new Scanner(System.in);

    public void ingresar_asignatura() {
        System.out.println("Ingrese el nombre de la asignatura: ");
        nombre = scan.nextLine();
        System.out.println();
    }

    public String obtener_asignatura() {
        return nombre;
    }

    public void ingresar_creditos() {
        System.out.println("Ingrese los creditos de la asignatura: ");
        creditos = scan.nextLine();
        System.out.println();
    }

    public String obtener_creditos() {
        return creditos;
    }
}
