package Básicos;
/**
 * Que lea una cadena y diga cuantas Mayúsculas hay
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
import java.util.Scanner;
public class EJ39 {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Introduce una cadena para contar los carácteres");
        
        String input = sc.nextLine(); //Pide introducir la cadena
        
        System.out.println("La cadena contiene " + input.length() + " caracteres"); //Muestra la cadena y su longitud
        
        int contador = 0;
        String tmp;
        
        for (int i = 0; i< input.length(); i++) { //Comprueba que es Mayúsculas y suma en el contador si se cumple
            tmp = ""+input.charAt(i);
            if (tmp.matches("[A-Z]")) {
                contador++;
            }
        }
        
        System.out.println("\nEl número de Mayúsculas es " + contador); //Muestra las vocales
    }
}

