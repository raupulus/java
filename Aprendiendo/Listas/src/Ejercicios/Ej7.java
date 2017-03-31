package Ejercicios;
/**
 * Escribe un programa que lea números enteros y los guarde en un ArrayList
 * hasta que se lea un 0 y muestra los números leídos, su suma y su media.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Ej7 {
    private static final Scanner sc = new Scanner(System.in);
    private static int input;
    //input = sc.nextInt();
    private static ArrayList<Integer> m = new ArrayList();
    
    public static void main(String[] args) {
        entrada();
        System.out.println(m.toString());
    }
    
    public static void entrada() {
        //Método que lee los números introducido hasta que se introduzca 0
        boolean terminar = false;
        int tmp;
        while (!terminar) {
            System.out.println("\nIntroduce otro valor:");
            tmp = sc.nextInt();
            if(tmp == 0){ //Si el valor introducido es 0 termina
                terminar = true;
                break;
            }
            m.add(tmp);
        }
        
    }
}
