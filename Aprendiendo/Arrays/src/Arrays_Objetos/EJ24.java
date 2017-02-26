package Arrays_Objetos;
/**
 * Diseñar una clase llamada Curso que tiene como atributos privados el nombre
 * del curso y como miembros públicos:
 * -Un constructor que recibe como argumento el número de alumnos dimensiona el 
 * array y pide los nombres por teclado.
 * -Un método llamado elMasLargo que devuelve el nombre que tenga más caracteres
 * -Un método llamado desplaza que desplaza todos los nombres un lugar a la derecha
 * de forma que el último pasa a ocupar la primera posición.
 * -Un método llamado verNombre que recibe como argumento una posición y devuelve
 * el nombre que está en esa posición.
 * 
 * Desde una función principal declarar un array de 4 objetos de la clase curso (1ºDAW, 2ºDAW, 1ºSMR, 2ºSMR)
 * 
 * Desarrollar un menú que muestre:
 * 1 - Resumen de un curso pedido por teclado
 * 2 - Mostrar el alumno con el nombre más largo y en qué curso está
 * 3 - Mostrar qué clase tiene el alumno con el nombre más corto
 * 0 - Salir
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
import java.util.Scanner;

public class EJ24 {
    private static final Scanner sc = new Scanner(System.in);
    
    public void main(String[] args) {
        
        menu(principal());
    }
    
    public Curso[] principal() {
        //Creo array con los cursos y parametros
        Curso[] cursos = { 
            new Curso(2,"1ºDAW"),
            new Curso(2,"2ºDAW"),
            new Curso(2,"1ºSMR"),
            new Curso(2,"2ºSMR")
        };
        
        return cursos;
    }
    
    public void menu(Curso[] cursos) {
        boolean salir = false;
        int input = 0;
        
        while (!salir) {
            System.out.println("***** MENÚ *****");
            System.out.println("1 - Resumen de un curso pedido por teclado");
            System.out.println("2 - Mostrar el alumno con el nombre más largo y en qué curso está");
            System.out.println("3 - Mostrar qué clase tiene el alumno con el nombre más corto");
            System.out.println("0 - Salir");
            
            if ((input>=0) && (input<cursos.length)) {
                switch (input) {
                    case 1:
                        System.out.println("Introduce el curso");
                        input = sc.nextInt();
                        System.out.println("\nAlumno con el nombre más largo:");
                        //System.out.println(cursos[i].elMasLargo());
                        System.out.println("\nAlumno con el nombre más corto:");
                        //System.out.println(cursos[i].elMasCorto());
                        break;
                    case 2:
                        nombreMasLargo();
                        break;
                    case 3:
                        nombreMasCorto();
                        break;
                }
            } else {System.out.println("Opción incorrecta");}
        }
    }
    
    public static void nombreMasLargo() {
        //Compara la longitud del nombre más largo de cada clase --> Curso.elMasLargo()
    }
    
    public static void nombreMasCorto() {
        //Compara la longitud del nombre más corto de cada clase --> Curso.elMasCorto()
    }
}
