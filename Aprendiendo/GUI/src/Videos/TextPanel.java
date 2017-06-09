package Videos;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */

//Clase principal que extiende 
public class TextPanel extends JPanel{
    //Declara textArea
    private JTextArea textArea;
    
    public TextPanel() {
        //Crea el textArea
        textArea = new JTextArea();
        
        //????
        setLayout(new BorderLayout());
        
        //Añadir el textArea al BorderLayout en el centro con barra de scroll
        //nótese que se crea el elemento "JScrollPane" pasándole como parámetro textArea
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }
}
