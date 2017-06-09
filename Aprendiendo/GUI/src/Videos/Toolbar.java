package Videos;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Toolbar extends JPanel {
    
    //Creo botones
    private JButton helloButton;
    private JButton goodbyeButton;
    
    public Toolbar() {
        
        //Añado botones
        helloButton = new JButton("Holaaa!");
        goodbyeButton = new JButton("Ta luegooo!");
        
        setLayout(new FlowLayout());
        
        add(helloButton);
        add(goodbyeButton);
    }
}
