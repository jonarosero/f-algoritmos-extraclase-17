package paquete_principal;

import paquete_academico.Asignatura;
import paquete_academico.Carrera;
import paquete_academico.Docente;
import paquete_academico.Universidad;

import paquete_estudiante.Estudiante;

import paquete_general.Pais;

public class Principal {

    public static void main(String[] args) {
        
        Pais pais_universidad1 = new Pais();
        pais_universidad1.ingresar_Nombre("Ecuador");
        
        Pais pais_docente1 = new Pais();
        pais_docente1.ingresar_Nombre("Ecuador");
        
        Pais pais_docente2 = new Pais();
        pais_docente2.ingresar_Nombre("Italia");
        
        Carrera carrera1 = new Carrera();
        carrera1.ingresar_Nombre("Ing. Sistemas");
        carrera1.ingresar_Modalidad("presencial");
        
        Docente docente1 = new Docente();
        docente1.ingresar_Nombres("Rene");
        docente1.ingresar_Apellidos("Elizalde");
        docente1.ingresar_Pais(pais_docente1);
        
        Docente docente2 = new Docente();
        docente2.ingresar_Nombres("Jose");
        docente2.ingresar_Apellidos("Serrano");
        docente2.ingresar_Pais(pais_docente2);
        
        Universidad universidad1 = new Universidad();
        universidad1.ingresar_Nombre("Universidad Tecnica Particular de Loja");
        universidad1.ingresar_Siglas("utpl");
        universidad1.ingresar_Pais(pais_universidad1);
        
        Asignatura asignatura1 = new Asignatura();
        asignatura1.ingresar_Nombre("Programacion de Algorimtos");
        asignatura1.ingresar_Creditos(4);
        asignatura1.ingresar_Carrera(carrera1);
        asignatura1.ingresar_Docente(docente1);
        
        Asignatura asignatura2 = new Asignatura();
        asignatura2.ingresar_Nombre("Fisica");
        asignatura2.ingresar_Creditos(6);
        asignatura2.ingresar_Carrera(carrera1);
        asignatura2.ingresar_Docente(docente2);
        
        Estudiante estudiante1 = new Estudiante();
        estudiante1.ingresar_Nombres("Jonathan A.");
        estudiante1.ingresar_Apellidos("Rosero S.");
        estudiante1.ingresar_Universidad(universidad1);
        estudiante1.ingresar_Asignatura_1(asignatura1);
        estudiante1.ingresar_Asignatura_2(asignatura2);
        
        System.out.println(estudiante1);
        
        Pais pais_universidad2 = new Pais();
        pais_universidad2.ingresar_Nombre("Ecuador");
        
        Pais pais_docente3 = new Pais();
        pais_docente3.ingresar_Nombre("Ecuador");
        
        Pais pais_docente4 = new Pais();
        pais_docente4.ingresar_Nombre("Ucrania");
        
        Carrera carrera2 = new Carrera();
        carrera2.ingresar_Nombre("Ing. Relaciones Externas y Economia Internacional");
        carrera2.ingresar_Modalidad("distancia");
        
        Docente docente3 = new Docente();
        docente3.ingresar_Nombres("Pablo");
        docente3.ingresar_Apellidos("Peralta");
        docente3.ingresar_Pais(pais_docente3);
        
        Docente docente4 = new Docente();
        docente4.ingresar_Nombres("Vladimir");
        docente4.ingresar_Apellidos("Dostoivsky");
        docente4.ingresar_Pais(pais_docente4);
        
        Universidad universidad2 = new Universidad();
        universidad2.ingresar_Nombre("Pontificia Universidad Catolica del Ecuador");
        universidad2.ingresar_Siglas("PUCE");
        universidad2.ingresar_Pais(pais_universidad2);
        
        Asignatura asignatura3 = new Asignatura();
        asignatura3.ingresar_Nombre("Relaciones diplomaticas");
        asignatura3.ingresar_Creditos(3);
        asignatura3.ingresar_Carrera(carrera2);
        asignatura3.ingresar_Docente(docente3);
        
        Asignatura asignatura4 = new Asignatura();
        asignatura4.ingresar_Nombre("Microfinanzas Internacionales");
        asignatura4.ingresar_Creditos(9);
        asignatura4.ingresar_Carrera(carrera2);
        asignatura4.ingresar_Docente(docente4);
        
        Estudiante estudiante2 = new Estudiante();
        estudiante2.ingresar_Nombres("Ana Pau");
        estudiante2.ingresar_Apellidos("Peña");
        estudiante2.ingresar_Universidad(universidad2);
        estudiante2.ingresar_Asignatura_1(asignatura3);
        estudiante2.ingresar_Asignatura_2(asignatura4);
        
        System.out.println(estudiante2);
    }
    
}
