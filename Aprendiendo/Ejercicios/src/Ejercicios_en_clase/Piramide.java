/*
 * Realiza un programa que utilizando recursividad muestre por pantala la siguiente pirámide:
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 */
package Ejercicios_en_clase;

public class Piramide {
    public static int x = 0;
    public static void main(String[] args) {
        for(int i = 0; i<5; i++) {
            for(int b = 0; b<=x; b++) {
                System.out.print(b);
                System.out.print(" ");
            }
            
            
        }
    }
    
}
