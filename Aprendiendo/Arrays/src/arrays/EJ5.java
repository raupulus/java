package arrays;
/**
 * Completa el método siguiente para que genere 100 números aleatorios entre 0 y n.
 * Este método debe devolver un array con la frecuencia de aparición de cada número.
 * @author fryntiz
 */
import java.util.*;
public class EJ5 {
    static Random rd = new Random();
    static int[] arrayB = new int[10];
    
    public static void main(String[] args) {
        int[] arrayA = new int[10];
        frecuencias(arrayA);
        
        System.out.println("Números aleatorios:");
        for (int i = 0; i<arrayA.length; i++) {
            System.out.print(arrayA[i] + ", ");
        }
        
        System.out.println("Veces repetidos");
        for (int i = 0; i<arrayA.length; i++) {
            System.out.print(arrayB[i] + ", ");
        }
    }
    
    public static void frecuencias(int x[]) {
        int n = 100;
        for (int i = 0; i<x.length; i++) {//asigna números aleatorios
            int z = rd.nextInt(n); //numero máximo 100
            x[i] = z;
        }
        
        int tmp=0;
        int w = 0;
        
        while (w<x.length) {
            for (int i = 0; i<x.length; i++) {
                if (x[w] == x[i]) {
                    tmp++;
                }
            }
            arrayB[w] = tmp;
            tmp = 0;
            w++;
        }
    }
}
