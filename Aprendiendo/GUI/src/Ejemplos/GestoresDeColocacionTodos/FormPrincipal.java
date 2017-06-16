package Ejemplos.GestoresDeColocacionTodos;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FormPrincipal extends JFrame {

    final String[] nombres = {"BorderLayout", "BoxLayout",
        "CardLayout", "FlowLayout",
        "GridBagLayout", "GridLayout",
        "GroupLayout", "SpringLayout"};
    JButton[] botones;
    JPanel pc;           // Panel de contenido

    {
        // Botones
        botones = new JButton[nombres.length];
        for (int i = 0; i < nombres.length; i++) {
            botones[i] = new JButton(nombres[i]);
        }
    }

    public FormPrincipal() {
        super("Gestores de Colocación");
        // setSize(600,500);

        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int alturaPantalla = gd.getDisplayMode().getHeight();

        pc = new JPanel();
        setContentPane(pc);

        for (JButton b : botones) {
            inicializarBoton(b);
            add(b);
        }

        setLocation(0, alturaPantalla - getHeight() - 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    void inicializarBoton(JButton b) {
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                opciones(b.getText());
            }
        });
    }

    void opciones(String opcion) {
        switch (opcion) {
            case "BorderLayout":
                new FormBorderLayout();
                break;
            default:
                new JOptionPane("Opción desconocida: " + opcion).setVisible(true);
        }
    }
}
