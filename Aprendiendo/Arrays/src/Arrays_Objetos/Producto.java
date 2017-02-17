package Arrays_Objetos;
/**
 * Clase complementaria del ejercicio 19
 * Desde esta clase se crearán los productos
 * @author fryntiz
 */
public class Producto {
    private static int contador = 0,tmp,precio,stock;
    private static String nombre;
    
    
    public Producto(String nombreInput, int precioInput, int stockInput) {
        nombre = nombreInput;
        precio = precioInput;
        stock = stockInput;
    }
    
    public void mostrarProducto() {
        System.out.println("\nNombre producto creado: " + nombre + " y su precio es " + precio + " Euros");
        System.out.println("Su stock es de " + stock + " unidades/kilos");
    }
    
    public void nombreProducto() {
        System.out.println();
    }
}
