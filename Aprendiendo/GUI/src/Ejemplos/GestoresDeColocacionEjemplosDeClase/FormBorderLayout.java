package Ejemplos.GestoresDeColocacionEjemplosDeClase;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class FormBorderLayout extends JFrame {

    final String[] nombres = {"CENTRO", "NORTE", "SUR", "ESTE", "OESTE"};
    final String[] colocaciones = {BorderLayout.CENTER,
        BorderLayout.NORTH,
        BorderLayout.SOUTH,
        BorderLayout.EAST,
        BorderLayout.WEST};

    JButton[] botones;

    {
        // Inicialización del array de botones
        botones = new JButton[nombres.length];
        for (int i = 0; i < nombres.length; i++) {
            botones[i] = new JButton(nombres[i]);
        }
    }

    public FormBorderLayout() {
        super("BorderLayout");

        // setLayout( new BorderLayout() );
        for (int i = 0; i < botones.length; i++) {
            add(botones[i], colocaciones[i]);
        }

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocation(0, 200);
        pack();
        setVisible(true);
    }

}
