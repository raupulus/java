package arrays;
/**
 * Implementa el método "public int[] generarPares()" de la siguiente forma
 * Define un array local pares
 * Genera números aleatorios entre 1 y 50, guarda en el array los que sean pares.
 * Devuelve el array cuando esté completo (la constante MAX indica la longitud del array)
 * @author fryntiz
 */
import java.util.*;
public class EJ4 {
    static final int MAX = 20;
    static int random;
    static int[] array = new int[20];
    static Random rd = new Random();
    
    public static void main(String[] args) {
        generarPares();
    }

    public static void generarPares() {
        for(int i=0; i<MAX; i++){
            random = rd.nextInt(50); //numero máximo 50
            while ((random%2) != 0) {
                random = rd.nextInt(50); //numero máximo 50
            }
            array[i] = random;
            System.out.println("NUMERO: " + array[i]);
        }
    }
}
