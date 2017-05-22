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

public class ArrayBotones extends JFrame {
    JButton[] arrayBotones; //Creo un array de objetos botones
    TextArea texto; //Creo un objeto TextArea
 
    
    public ArrayBotones() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar al salir
        setPreferredSize(new Dimension(700, 700)); //Tamaño
        setTitle("Soy un Array de Botones"); //Título
        setLayout(new FlowLayout());
        
    }
    
    //Metodo para crear botones 
    public void generarBotones(int cantidad) {
        String boton = "Botón";
        arrayBotones = new JButton[cantidad];
         
    }
}
