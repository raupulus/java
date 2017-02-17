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
    public static Producto claseTienda = new Producto();
    public static boolean salir;
    private static final Scanner sc = new Scanner(System.in);
    private static int input,tmp1;
    private static int tmp;
    private static String[] productos = new String[10]; //Nombre del producto, el ID es el prefijo "prod_" más la posición
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() { //Menú principal
        while(!salir) {
            System.out.println("\n***** Tienda --> \"El Glotón\" *****");
            System.out.println("1 - Dar de alta un producto nuevo");
            System.out.println("2 - Buscar producto por ID");
            System.out.println("3 - Modificar el stock de un producto");
            System.out.println("4 - Eliminar producto");
            System.out.println("5 - Salir del programa");
            //Plantear subMenú para elimiminar producto (muestra todos y su stock) e introducir el que se borra
            //Plantear método para eliminar producto
            
            input = sc.nextInt();
            
            switch (input) {
                case 5:
                    salir = true;
                    break;
                case 4:
                    //Eliminar producto y stock del mismo (la misma posición asociada)
                    break;
                case 3:
                    //Modificar el array "stock" en la posición del producto elegido
                    break;
                case 2:
                    //Método "buscar" en clase "Tienda" pasándole el valor de entrada
                    break;
                case 1:
                    //Crear un objeto y almacenarlo como string en el array "productos"
                    String nombre;
                    
                    System.out.println("Nombre del producto: ");
                    nombre = sc.toString();
                    Producto producto = new Producto();
                    break;
                default:
                    System.out.println("\n¿Tienes un catálogo de salchichas en las manos? pulsa solo una tecla numérica entre 1 y 5\n");
                    break;
            }
        }
    }
}
