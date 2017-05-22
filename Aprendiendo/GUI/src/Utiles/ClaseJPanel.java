package Utiles;

/**
 * Esta clase permite crear JPanel al ser instanciada desde otra
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClaseJPanel extends JPanel {
    JLabel jlabel;
    public ClaseJPanel() {
        initComponentes();
    }
    
    private void initComponentes() {
        jlabel = new JLabel("Soy un JLabel");
        this.add(jlabel); //Añadido al panel
        
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
    }
}
