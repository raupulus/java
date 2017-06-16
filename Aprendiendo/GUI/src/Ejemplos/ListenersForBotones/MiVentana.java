package Ejemplos.ListenersForBotones;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class MiVentana extends JFrame {

    static final ArrayList<String> titulos;
    private JButton[] botones;
    private JTextArea t;
    private JPanel p;
    Dimension d;

    static {
        titulos = new ArrayList<>();
        titulos.addAll(Arrays.asList("ROJO", "VERDE", "AZUL", "NARANJA", "AMARILLO"));
    }

    public MiVentana() {

        super("MiVentana");

        // Panel para los botones
        p = new JPanel();

        // Tamaño botones
        Dimension d = new Dimension(100, 20);

        botones = new JButton[titulos.size()];
        for (int i = 0; i < botones.length; i++) {
            botones[i] = new JButton(titulos.get(i));
            botones[i].setPreferredSize(d);
            p.add(botones[i]);
        }

        t = new JTextArea();

        setLayout(new BorderLayout());
        add(p, BorderLayout.NORTH);
        add(new JScrollPane(t), BorderLayout.CENTER);

        // Listener para todos los botones
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.append(e.getActionCommand() + "\n");
            }
        };

        for (JButton b : botones) {
            b.addActionListener(al);
        }

    }

}
