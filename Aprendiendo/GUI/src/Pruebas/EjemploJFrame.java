package Pruebas;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EjemploJFrame extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) { //Main para comenzar
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Crea el JFrame 
                    EjemploJFrame frame = new EjemploJFrame();
                    // Lo hace visible
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public EjemploJFrame() {
        
        setTitle("Probando Swing by Raúl");// el titulo de la ventana
        // Acción al cerrar el frame: sale del programa en éste caso, terminando la ejecución
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Posición de las esquinas del formulario en tu escritorio
        setBounds(100, 100, 450, 433);
        // El panel que contiene todo
        contentPane = new JPanel();
        // Borde del panel
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        // Se pone el panel en la ventana
        setContentPane(contentPane);
        // Se establece disposición de las capas a null para poder posicionar por coordenadas los componentes
        // Ésto se hace con un Absolute Layout que se llama en el diseñador visual
        contentPane.setLayout(null);

        // El botón que abre ventanas de diálogo
        JButton btnAbrirUnaVentana = new JButton(
                "Abrir una ventana de diálogo con el usuario");
        btnAbrirUnaVentana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                EjemploJDialog dialogo = new EjemploJDialog();
                dialogo.setVisible(true);
            }
        });
        btnAbrirUnaVentana.setBounds(10, 11, 414, 23);
        contentPane.add(btnAbrirUnaVentana);

        // El botón que abre ventanas de diálogo pero de manera MODAL
        JButton btnAbrirUnaVentana_1 = new JButton(
                "Abrir una ventana de diálogo MODAL");
        btnAbrirUnaVentana_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EjemploJDialog dialogo = new EjemploJDialog();
                dialogo.setModal(true);
                dialogo.setVisible(true);
            }
        });
        btnAbrirUnaVentana_1.setBounds(10, 70, 414, 23);
        contentPane.add(btnAbrirUnaVentana_1);

        JLabel lblSiLaAbrimos = new JLabel(
                "Si la abrimos modal, hasta no cerrarla no podemos tocar ésta ventana.");
        lblSiLaAbrimos.setBounds(10, 45, 414, 14);
        contentPane.add(lblSiLaAbrimos);

        // El panel-escritorio donde veremos los JFrames internos 
        final JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBounds(10, 138, 414, 246);
        contentPane.add(desktopPane);

        // Botón para abrir las ventanas internas
        JButton btnAbrirUnJframe = new JButton(
                "Abrir un JFrame interno aquí abajo");
        btnAbrirUnJframe.addActionListener(new ActionListener() {
            // Variable para que cada nueva ventana interna
            // Salga en diferente posición y se vean todas
            int posicioninicial = 0;

            public void actionPerformed(ActionEvent e) {
                EjemploJInternalFrame jif = new EjemploJInternalFrame();
                jif.setVisible(true);
                // Posición de la nueva ventana
                jif.setLocation(posicioninicial, posicioninicial);
                // Las siguiente posición será diferente así
                // Veremos todas las ventanas internas
                posicioninicial += 10;
                desktopPane.add(jif);
            }
        });
        btnAbrirUnJframe.setBounds(10, 104, 414, 23);
        contentPane.add(btnAbrirUnJframe);
    }
}
