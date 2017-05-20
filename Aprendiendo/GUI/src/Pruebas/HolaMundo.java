package Pruebas;

/**
 * Clase donde creo un Hola Mundo Básico
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HolaMundo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Soy el título"); //Titulo ventana
        final JLabel label = new JLabel("¡Hola Mundo!"); //Contenido de ventana
        frame.getContentPane().add(label);

        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        );

        frame.pack();
        frame.setVisible(true);
    }
}
