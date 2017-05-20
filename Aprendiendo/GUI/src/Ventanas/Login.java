package Ventanas;

/**
 * Ventana Login que pide usuario y contraseña
 * Al pulsar dichos botones no se efectúa acción
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Introducir Contraseña"); //Nombre de la ventana
        frame.setSize(300, 150); //Tamaño de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar al salir

        JPanel panel = new JPanel(); //Crear Panel principal
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true); //Marcar como visible
    }

    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);

        //Añado el texto "Usuario" junto al campo de entrada de texto
        JLabel userLabel = new JLabel("Usuario");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        //Añado la entrada de texto para el usuario
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);

        //Añado Etiqueta Contraseña
        JLabel passwordLabel = new JLabel("Contraseña");
        passwordLabel.setBounds(10, 40, 80, 25);
        panel.add(passwordLabel);

        //Añado Entrada de texto para la contraseña
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);
        panel.add(passwordText);

        //Añado botón para entrar
        JButton loginButton = new JButton("Entrar");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        //Añado botón con la opción Registrarse
        JButton registerButton = new JButton("Registrarte");
        registerButton.setBounds(180, 80, 80, 25);
        panel.add(registerButton);
    }
}
