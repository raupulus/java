/*
 * Realiza un programa utilizando bucles que muestre la siguiente figura:
 *                  *
 *                 ***
 *                *****
 * @author fryntiz
 */
package Ejercicios_en_clase;

public class Ej1 {
    public static int x = 1,b = 1, e = 3;
    public static void main(String[] args) {
        while (x <= 3) {
            System.out.print("\n");
            for(int i = 0; i < b; i ++) {
                
                for(int o = 0; o<e; o++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            e=e-2;
            b = b+2;
            x++;
        } 
        
        System.out.print("\n");
    }
}
