package Básicos;
/**
 * Escribe un programa en Java que pida dos cadenas y entre en un menú donde se
 * utilicen todos los métodos vistos en clase para la manipulación de cadenas
 * (Strings) y vayas mostrando sus resultados:
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
import java.util.Scanner;
public class EJ44 {
    private static final Scanner sc = new Scanner(System.in);
    private static int input;
    
    public static void main(String[] args) {
        entrada();
        menu();
    }
    
    public static void entrada() {
        //Entrada de cadenas para comenzar el programa
        String C1 = sc.next();
        String C2 = sc.next();
    }
    
    public static void menu() {
        boolean salir = false;
        
        while (salir) {
            System.out.println("0 - SALIR!!!");
            System.out.println("1 - Método equals");
            System.out.println("2 - Método compareTo");
            System.out.println("3 - valueOf.toCharArray");
            System.out.println("4 - length");
            System.out.println("5 - concat(cadena2)");
            System.out.println("6 - charAt(indice)");
            System.out.println("7 - substring(desde,hasta)");
            System.out.println("8 - indexOf()");
            System.out.println("9 - lasIndexOf(),");
            System.out.println("10 - endsWith(texto)");
            System.out.println("11 - startsWith(texto)");
            System.out.println("12 - replace(caracter1,caracter2)");
            System.out.println("13 - replaceALL(cadena1,cadena2)");
            System.out.println("14 - toUpperCase()");
            System.out.println("15 - toLowerCase()");
            System.out.println("16 - split(patrón");
            
            input = sc.nextInt();
            
            switch (input) {
                case 0:
                    salir = true;
                    break;
                case 1:
                    
                    break;
                default:
                    
                    break;
            }
        }
    }
}
