package Botones;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Este archivo creará un array de botones que se agregarán a un panel
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */

public class ArrayBotones extends JFrame {
    
    static int cantidadBotontes = 40;
    static JButton[] arrayBotones;
    static TextArea texto;

    public ArrayBotones() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 700));
        setTitle("Array de botones");
        setLayout(new FlowLayout());

        //Llama a la función para generar los botones
        generarBotones(cantidadBotontes);
        
        //Recorre el array de botones añadiéndolos al panel
        for (int i = 0; i < arrayBotones.length; i++) {
            add(arrayBotones[i]);
        }
        texto = new TextArea();
        add(texto);

        // Alinea automáticamente
        pack();
        
        //Vuelve visible
        setVisible(true);
    }

    //Método para generar botones
    public static void generarBotones(int numero) {
        String str = "Botón ";
        arrayBotones = new JButton[numero];
        for (int i = 0; i < numero; i++) {
            arrayBotones[i] = new JButton(str + (i + 1));
            arrayBotones[i].setPreferredSize(new Dimension(100, 50));
            arrayBotones[i].addActionListener(new MiReceptor());
        }
    }

    //Main que crea una instancia de esta misma clase
    public static void main(String[] args) {
        ArrayBotones b = new ArrayBotones();
    }

    //Evento que reacciona al pulsar un botón generado
    static class MiReceptor implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            texto.append("Has pulsado el "+e.getActionCommand() + '\n');
        }
    }
}