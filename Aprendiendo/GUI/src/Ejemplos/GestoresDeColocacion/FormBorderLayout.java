package Ejemplos.GestoresDeColocacion;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FormBorderLayout extends JFrame {

    final String[] nombres = {"CENTRO", "NORTE", "SUR", "ESTE", "OESTE"};
    final String[] colocaciones = {BorderLayout.CENTER,
        BorderLayout.NORTH,
        BorderLayout.SOUTH,
        BorderLayout.EAST,
        BorderLayout.WEST};
    JButton[] botones;

    {
        // Botones
        botones = new JButton[nombres.length];
        for (int i = 0; i < nombres.length; i++) {
            botones[i] = new JButton(nombres[i]);
        }
    }

    public FormBorderLayout() {
        super("BorderLayout");

        setLayout(new BorderLayout());

        for (int i = 0; i < botones.length; i++) {
            add(botones[i], colocaciones[i]);
        }

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
