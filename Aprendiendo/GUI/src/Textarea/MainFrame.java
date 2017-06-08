package Textarea;

import javax.swing.JFrame;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */

//Clase que hereda de JFrame, ya no es necesario establecer "frame" antes de cada método
public class MainFrame extends JFrame {

    public MainFrame() {
        
        //Nombre del marco/ventana
        super("Hola Mundo!!!");

        //Establecer Tamaño fijo
        setSize(600, 500);

        //Poder cerrar la ventana al pulsar la X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Asigna visibilidad a la ventana
        setVisible(true);
    }
}
