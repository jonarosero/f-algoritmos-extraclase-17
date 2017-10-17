package extra_clase1_jonathanrosero;

import java.util.Scanner;
//en esta clase Docente se ingresa y obtiene los datos personales de los docentes llamando a las otras dos clases Titulo y Asignatura.

public class Docente {

    Scanner scan = new Scanner(System.in);
    Titulo titulo = new Titulo();
    Asignatura asig = new Asignatura();
    private String nombre;
    private String apellidos;
    private String titulo_tercer_nivel;
    private String titulo_cuarto_nivel;
    private String asignatura1;
    private String asignatura2;

    public void ingresar_docente_nombre() {
        System.out.println("Ingrese el nombre del docente: ");
        nombre = scan.nextLine();
        System.out.println();
    }

    public String obtener_docente_nombre() {
        return nombre;
    }

    public void ingresar_docente_apellidos() {
        System.out.println("Ingrese los apellidos del docente: ");
        apellidos = scan.nextLine();
        System.out.println();
    }

    public String obtener_docente_apellidos() {
        return apellidos;
    }

    public String obtener_titulo_tercer_nivel() {
        titulo.ingresar_titulo();
        titulo.ingresar_universidad();
        titulo_tercer_nivel = String.format("Titulo 3er nivel: %s - %s", titulo.obtener_titulo(), titulo.obtener_nombre_universidad());
        return this.titulo_tercer_nivel;
    }

    public String obtener_titulo_cuarto_nivel() {
        titulo.ingresar_titulo();
        titulo.ingresar_universidad();
        titulo_cuarto_nivel = String.format("Titulo 4to nivel: %s - %s", titulo.obtener_titulo(), titulo.obtener_nombre_universidad());
        return this.titulo_cuarto_nivel;
    }

    public String obtener_asignatura1() {
        asig.ingresar_asignatura();
        asig.ingresar_creditos();
        asignatura1 = String.format("Asignatura 1: %s con un numero de creditos %s", asig.obtener_asignatura(), asig.obtener_creditos());
        return this.asignatura1;
    }

    public String obtener_asignatura2() {
        asig.ingresar_asignatura();
        asig.ingresar_creditos();
        asignatura2 = String.format("Asignatura 2: %s con un numero de creditos %s", asig.obtener_asignatura(), asig.obtener_creditos());
        return this.asignatura2;
    }

    public void imprimir_docente() {
        ingresar_docente_nombre();
        ingresar_docente_apellidos();
        System.out.println();
        System.out.printf("\nDATOS DEL DOCENTE\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Tiene a su cargo las asignaturas:\n"
                + "\t%s\n"
                + "\t%s\n"
                + "El docente tiene los siguientes titulos academicos:\n"
                + "\t%s\n"
                + "\t%s\n\n\n",
                obtener_docente_nombre(), obtener_docente_apellidos(),
                obtener_asignatura1(), obtener_asignatura2(),
                obtener_titulo_tercer_nivel(), obtener_titulo_cuarto_nivel());
    }

}
