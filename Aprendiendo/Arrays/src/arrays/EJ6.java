package arrays;
/**
 * Implementa un programa "NotasExamen" que solicite al usuario 10 nombres de alumnos y los almacene en un array.
 * Después mostrará los elementos de dicho array uno por uno, preguntando para cada alumno la nota de dicho examen
 * esta nota será almacenada en otro array. Otro método ordenará las notas de menor a mayor mostrando por pantalla:
 * -------Alumnos suspensos-------
 * Pepe Pérez 1,5
 * Ramón Ramirez 2,6
 * -------Alumnos Aprobados-------
 * Francisca Romero 6,2
 * Miguel Dueñas 8
 * 
 * @author fryntiz
 */
import java.util.*;
public class EJ6 {
    private static final Scanner sc = new Scanner(System.in);
    static String[] nombres = new String[10];
    static Double[] notas = new Double[10];

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        System.out.println("----NOTAS EXAMEN----");
        System.out.println("Introduce 10 nombres");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre " + i + ": ");
            nombres[i] = sc.nextLine();
        }
        
        System.out.println("\n\n----Introduce la nota para cada alumno----");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + ": ");
            notas[i] = sc.nextDouble();
        }
        
        ordenar();
        
        System.out.println("******ALUMNOS SUSPENSOS******");
        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] < 5) {
                System.out.println(nombres[i] + " " + notas[i]);
            }
        }
        System.out.println("******ALUMNOS APROBADOS******");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(nombres[i] + " " + notas[i]);
            }
        }
    }
    
    public static void ordenar() {
        Double x;
        String z;
        
        for (int i= 0; i<=(nombres.length-1); i++) { //Ordenar Array
            for (int k=(i+1); k<=(notas.length-1); k++) {
                if (notas[k] < notas[i]) {
                    x = notas[i];
                    z = nombres[i];
                    notas[i] = notas[k];
                    nombres[i] = nombres[k];
                    notas[k] = x;
                    nombres[k] = z;
                } 
            }
        }
    }
}
