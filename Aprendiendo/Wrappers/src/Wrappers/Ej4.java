package Wrappers;
/**
 * Programa que transforme un número entero, mayor o igual que 0
 * a binario de dos formas diferentes:
 * -Utilizando algún método de la clase Integer
 * -Creando un método que utilice arrays para almacenar los restos y el último cociente
 * 
 * Utilizando Wrappers, crea un programa que pida un número por teclado al usuario
 * en binario y lo transforme a decimal, a hexadecimal y a octal.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Scanner;
public class Ej4 {
    private static final Scanner sc = new Scanner(System.in);
    private static int input;
    
    public static void main(String[] args) {
        entrada();
        
    }
    
    public static void entrada() {
        System.out.println("Introduce un número entero");
        input = sc.nextInt();
    }
    
    public static void menu() {
        
    }
}
