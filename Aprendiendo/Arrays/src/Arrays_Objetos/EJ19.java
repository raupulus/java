package Arrays_Objetos;
/**
 * Desarrolla un programa que usando un menú permita gestionar el stock de una tienda de comestibles.
 * La información a recoger será: id del producto, nombre del producto, precio, cantidad en stock.
 * La tienda debe disponer de 10 productos distintos. El programa utilizará un menú del tipo:
 * 1 - Dar de alta un producto nuevo
 * 2 - Buscar producto por ID
 * 3 - Modificar el stock de un producto
 * 4 - Eliminar producto
 * 5 - Salir del programa
 * 
 * Este ejercicio se complementa con la clase "Tienda" para crear productos
 * 
 * @author fryntiz
 */
import java.util.*; //Añadidas librerías
public class EJ19 {
    public static boolean salir;
    private static final Scanner sc = new Scanner(System.in);
    private static int input;
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() { //Menú principal
        while(!salir) {
            System.out.println("1 - Dar de alta un producto nuevo");
            System.out.println("2 - Buscar producto por ID");
            System.out.println("3 - Modificar el stock de un producto");
            System.out.println("4 - Eliminar producto");
            System.out.println("5 - Salir del programa");
            input = sc.nextInt();
            
            switch (input) {
                case 5:
                    salir = true;
                    break;
                case 4:
                    break;
                case 3:
                    break;
                case 2:
                    break;
                case 1:
                    break;
                default:
                    break;
            }
        }
    }
}
