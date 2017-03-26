package Wrappers;
/**
 * Realiza una clase conversor que tenga las siguientes características:
 * -Toma como parámetro en el constructor un valor entero
 * -Tiene como parámetro en el constructor un valor entero
 * -Tiene un método "getNumero" que dependiendo del parámetro devolverá el mismo número en el siguiente formato:
 * 
 * B --> Binario (String)
 * H --> Hexadecimal (String)
 * O --> Octal (String)
 * 
 * Realizar un método main en la clase para probar todo lo anterior
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Scanner;
public class Ej3 {
    private static final Scanner sc = new Scanner(System.in);
    private static int input;
    private static String input1;
    
    public static void main(String[] args) {
        entrada(); //Introducir el número
    }
    
    public static void entrada() {
        //Pedir número
        input = sc.nextInt();
        
        //Crea el objeto desde la clase
        Ej3_Conversor ejercicio = new Ej3_Conversor(input);
        
        
        //Pedir parámetro
        boolean salir = false;
        while (!salir) { //Menú para pedir opción a realizar
            System.out.println("Pulsa B para Binario");
            System.out.println("Pulsa H para Hexadecimal");
            System.out.println("Pulsa O para Octal");
            System.out.println("para salir introduce \"salir\"");
            input1 = sc.next();
            
            if ( //Comprobar valores válidos
                ("B".equalsIgnoreCase(input1)) |
                ("H".equalsIgnoreCase(input1)) |
                ("O".equalsIgnoreCase(input1))) {
                System.out.println(ejercicio.getNumero(input1));
            } else if
               (("salir".equalsIgnoreCase(input1)) |
                ("Salir".equalsIgnoreCase(input1)) |
                ("SALIR".equalsIgnoreCase(input1))) {
                salir = true;
            } else {
                System.out.println("El valor introducido es incorrecto (B,H,O)");
            }
        }
    }
}
