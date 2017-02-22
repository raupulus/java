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
    //public static Producto newProducto = new Producto();
    public static boolean salir;
    private static Scanner sc = new Scanner(System.in);
    private static int input,tmp,tmp1,contador = 0;
    private static String aux;
    private static Producto[] productos = new Producto[10]; //Nombre del producto, el ID es el prefijo "prod_" más la posición
    
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
            System.out.println("5 - Mostrar Productos almacenados");
            System.out.println("6 - Salir del programa");
            
            input = sc.nextInt();
            
            switch (input) {
                case 6:
                    salir = true;
                    break;
                case 5:
                    mostrarProductos();
                    break;
                case 4:
                    //Eliminar producto y stock del mismo (la misma posición asociada)
                    eliminarProductos();
                    break;
                case 3:
                    //Modificar el array "stock" en la posición del producto elegido
                    modificarStock();
                    break;
                case 2:
                    //Método "buscar" en clase "Tienda" pasándole el valor de entrada
                    buscarID();
                    break;
                case 1:
                    //Crear un objeto y almacenarlo como string en el array "productos"
                    comprobarAntesDeAñadir();
                    break;
                default:
                    System.out.println("\n¿Tienes un catálogo de salchichas en las manos? pulsa solo una tecla numérica entre 1 y 5\n");
                    break;
            }
        }
    }
    
    public static void comprobarAntesDeAñadir() {
        if (contador>=productos.length) {
            System.out.println("La capacidad de la tienda es de 10 productos");
            System.out.println("¿Quiere reemplazar un producto? (si/no | Si/No | SI/NO");
            aux = sc.next();
            if ((aux == "si") | (aux == "Si") | (aux == "SI")) {
                
            }
        } else {
            
        }
    }
    
    public static void añadirProducto() {//Crear un objeto y almacenarlo como string en el array "productos"
        String nombre = "";
        while (nombre == "") {
            System.out.println("\nIntroduce el nombre del producto:");
            nombre = sc.next();
        }
        
        int precio = 0;
        while (precio == 0) {
            System.out.println("\nIntroduce el precio del producto");
            precio = sc.nextInt();
        }
        
        int stock = 0;
        while (stock == 0) {
            System.out.println("\nStock inicial del producto:");
            stock = sc.nextInt();
        }
                
        productos[contador] = new Producto(nombre,precio,stock);
        productos[contador].mostrarProducto();
        contador++;
    }
    
    public static void buscarID() {
        System.out.println("Introduce el ID que deseas buscar (el ID es la posición en el array");
        tmp = sc.nextInt();
        
        //Compruebo que existe ese producto
        if (productos[tmp] != null) {
             productos[tmp].nombreProducto(); //Muestra el producto
        } else {
            System.out.println("No existe ese producto");
        }
    }
    
    public static void modificarStock() {
        //Entrada del "id" para modificar stock
        System.out.println("\nSelecciona el ID del producto para modificar stock");
        tmp = sc.nextInt();
        
        //Muestro el stock actual del producto elegido
        System.out.println(productos[tmp].stock);
        
        //Entrada del nuevo stock
        System.out.println("Introduce el nuevo stock");
        if (productos[tmp] != null) {
            tmp1 = sc.nextInt();
            productos[tmp].cambiarStock(tmp1);
        } else {
            System.out.println("Ese producto no existe, prueba a Mostrar los productos");
        }
        
    }
    
    public static void mostrarProductos() {
         for(int i=0;i<productos.length;i++) {
             //Primero compruebo que no está vacio ese producto
             if (productos[i] != null) {
                 productos[i].nombreProducto();
                 System.out.println("ID  --> " + i);
             }
        }
    }
    
    public static void eliminarProductos() {
        System.out.println("Selecciona el ID del producto para eliminar");
        tmp = sc.nextInt();
        //Pongo ese producto como "null" cuando es eliminado
        if (productos[tmp] != null) {
            productos[tmp] = null;
            System.out.println("Se ha eliminado correctamente el producto");
        } else {
            System.out.println("No se puede eliminar un producto que no existe");
        }
    }
}
