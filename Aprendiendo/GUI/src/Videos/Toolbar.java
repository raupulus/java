package Videos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> --> https://github.com/fryntiz
 */
public class Toolbar extends JPanel implements ActionListener {
    
    //Creo botones
    private JButton helloButton;
    private JButton goodbyeButton;
    
    //Declaro TextPanel para luego poder modificarlo
    private TextPanel textPanel;
    
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

    //Método para modificar el TextPanel al pulsar un boton del toolbar
    public void setTextPanel (TextPanel textpanel) {
        this.textPanel = textPanel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Convierte a tipo JButon el evento que llega 
        JButton clicked = (JButton) e.getSource();
         
        //Muestra por la consola que un boton ha sido pulsado
        System.out.println("Se ha pulsado " + clicked.getText());
        
        //Muestra que se ha pulsado un botón escrito dentro del area de texto
       textPanel.appendText(clicked.getText());
        
    }
}
