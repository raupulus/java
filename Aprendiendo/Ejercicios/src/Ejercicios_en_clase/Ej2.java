/*
 * Escribe un programa que cuente por pantalla del 1 al 10 en inglés.
 * Utiliza una estructura switch que incluya la cláusula default.
 */
package Ejercicios_en_clase;
import java.util.*;
public class Ej2 {
    private static int x;
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Introduce un valor del uno al 10: \n");
        x =  sc.nextInt();
        System.out.println("\n");
        System.out.println("\n En inglés sería:");
        
        switch (x) {
            case 1: System.out.println("one"); break;
            case 2: System.out.println("two"); break;
            case 3: System.out.println("three"); break;
            case 4: System.out.println("four"); break;
            case 5: System.out.println("five"); break;
            case 6: System.out.println("six"); break;
            case 7: System.out.println("seven"); break;
            case 8: System.out.println("eight"); break;
            case 9: System.out.println("nine"); break;
            case 10: System.out.println("ten"); break;
        }
        
        System.out.println("\n");
    }
}
