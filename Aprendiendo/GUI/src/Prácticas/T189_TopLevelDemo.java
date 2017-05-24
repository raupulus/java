package Prácticas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

/**
 * Añadiendo un componente SWING que no sea un JLabel
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class T189_TopLevelDemo {

    private static void createAndShowGUI() {

        //Crear ventana
        JFrame frame = new JFrame("TopLevelDemo");
        //Marcar que se cierre ventana al salir
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crear barra de menú
        JMenuBar greenMenuBar = new JMenuBar();
        
        //Marcar como visible la barra de menú
        greenMenuBar.setOpaque(true);
        
        //Establecer color a la barra de menú
        greenMenuBar.setBackground(new Color(154, 165, 127));
        
        //Establecer tamaño a la barra de menú
        greenMenuBar.setPreferredSize(new Dimension(200, 20));

        //Crear etiqueta amarilla para añadirla al panel
        JLabel yellowLabel = new JLabel();
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(248, 213, 131));
        yellowLabel.setPreferredSize(new Dimension(200, 180));

        //Añadir la barra de menú verde y 
        frame.setJMenuBar(greenMenuBar);
        frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);

        //Crear campo de comprobación y textarea
        JCheckBox checkbox = new JCheckBox("OPCIÓN MARCABLE");
        JTextArea textArea = new JTextArea();
        frame.getContentPane().add(checkbox, BorderLayout.SOUTH);
        frame.getContentPane().add(textArea, BorderLayout.NORTH);

        //Mostrar
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Ejecutando el programa
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
