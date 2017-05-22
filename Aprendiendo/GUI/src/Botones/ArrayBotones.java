package Botones;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Esta clase permite crear JPanel al ser instanciada desde otra
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */

public class ArrayBotones extends JFrame {

    static JButton[] botones;
    static TextArea ta;

    public ArrayBotones() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 700));
        setTitle("Array de botones");
        setLayout(new FlowLayout());

        // Botones
        crearBotones(40);
        for (int i = 0; i < botones.length; i++) {
            add(botones[i]);
        }
        ta = new TextArea();
        add(ta);

        // Para hacerlo visible
        pack();
        setVisible(true);
    }

    public static void crearBotones(int numero) {
        String str = "Botón ";
        botones = new JButton[numero];
        for (int i = 0; i < numero; i++) {
            botones[i] = new JButton(str + (i + 1));
            botones[i].setPreferredSize(new Dimension(100, 50));
            botones[i].addActionListener(new MiReceptor());
        }
    }

    public static void main(String[] args) {
        ArrayBotones b = new ArrayBotones();
    }

    static class MiReceptor implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ta.append("Has pulsado el "+e.getActionCommand() + '\n');
        }
    }
}