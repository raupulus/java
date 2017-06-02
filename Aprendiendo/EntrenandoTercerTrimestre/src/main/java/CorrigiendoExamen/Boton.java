package CorrigiendoExamen;

import javax.swing.JButton;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Boton extends JButton {
    
    public Boton(String nombre) {
        super(nombre);
    }
    
    @Override
    public String toString() {
        return getText();
    }
}
