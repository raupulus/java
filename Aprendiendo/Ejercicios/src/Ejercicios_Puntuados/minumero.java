package Ejercicios_Puntuados;
/*
 * Realiza una clase minumero con un método esVampiro que diga si un número
 * es  vampiro o no. Un número es vampiro si es obtenido a partir del producto
 * de dos números que se obtienen multiplicando algunos de los dígitos que los 
 * componen, por ejemplo:
 * 2187 = 27x81 ó 1260 = 21x60
 * Algunos números vampiros: 1260, 1395, 1435, 1530, 1827, 2187, 6880
 * @author fryntiz
 */

import java.util.*;

public class minumero {
    private static boolean valido, numVampiro;
    private static int input,num,in1,in2,in3,in4;
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        pedirNumero(); // Inicia la entrada de número
        comprobar(input); // Comprueba que sea de 4 dígitos
        esVampiro(input); // Comprueba si es vampiro
    }
    
    public static void pedirNumero() {
        System.out.println("Introduce un número de 4 dígitos para comprobar si es vampiro");
        input = sc.nextInt();
    }
    
    public static void comprobar(int num) {
        if (num>=1000 & num<=9999) {
            valido=true;
        }
    }
    
    public static void esVampiro(int num) { //Método que comprueba si el número es vampiro
        if (!valido) { //Si el número no es de 4 dígitos se vuelve a pedir
            System.out.println("Número no válido");
            pedirNumero();
        }
        
        //Separar números a variables
        in4 = (num%10);
        in3 = ((num%100)-(num%10))/10;
        in2 = (num/100)%10;
        in1 = (num/1000);
        
        //Creo variables con cada pareja
        int a1=(in1*10)+in2, a2=(in1*10)+in3, a3=(in1*10)+in4;
        int b1=(in2*10)+in1, b2=(in2*10)+in3, b3=(in2*10)+in4;
        int c1=(in3*10)+in1, c2=(in3*10)+in2, c3=(in3*10)+in4;
        int d1=(in4*10)+in1, d2=(in4*10)+in2, d3=(in4*10)+in3;
        
        //Parejas posibles para combinar al array: a1*b3, a1*c3, a1*d3, a2*b3, a2*d1, a2*d2, a3*b2, a3*c1, a3*c2, b1*c3, b1*d3, b2*c3, b2*d1, b3*c1
        int[] combinacionesA = new int[] {a1, a1, a1, a2, a2, a2, a3, a3, a3, b1, b1, b2, b2, b3};
        int[] combinacionesB = new int[] {b3, c3, d3, b3, d1, d2, b2, c1, c2, c3, d3, c3, d1, c1};
        
        //Comprobar si es vampiro mediante combinaciones del array sin repetir
        for (int i = 0; i < combinacionesA.length; i++){
            int tmp = combinacionesA[i] * combinacionesB[i];
            if (tmp == num) {
                System.out.println("\n" + tmp + " ¡Es un número Vampiro!");
                System.out.println("La multiplicación es " + combinacionesA[i] + " por " + combinacionesB[i]);
                numVampiro = true;
                break;
            } else {
                numVampiro = false;
            }
        }
        if (!numVampiro) {
            System.out.println("Este número no es vampiro: " + num + " , prueba con otro distinto");
        }
    }
}
