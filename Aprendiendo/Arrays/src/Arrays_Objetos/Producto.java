package Arrays_Objetos;
/**
 * Clase complementaria del ejercicio 19
 * Desde esta clase se crearán los productos
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class Producto {
    //Variables con datos del producto
    public static int tmp,precio,stock; 
    public String nombre;
    
    //Constructor que recibe los atributos para el producto
    public Producto(String nombreInput, int precioInput, int stockInput) {
        nombre = nombreInput;
        precio = precioInput;
        stock = stockInput;
    }
    
    //Método que modifica la cantidad de stock
    public void cambiarStock(int stockInput) {
        stock = stockInput;
        mostrarProducto();
    }
    
    //Muestra el producto que se ha creado
    public void mostrarProducto() {
        System.out.println("\nNombre producto creado: " + nombre + " y su precio es " + precio + " Euros");
        System.out.println("Su stock es de " + stock + " unidades/kilos");
    }
    
    //Muestra el producto versión extendida, pensado para el método "mostrarProductos()"
    public void nombreProducto() {
        System.out.println("Nombre --> " + nombre);
        System.out.println("Precio --> " + precio + " Euros");
        System.out.println("Stock  --> " + stock);
    }
}
