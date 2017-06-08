package Textarea;

import javax.swing.JFrame;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class MainFrame extends JFrame {

    public MainFrame() {
        super("Hello World");
        //Crea la ventana
        JFrame frame = new JFrame("Hola Mundo");

        //Establecer Tamaño fijo
        frame.setSize(600, 500);

        //Poder cerrar la ventana al pulsar la X
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Asigna visibilidad a la ventana
        frame.setVisible(true);
    }
}
