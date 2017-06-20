package IntentandoExamen;

import javax.swing.SwingUtilities;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class Main {
    //Creado el objeto Frame que contiene la ventana del programa
    private static Frame frame1;
    
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
        
    }
    
    //Método que inicializa la ventana
    private static void start() {
        frame1 = new Frame("Animales");
    }
}