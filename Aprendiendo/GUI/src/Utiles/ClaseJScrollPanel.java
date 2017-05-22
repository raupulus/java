package Utiles;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class ClaseJScrollPanel extends JScrollPane {
    JLabel jlabel;
    
    public ClaseJScrollPanel() {
        initComponents();
    }
    
    private void initComponents() {
        //Icon image new ImageIcon("./image.jpg");
        //jlabel = new JLabel(image);
        //this.getViewport().add(jlabel);
        //this.setBorder(BorderFactory.createBevelBorder(Color.RED));
        
        jlabel = new JLabel(""
          + "Hola soy un JScrollPane"
          + "Incluyo muchas líneas"
          + "Y además una barra para desplazarte");
        this.add(jlabel); //Añadido al panel
        
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
    }
}
