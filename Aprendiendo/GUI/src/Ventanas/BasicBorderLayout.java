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

    //Crear y mostrar la interfaz. Debe ser invocado desde el hilo de envío de eventos
    private static void createAndShowGUI() {

        //Crear y levantar ventana
        JFrame frame = new JFrame("Raúl Caro Pastorino");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Configurar el panel de contenido
        addComponentsToPane(frame.getContentPane());
        //Utilizando BorderLayout predeterminado del panel de contenido sin necesitar:
        //setLayout(new BorderLayout());
        
        //Muestra la venta
        frame.pack();
        frame.setVisible(true);
    }

}
