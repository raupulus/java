package arrays;
/**
 * Completa el método siguiente para que genere 100 números aleatorios entre 0 y n.
 * Este método debe devolver un array con la frecuencia de aparición de cada número.
 * @author fryntiz
 */
import java.util.*;
public class EJ5 {
    static Random rd = new Random();
    static int[] arrayA = new int[100];
    static int[] arrayB = new int[100];
    
    public static void main(String[] args) {
        int n = 100;
        frecuencias(n);

        System.out.println("Números aleatorios:");
        for (int i = 0; i<arrayA.length; i++) {
            System.out.print(arrayA[i] + ", ");
        }
        
        System.out.println("\nVeces repetidos");
        for (int i = 0; i<arrayB.length; i++) {
            System.out.print(arrayB[i] + ", ");
        }
    }
    
    public static int[] frecuencias(int n) {
        for (int i = 0; i<arrayA.length; i++) {//asigna números aleatorios
            int z = rd.nextInt(n); //numero máximo 100
            arrayA[i] = z;
        }
        
        int tmp=0; //Contador temporal
        int w = 0; //Posición que se compara con todo el array
        
        while (w<arrayA.length) {
            for (int i = 0; i<arrayA.length; i++) {
                if (arrayA[w] == arrayA[i]) {
                    tmp++;
                }
            }
            arrayB[w] = tmp;
            tmp = 0; //Contador temporal de la posición actual del array
            w++; //Sumar 1 a la posición del array que se compara con el for
        }
        return arrayB;
    }
}
