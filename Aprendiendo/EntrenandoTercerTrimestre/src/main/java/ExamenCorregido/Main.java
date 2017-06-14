package ExamenCorregido;

import javax.swing.SwingUtilities;

/**
 * Clase principal
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class Main {
    
    //Creado el objeto Frame que contiene la ventana del programa
    Frame frame1;
    
    //Método main que será invocado al ejecutar esta clase
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            //Se ejecuta el método "start()" dentro de este hilo creado
            @Override
            public void run() {
                start();
            }
        });
    }
    
    private static void start() {
        frame1 =  = new Frame("Animales");
    }
}
