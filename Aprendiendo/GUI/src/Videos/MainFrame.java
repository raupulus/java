package Videos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */

//Clase que hereda de JFrame, ya no es necesario establecer "frame" antes de cada método
public class MainFrame extends JFrame {

    //Crea un panel que será un objeto de la clase TextPanel
    private TextPanel textPanel;
    
    //Declarar Botón
    private JButton btn;
    
    public MainFrame() {
        
        //Nombre del marco/ventana
        super("Hola Mundo!!!");

        // ?????
        setLayout(new BorderLayout());
        
        //Crea el área de texto
        //textArea = new JTextArea();
        textPanel = new TextPanel();
        
        //Crea el botón
        btn = new JButton("Púlsame!"); 
        
        //Añade evento al botón
        btn.addActionListener(new ActionListener() {
            //Método a ejecutar cuando ocurra el evento
            public void actionPerformed(ActionEvent e) {
                //Pintar dentro del área de texto "textArea" llamando al método
                //creado en "TextPanel" pasándole un String con lo que pintar
                textPanel.appendText("Estoy escribiendo!\n");
            }  
        });
        
        //Agrega componentes al panel indicando su posición
        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        
        //Establecer Tamaño fijo
        setSize(600, 500);

        //Poder cerrar la ventana al pulsar la X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Asigna visibilidad a la ventana
        setVisible(true);
    }
}