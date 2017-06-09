package Videos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Toolbar extends JPanel implements ActionListener {
    
    //Creo botones
    private JButton helloButton;
    private JButton goodbyeButton;
    
    public Toolbar() {
        
        //Añado botones
        helloButton = new JButton("Holaaa!");
        goodbyeButton = new JButton("Ta luegooo!");
        
        //Escuchar botones
        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);
        
        //Establecer borde hacia la izquierda
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(helloButton);
        add(goodbyeButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Muestra por la consola que un boton ha sido pulsado
        System.out.println("Un botón ha sido pulsado");
        
        //Muestra que se ha pulsado un botón escrito dentro del area de texto
        JButton clicked = (JButton) e.getSource();
    }
}
