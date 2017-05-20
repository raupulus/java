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

    // METODO PRINCIPAL QUE ARRANCA TODA LA APLICACIÓN
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // crea el JFrame 
                    EjemploJFrame frame = new EjemploJFrame();
                    // lo hace visible
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // EL CONSTRUCTOR QUE SE USA CUANDO ARRANCA AQUÍ ARRIBA
    public EjemploJFrame() {
        // el titulo de la ventana
        setTitle("Swing: Jugando con las ventanas by jnj");
        // acción al cerrar el frame: sale del programa
        // en éste caso, terminando la ejecución
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // posición de las esquinas del formulario en tu escritorio
        setBounds(100, 100, 450, 433);
        // el panel que contiene todo
        contentPane = new JPanel();
        // borde del panel
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        // se pone el panel en la ventana
        setContentPane(contentPane);
        // se establece disposición de las capas a null
        // para poder posicionar por coordenadas los componentes
        // ésto se hace con un Absolute Layout que se llama
        // en el diseñador visual
        contentPane.setLayout(null);

        // el botón que abre ventanas de diálogo
        JButton btnAbrirUnaVentana = new JButton(
                "Abrir una ventana de diu00E1logo con el usuario");
        btnAbrirUnaVentana.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                EjemploJDialog dialogo = new EjemploJDialog();
                dialogo.setVisible(true);
            }
        });
        btnAbrirUnaVentana.setBounds(10, 11, 414, 23);
        contentPane.add(btnAbrirUnaVentana);

        // el botón que abre ventanas de diálogo
        // pero de manera MODAL
        JButton btnAbrirUnaVentana_1 = new JButton(
                "Abrir una ventana de diu00E1logo MODAL");
        btnAbrirUnaVentana_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EjemploJDialog dialogo = new EjemploJDialog();
                dialogo.setModal(true);
                dialogo.setVisible(true);
            }
        });
        btnAbrirUnaVentana_1.setBounds(10, 70, 414, 23);
        contentPane.add(btnAbrirUnaVentana_1);

        JLabel lblSiLaAbrimos = new JLabel(
                "Si la abrimos modal, hasta no cerrarla no podemos tocar u00E9sta ventana.");
        lblSiLaAbrimos.setBounds(10, 45, 414, 14);
        contentPane.add(lblSiLaAbrimos);

        // el panel-escritorio donde veremos los JFrames internos 
        final JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBounds(10, 138, 414, 246);
        contentPane.add(desktopPane);

        // botón para abrir las ventanas internas
        JButton btnAbrirUnJframe = new JButton(
                "Abrir un JFrame interno aquu00ED abajo");
        btnAbrirUnJframe.addActionListener(new ActionListener() {
            // variable para que cada nueva ventana interna
            // salga en diferente posición y se vean todas
            int posicioninicial = 0;

            public void actionPerformed(ActionEvent e) {
                EjemploJInternalFrame jif = new EjemploJInternalFrame();
                jif.setVisible(true);
                // posición de la nueva ventana
                jif.setLocation(posicioninicial, posicioninicial);
                // las siguiente posición será diferente así
                // veremos todas las ventanas internas
                posicioninicial += 10;
                desktopPane.add(jif);
            }
        });
        btnAbrirUnJframe.setBounds(10, 104, 414, 23);
        contentPane.add(btnAbrirUnJframe);
    }
}
