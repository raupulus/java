package Wrappers;
/**
 * Realiza un método "esCapicua que tome como parámetro un entero y devuelva
 * true si el número es capicúa y false en caso contrario. Utiliza
 * wrappers y objetos String.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Scanner;

public class Ej2 {
    private static final Scanner sc = new Scanner(System.in);
    private static Integer input,inputInvertido;

    public static void main(String[] args) {
        entrada(); //Pedir número por teclado
        comprobar(); //Comprobar que es capicúa
        
        if (input == inputInvertido) { //Compruebo que el número de entrada sea igual al mismo invertido
            System.out.println("Es capicúa (invertido es --> " + inputInvertido + ")");
        } else {
            System.out.println("No es capicúa (invertido es --> " + inputInvertido + ")");
        }
    }
    
    public static void entrada() { //Pedir número por teclado
        System.out.println("Introduce el número a comprobar si es capicúa:");
        input = sc.nextInt();
    }
    
    public static void comprobar() { //Comprobar que es capicúa
        StringBuilder alreves = new StringBuilder(Integer.toString(input)); //Convierto a cadena el número de entrada
        alreves = alreves.reverse(); //Invertir carácteres de la cadena
        
        inputInvertido = Integer.valueOf(alreves.toString()); //Devuelvo a int el número invertido
    }
}
