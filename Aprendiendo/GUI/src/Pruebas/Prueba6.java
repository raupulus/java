package Pruebas;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Prueba6 {

    public static void main(String[] args) {

        //Con Runnable agregamos otro hilo
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Crea la ventana
                JFrame frame = new JFrame("Hola Mundo");

                //Establecer Tamaño fijo
                frame.setSize(600, 500);

                //Poder cerrar la ventana al pulsar la X
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                //Asigna visibilidad a la ventana
                frame.setVisible(true);
            }
        });
    }
}
