package Pruebas;

/**
 * Una clase sencilla
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import javax.swing.*;
import java.awt.*;

public class Prueba3 extends JFrame {

    JButton boton;
    JLabel etiqueta;
    JButton otroBoton;
    JPanel panel;

    public static void main(String[] args) {
        new Prueba3();
    }
    
    public Prueba3() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        getContentPane().add(panel);
        etiqueta = new JLabel("Una etiqueta");
        boton = new JButton("Un botón");
        otroBoton = new JButton("Otro Botón");
        panel.add(boton,
          BorderLayout.SOUTH
        );
        panel.add(etiqueta,
          BorderLayout.WEST
        );
        panel.add(otroBoton,
          BorderLayout.NORTH
        );
    }
}
