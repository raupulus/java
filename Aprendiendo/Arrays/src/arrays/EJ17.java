package arrays;
/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 * A continuación se mostrará el contenido de ese array junto al índice (0 - 9).
 * Seguidamente el programa pasará los primos a las primeras posiciones,
 * desplazando el resto de números (los que no son primos) de tal forma que no
 * se pierda ninguno. Al final se debe mostrar el array resultante.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Scanner;
public class EJ17 {
    private static final Scanner sc = new Scanner(System.in);
    private static int[] array = new int[10];
    public static void main(String[] args) {
        entrada();
        ordenar();
    }
    
    public static void entrada() {
        //Pide los diez números por teclado
        for(int i=0;i<array.length;i++) {
            System.out.println("Introduce el valor para el número --> " + i);
            array[i] = sc.nextInt();
        }
    }
    
    public static void ordenar() {
        //Ordenar array con números primos al principio
        int[] primos;
        int[] noprimos;
    }
    
    public static boolean esPrimo(int numero) {
        //Comprobar si es primo y devolver booleano
        int contador = 2; //Contador del número actual que se comprueba
        boolean esPrimo=true; //Comienzo dando por supuesto que es primo
        
        //Bucle que comprueba si se puede dividir entre otros números para sacar si es primo
        while ((esPrimo) && (contador!=numero)){
          if (numero % contador == 0) {
            esPrimo = false;
          contador++;
          }
        }
        return esPrimo;
    }
}
