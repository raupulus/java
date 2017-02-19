package Ejercicios_básicos;
/**
 * Crea una clase llamada países que tiene como atributo un array con el nombre
 * países y los métodos:
 * -Un constructor que inicializa el array con el nombre de los países pasados por la línea de órdenes
 * -Un método llamado sorteo que devuelve el nombre del país elegido al azar de entre todos los países
 * -Un método llamado buscar que recibe como argumento el nombre de un país y devuelve la posición en que se encuentra el país en el array o -1 si no lo encuentra
 * 
 * Desde el método principal declarar un objeto de tipo Paises y probar todos los métodos de la clase
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Scanner;
public class EJ1 {
    
    private static final Scanner sc = new Scanner(System.in);
    private static int input;
    private static boolean salir;
//input = sc.nextInt();
    
    public static void main(String[] args) {
        
    }
    
    public static void entrada() {
        System.out.println("");
    }
    
    public static void menu() {
        while (!salir) {
            System.out.println("***** MENÚ *****");
            System.out.println("1 - Introducir paises");
            System.out.println("2 - Realizar sorteo");
            System.out.println("3 - Posición del país");
            System.out.println("4 - Salir");
        }
    }
}
