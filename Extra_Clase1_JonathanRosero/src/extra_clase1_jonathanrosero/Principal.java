package extra_clase1_jonathanrosero;

public class Principal {

    public static void main(String[] args) {
        //la clase for creara en esta ocasion dos objetos de tipo docente y se encargara de imprimir los datos del docente.
        for (int i = 0; i < 2; i++) {
            Docente docente = new Docente();
            System.out.printf("CASO: %d\n", i + 1);
            docente.imprimir_docente();
        }
    }

}
