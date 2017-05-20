package Ventanas;

/**
 * Sistema de autentificación
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Login1 extends JFrame {

    private JPanel panaleLogTitle;
    private JPanel panel;
    private JPanel panelB;
    private JPanel panaleTitle;
    private JPanel login;
    private JPanel loginB;

    private JLabel logTitle;
    private JLabel userL;
    private JLabel passL;
    private JLabel userNameL;
    private JLabel passwordL;
    private JLabel conPassL;
    private JLabel nameL;
    private JLabel lastNameL;
    private JLabel ageL;
    private JLabel title;

    private JTextField userT;
    private JPasswordField passT;
    private JTextField userNameT;
    private JPasswordField passwordT;
    private JPasswordField conPassT;
    private JTextField nameT;
    private JTextField lastNameT;
    private JTextField ageT;

    private JButton enter;
    private JButton exit;
    private JButton logEnter;
    private JButton logNew;

    private JRadioButton male;
    private JRadioButton female;

    private ButtonGroup radioGrup;

    private TitledBorder border;
    private EtchedBorder border2;

    private boolean test = true;

    public Login1() {

        if (test) {
            buildLogTitle();
            buildLogin();
            buildLogButton();
        } else {
            buildTitle();
            buildPanel();
            buildButtons();
        }

        setTitle("Raúl Caro Pastorino");

        if (test) {
            add(panaleLogTitle, BorderLayout.NORTH);
            add(login, BorderLayout.CENTER);
            add(loginB, BorderLayout.SOUTH);
        } else {
            add(panaleTitle, BorderLayout.NORTH);
            add(panel, BorderLayout.CENTER);
            add(panelB, BorderLayout.SOUTH);
        }

        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar al salir
        setVisible(true); //Marcar como visible

    }

    private void buildLogin() {
        login = new JPanel();
        login.setLayout(new GridLayout(3, 2));
        border = new TitledBorder("Accede al Sistema");

        userL = new JLabel("Nombre:");
        userT = new JTextField(10);
        passL = new JLabel("Contraseña:");
        passT = new JPasswordField(10);

        login.setBorder(border);

        login.add(userL);
        login.add(userT);
        login.add(passL);
        login.add(passT);

    }

    private void buildLogButton() {
        loginB = new JPanel();
        loginB.setLayout(new GridLayout(1, 1));
        border2 = new EtchedBorder();
        logEnter = new JButton("Entrar");
        logNew = new JButton("Crear Cuenta");
        logNew.addActionListener(new LogNew());
        loginB.add(logEnter);
        loginB.add(logNew);
    }

    private void buildLogTitle() {
        panaleLogTitle = new JPanel();
        border2 = new EtchedBorder();
        panaleLogTitle.setBorder(border2);
        logTitle = new JLabel("Bienvenido");
        logTitle.setFont(new Font("serif", Font.BOLD, 15));
        panaleLogTitle.add(logTitle);
    }

    private void buildPanel() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(7, 6));
        border = new TitledBorder("Introduce tu información");

        userNameL = new JLabel("Usuario:");
        passwordL = new JLabel("Contraseña:");
        conPassL = new JLabel("Confirma Contraseña:");
        nameL = new JLabel("Nombre:");
        lastNameL = new JLabel("Apellidos:");
        ageL = new JLabel("Edad:");

        nameT = new JTextField(10);
        lastNameT = new JTextField(10);
        ageT = new JTextField(10);
        passwordT = new JPasswordField(10);
        conPassT = new JPasswordField(10);
        userNameT = new JTextField(10);

        male = new JRadioButton("Hombre");
        female = new JRadioButton("Mujer");

        radioGrup = new ButtonGroup();
        radioGrup.add(male);
        radioGrup.add(female);

        panel.setBorder(border);

        panel.add(nameL);
        panel.add(nameT);
        panel.add(lastNameL);
        panel.add(lastNameT);
        panel.add(ageL);
        panel.add(ageT);
        panel.add(userNameL);
        panel.add(userNameT);
        panel.add(passwordL);
        panel.add(passwordT);
        panel.add(conPassL);
        panel.add(conPassT);
        panel.add(male);
        panel.add(female);

    }

    private void buildButtons() {
        panelB = new JPanel();
        border2 = new EtchedBorder();
        panelB.setLayout(new GridLayout(1, 1));
        enter = new JButton("Entrar");
        exit = new JButton("Volver");
        panelB.setBorder(border2);
        panelB.add(enter);
        panelB.add(exit);
    }

    private void buildTitle() {
        panaleTitle = new JPanel();
        border2 = new EtchedBorder();
        panaleTitle.setBorder(border2);
        title = new JLabel("Crear Cuenta");
        title.setFont(new Font("serif", Font.BOLD, 15));
        panaleTitle.add(title);
    }

    private class LogNew implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

    public static void main(String[] args) {
        Login1 aplication = new Login1();
    }
}
