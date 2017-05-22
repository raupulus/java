package Botones;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class ArrayBotones extends JFrame{
    JButton[] arrayBotones;
    TextArea texto;
    
    public ArrayBotones() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 700));
        setTitle("Soy un Array de Botones");
        setLayout(new FlowLayout());
    }
}
