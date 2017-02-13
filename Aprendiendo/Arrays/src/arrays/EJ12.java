package arrays;
/**
 * Que rellene un array con los 100 primeros números impares y muestre la suma
 * @author fryntiz
 */
import java.util.*;
public class EJ12 {
    static int[] array = new int[100];
    private static Random rd = new Random();
    static int suma;
    
    public static void main(String[] args) {
        rellenarArray(); //Llena el array de números impares
        sumar(); //Suma el array
        mostrar(); //Muestra el array sumado
    }
    
    public static void rellenarArray() {//Llena el array de números impares
        for(int i = 0;i<array.length;i++) {
            array[i] = rd.nextInt(100);
            if ((array[i]%2) == 0) {
                i--;
            }
        }
    }
    
    public static void sumar() {
        for(int i = 0;i<array.length;i++) {
            suma += array[i];
        }
    }
    
    public static void mostrar() {
        System.out.println("Array sumado:");
        System.out.print(suma);
    }
}
