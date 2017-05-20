package Ventanas;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public final class JVentana extends JFrame{

    private JFrame Frame_principal;
    private JTextField textField_texto;
    private JButton button_saludo;

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    new JVentana();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e);
                }
            }
        });
    }

    public JVentana() {
        inicializar();
        agregarComponentes();
        asignarEventos();
    }

    public void inicializar() {
        Frame_principal = new JFrame("Raúl Caro Pastorino quiere saber tu nombre");
        textField_texto = new JTextField();
        textField_texto.setColumns(40);
        button_saludo = new JButton("Saludar");
        setDefaultCloseOperation(Frame_principal.EXIT_ON_CLOSE); //Cerrar al salir
    }

    public void agregarComponentes() {
        Frame_principal.add(textField_texto);
        Frame_principal.add(button_saludo);
        Frame_principal.setLayout(new FlowLayout());
        Frame_principal.setVisible(true);
        Frame_principal.setResizable(false);
        Frame_principal.pack();
    }

    public void asignarEventos() {
        button_saludo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField_texto.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Introduce un nombre.");
                } else {
                    JOptionPane.showMessageDialog(null, "Hola: " + textField_texto.getText());
                }
            }
        });
    }
}
