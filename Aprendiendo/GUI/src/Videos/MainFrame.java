package Videos;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */

//Clase que hereda de JFrame, ya no es necesario establecer "frame" antes de cada método
public class MainFrame extends JFrame {
    
    //Declarar Area de texto
    private JTextArea textArea;
    
    //Declarar Botón
    private JButton btn;
    
    
    public MainFrame() {
        
        //Nombre del marco/ventana
        super("Hola Mundo!!!");

        // ?????
        setLayout(new BorderLayout());
        
        //Crea el área de texto
        textArea = new JTextArea();
        
        //Crea el botón
        btn = new JButton("Púlsame!");
        
        //Agrega componentes al panel indicando su posición
        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        
        //Establecer Tamaño fijo
        setSize(600, 500);

        //Poder cerrar la ventana al pulsar la X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Asigna visibilidad a la ventana
        setVisible(true);
    }
}
