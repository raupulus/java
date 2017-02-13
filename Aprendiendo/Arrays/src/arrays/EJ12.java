package arrays;
/**
 * Que rellene un array con los 100 primeros números impares y muestre la suma
 * @author fryntiz
 */
import java.util.*;
public class EJ12 {
    static int[] array = new int[100];
    private static Random rd = new Random();
    
    public static void main(String[] args) {
        
    }
    
    public static void rellenarArray() {
        for(int i = 0;i<array.length;i++) {
            array[i] = rd.nextInt(100);
            
        }
    }
}
