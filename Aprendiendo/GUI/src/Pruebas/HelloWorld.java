package Pruebas;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class HelloWorld {
    private static void createAndShowGUI() {
        //Crear y levantar ventana
        JFrame frame = new JFrame("Hello World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar al salir

        //Añadir etiqueta
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        //Mostrar la ventana
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
