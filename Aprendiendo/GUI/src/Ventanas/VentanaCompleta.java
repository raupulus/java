package Ventanas;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaCompleta extends JPanel {
    JLabel jlabel;
    public VentanaCompleta() {
        initComponentes();
    }
    
    private void initComponentes() {
        jlabel = new JLabel("Soy un JLabel");
        this.add(jlabel); //Añadido al panel
        
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
    }
}
