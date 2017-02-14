package arrays;
/**
 * Método que rellene un array con 20 números
 * Pedir introducir por teclado un número a buscar
 * @author fryntiz
 */
import java.util.*;
public class EJ15 {
    static Random rd = new Random();
    private static final Scanner sc = new Scanner(System.in);
    private static int input;
    static int[] array = new int[20];
    
    public static void main(String[] args) {
        llenarArray();
        pedirNumeroBuscar();
    }
    
    public static void llenarArray() { //LLena el array con números
        for (int i=0;i<array.length;i++) {
            array[i] = rd.nextInt(20); //numero máximo 20
        }
    }
    
    public static void pedirNumeroBuscar() {
        System.out.println("Introduce el número a buscar:");
        //input = sc.nextInt();
        
    }
}
