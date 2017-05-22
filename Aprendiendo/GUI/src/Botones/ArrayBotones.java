package Botones;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */

public class ArrayBotones extends JFrame {
    static JButton[] arrayBotones; //Creo un array de objetos botones
    static TextArea texto; //Creo un objeto TextArea
 
    
    public ArrayBotones() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar al salir
        setPreferredSize(new Dimension(700, 700)); //Tamaño
        setTitle("Soy un Array de Botones"); //Título
        setLayout(new FlowLayout());
        
    }
    
    //Botones
    generarBotones(40);
    for (int i = 0; i < arrayBotones.lenght; i++) {
        add(arrayBotones[i]);
    }
    
    texto = new TextArea();
    add(texto);
    
    //Hacerlo visible
    pack();
    setVisible(true);
    
    
    //Metodo para crear botones 
    public static void generarBotones(int cantidad) {
        String boton = "Botón";
        arrayBotones = new JButton[cantidad];
        
        //Rellenar array de botones
        for (int i = 0; i < cantidad; i++) {
            arrayBotones[i] = new JButton(texto + (i + 1));
            arrayBotones[i].setPreferredSize(new Dimension(100, 50));
            arrayBotones[i].addActionListener(new MiReceptor());;
        } 
    }
    
    public static void main(String[] args) {
        ArrayBotones b = new ArrayBotones();
    }
    
    static class MiReceptor implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            texto.append("Has pulsado el " + e.getActionCommand() + "\n");
        }
    }
}
