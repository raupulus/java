package arrays;
/*
 * Realiza un programa que cree 1000 números aleatorios y muestre los 10 mayorse
 * @author fryntiz
 */
import java.util.*;

public class EJ1 {
    private static int x;
    int[] array = new int[1000];
    Random rd = new Random();
//input = sc.nextInt();
    
    public static void main(String[] args) {
        
        System.out.println("");
        for (int i=0; i<=999; i++) {
            //array[0] = (int)Math.Random()*100;
            array[1] = rd.nextInt(100);
        }
        
    }
}
