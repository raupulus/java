package arrays;
/*
 * Realiza un programa que cree 1000 números aleatorios y muestre los 10 mayorse
 * @author fryntiz
 */
import java.util.*;

public class EJ1 {
    private static int x;
    static int[] array = new int[1000]; //Array de 1000 posiciones (0-999)
    static int[] array1 = new int [10];
    static Random rd = new Random();
    
    public static void main(String[] args) { //Clase principal
        System.out.print("Los números generados son:\n");
        for (int i=0; i<=999; i++) {
            array[i] = rd.nextInt(1000); //Añade un número aleatorio dentro del array
            System.out.print(array[i] + ", ");
        }
        
        for (int j= 0; j<=(array.length-1); j++) { //Ordenar Array
            for (int k=(j+1); k<=(array.length-1); k++) {
                if (array[k] < array[j]) {
                    x = array[j];
                    array[j] = array[k];
                    array[k] = x;
                } 
            }
        }
        
        System.out.println("\n\nDe los 1000 números aleatorios los 10 mayores son:");
        for (int l=999; l>989;l--) { //Bucle que recorreo las 10 últimas posiciones
            System.out.print(array[l] + ", ");
        }
    }
}
