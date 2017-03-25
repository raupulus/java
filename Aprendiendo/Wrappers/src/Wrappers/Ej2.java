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
        entrada();
        comprobar();
        if (input == inputInvertido) {
            System.out.println("Es capicúa (invertido es --> " + inputInvertido + ")");
        } else {
            System.out.println("No es capicúa (invertido es --> " + inputInvertido + ")");
        }
    }
    
    public static void entrada() {
        System.out.println("Introduce el número a comprobar si es capicúa:");
        input = sc.nextInt();
    }
    
    public static void comprobar() {
        Integer tmp, alreves;
        tmp = input;
        while (tmp > 0) {
            alreves.concat(tmp%10);
            tmp = tmp - (tmp%10);
        }
    }
}
