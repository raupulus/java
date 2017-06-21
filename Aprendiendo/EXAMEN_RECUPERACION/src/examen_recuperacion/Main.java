package examen_recuperacion;

import java.awt.Frame;
import javax.swing.SwingUtilities;

/**
 * Clase principal para el ejercicio del examen
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Main {

    private static Diccionario diccionario1;
    
    private static MiVentana frame1;
    
    public static void main(String[] args) {
        diccionario1 = new Diccionario();
        
        diccionario1.ordenar();
        
        //Buscar una palabra:
        //diccionario1.buscar("ANATEMA");
        
        //Se crea un nuevo hilo donde correrá la venta
        SwingUtilities.invokeLater(new Runnable() {
            
            //Se ejecuta el método "start()" dentro de este hilo creado
            @Override
            public void run() {
                start();
            }
        });
    }

    //Método que inicializa la ventana
    private static void start() {
        frame1 = new MiVentana("EXAMEN_RECUPERACION");
    }
}
