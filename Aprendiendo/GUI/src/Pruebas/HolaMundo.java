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
        JFrame frame = new JFrame("Soy el título"); //Construye el JLabel
        final JLabel label = new JLabel("¡Hola Mundo!"); //Agrega el JLabel
        frame.getContentPane().add(label);

        //Cerrar ventana al salir
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.pack();
        frame.setVisible(true);
    }
}
