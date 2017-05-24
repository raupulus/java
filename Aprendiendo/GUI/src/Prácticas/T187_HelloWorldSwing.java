package Prácticas;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Ventana básica con un botón
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class T187_HelloWorldSwing {
    
    private static void createAndShowGUI() {
        //Crear Ventana
        JFrame frame = new JFrame("Hello World Swing");
        
        //Marcar ventana para cerrar al salir
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Añado etiqueta 
        JLabel label = new JLabel("Etiqueta Hello World");
        frame.getContentPane().add(label, BorderLayout.NORTH);
        
        //Agrego un botón
        JButton button = new JButton("Soy un botón");
        frame.getContentPane().add(button, BorderLayout.CENTER);
        
        //Autoajustar al contenido la ventana
        frame.pack();
        
        //Marcar la ventana como visible
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
