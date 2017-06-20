package IntentandoExamen;

import java.util.LinkedList;
import java.util.List;
import javax.swing.SwingUtilities;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class Main {
    //Creado el objeto Frame que contiene la ventana del programa
    private static Frame frame1;
    private static List<Animal> listaAnimales;
    private static int cantidadAnimales = EnumTipoAnimal.values().length;
    
    public static void main(String[] args) {
        listaAnimales();
        
        //Se crea un nuevo hilo donde correrá la venta
        SwingUtilities.invokeLater(new Runnable() {
            
            //Se ejecuta el método "start()" dentro de este hilo creado
            @Override
            public void run() {
                start();
            }
        });
    }
    
    //Método para crear lista de animales
    public static void listaAnimales() {
        listaAnimales = new LinkedList<>();
        
        //Crear un objeto de la clase Animal
        for (int i = 0; i < cantidadAnimales; i++) {
            //Obtiene el nombre de la lista enumerada según el valor de "i"
            listaAnimales.add(new Animal(EnumTipoAnimal.values()[i].name()));
        }
    }
    
    //Método que inicializa la ventana
    private static void start() {
        frame1 = new Frame("Animales", listaAnimales, cantidadAnimales);
    }
}