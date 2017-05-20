package Ventanas;

/**
 * Border Layout
 *
 * Norte, Sur, Este, Oeste
 *
 * Autodimensionable
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

public class BasicBorderLayout {

    public static boolean RIGHT_TO_LEFT = false;

    //Método que agrega componentes al panel
    public static void addComponentsToPane(Container pane) {
        if (!(pane.getLayout() instanceof BorderLayout)) {
            pane.add(new JLabel("¡Este contenedor no usa BorderLayout!"));
            return;
        }
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(
              java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        }

        JButton button = new JButton("Botón 1");
        pane.add(button, BorderLayout.PAGE_START);

        //Botón central grande (Es el uso más típico)
        button = new JButton("Botón2 \n CENTRO");
        button.setPreferredSize(new Dimension(200, 100));
        pane.add(button, BorderLayout.CENTER);

        button = new JButton("Botón3 OESTE");
        pane.add(button, BorderLayout.LINE_START);

        button = new JButton("Botón4 SUR");
        pane.add(button, BorderLayout.PAGE_END);

        button = new JButton("Botón5 ESTE");
        pane.add(button, BorderLayout.LINE_END);
    }

    
}
