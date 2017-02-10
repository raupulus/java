package arrays;
/*
 * Realiza un programa que cree 1000 números aleatorios y muestre los 10 mayorse
 * @author fryntiz
 */
import java.util.*;

public class EJ1 {
    private static int x;
    static int[] array = new int[1000]; //Array de 1000 posiciones (0-999)
    static Random rd = new Random();
    
    public static void main(String[] args) { //Clase principal
        
        System.out.println("");
        for (int i=0; i<=999; i++) {
            array[i] = rd.nextInt(100); //Añade un número aleatorio dentro del array
            System.out.println(array[i]);
            
        }
        
    }
}
