package Básicos;
/**
 * Escribe un programa en Java que pida dos cadenas y entre en un menú donde se
 * utilicen todos los métodos vistos en clase para la manipulación de cadenas
 * (Strings) y vayas mostrando sus resultados:
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */



//EJERCICIO NO TERMINADO!!!!!  ---> Voy por la parte 9


import java.util.Scanner;
public class EJ44 {
    private static final Scanner sc = new Scanner(System.in);
    private static int input;
    private static String c1,c2;
    
    public static void main(String[] args) {
        entrada();
        menu();
    }
    
    public static void entrada() {
        //Entrada de cadenas para comenzar el programa
        System.out.println("Introduce la cadena 1");
        c1 = sc.nextLine();
        System.out.println("Introduce la cadena 2");
        c2 = sc.nextLine();
    }
    
    public static void menu() {
        boolean salir = false;
        
        while (!salir) {
            System.out.println("0 - SALIR!!!");
            System.out.println("1 - Método equals");
            System.out.println("2 - Método compareTo");
            System.out.println("3 - Método valueOf.toCharArray");
            System.out.println("4 - Método length");
            System.out.println("5 - Método concat(cadena2)");
            System.out.println("6 - Método charAt(indice)");
            System.out.println("7 - Método substring(desde,hasta)");
            System.out.println("8 - Método indexOf()");
            System.out.println("9 - Método lastIndexOf(),");
            System.out.println("10 - Método endsWith(texto)");
            System.out.println("11 - Método startsWith(texto)");
            System.out.println("12 - Método replace(caracter1,caracter2)");
            System.out.println("13 - Método replaceALL(cadena1,cadena2)");
            System.out.println("14 - Método toUpperCase()");
            System.out.println("15 - Método toLowerCase()");
            System.out.println("16 - Método split(patrón");
            System.out.println("17 - Método Cambiar cadenas");
                
            
            input = sc.nextInt();
            
            switch (input) {
                case 0:
                    salir = true;
                    break;
                case 1:
                    System.out.println("\n\nEl método equals devuelve : " + c1.equals(c2) + "\n\n");
                    break;
                case 2:
                    System.out.println("\n\nEl método compareTo devuelve : " + c1.compareTo(c2) + "\n\n");
                    break;
                case 3:
                    System.out.println("\n\nEl método valueOf.toCharArray devuelve : " + c1.valueOf(c2) + "\n\n");
                    break;
                case 4:
                    System.out.println("\n\nEl método length() devuelve : " + c1.length() + " y " + c2.length() + "\n\n");
                    break;
                case 5:
                    System.out.println("\n\nEl método concat devuelve : " + c1.concat(c2) + "\n\n");
                    break;
                case 6: //No funciona
                    System.out.println("\n\nEl método charAt(5) devuelve : " + c1.charAt(5) + " y " + c2.charAt(5) + "\n\n");
                    break;
                case 7: //No funciona
                    System.out.println("\n\nEl método substring(2, 12) devuelve : " + c1.substring(2, 12) + " y " + c2.substring(2, 12) + "\n\n");
                    break;
                case 8:
                    System.out.println("\n\nEl método indeOf() devuelve : " + c1.indexOf(c2) + "\n\n");
                    break;
                case 9:
                    System.out.println("\n\nEl método lastIndexOf() devuelve : " + c1.lastIndexOf(c2) + "\n\n");
                    break;
                case 10:
                    System.out.println("\n\nEl método endsWith(texto) devuelve : " + c1.endsWith(c2) + "\n\n");
                    break;
                case 11:
                    System.out.println("\n\nEl método startsWith(texto) devuelve : " + c1.endsWith(c2) + "\n\n");
                    break;
                case 12:
                    System.out.println("\n\nEl método replace(a,e) devuelve : " + c1.replace("a","b") + " y " + c2.replace("a","b") + "\n\n");
                    break;
                case 13:
                    System.out.println("\n\nEl método replaceAll(as,BOING) devuelve : " + c1.replaceAll("as", "BOING") + " y " + "\n\n");
                    break;
                case 14:
                    
                    break;
                case 15:
                    
                    break;
                case 16:
                    
                    break;
                case 17:
                    
                    break;
                default:
                    
                    break;
            }
        }
    }
}
