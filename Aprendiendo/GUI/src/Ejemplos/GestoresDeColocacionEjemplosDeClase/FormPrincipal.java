package Ejemplos.GestoresDeColocacionEjemplosDeClase;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class FormPrincipal extends JFrame {

    private final String[] nombres = {"BorderLayout", "BoxLayout",
        "CardLayout", "FlowLayout",
        "GridBagLayout", "GridLayout",
        "GroupLayout", "SpringLayout"};

    JButton[] botones;
    JPanel pc;              // Panel de contenido

    {
        // Inicialización del array de botones
        botones = new JButton[nombres.length];
        for (int i = 0; i < nombres.length; i++) {
            botones[i] = new JButton(nombres[i]);
        }
    }

    public FormPrincipal() {
        super("GESTORES DE COLOCACION - EJEMPLO DE CLASE");

        pc = new JPanel();
        setContentPane(pc);

        for (JButton b : botones) {
            inicializarBoton(b);
            add(b);
        }

        // setSize(500,200);
        // setMinimumSize(new Dimension(300,500));
        setLocation(0, 5);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pack();
        setVisible(true);
    }

    private void inicializarBoton(JButton b) {
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().getClass());
                opciones(b.getText());
            }
        });
    }

    private void opciones(String opcion) {
        switch (opcion) {
            case "BorderLayout":
                new FormBorderLayout();
                break;
            default:
                System.err.println("Error: opción desconocida " + opcion);
        }
    }

}
