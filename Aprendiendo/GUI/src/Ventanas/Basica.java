package Ventanas;

/**
 * Ejemplo de estructura para ventana básica con librería Swing
 * -Etiqueta,caja de texto y boton
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Basica extends JFrame implements ActionListener {

    private JLabel texto;           // Etiqueta principal con texto no editable
    private JTextField caja;        // Creo una Caja de texto para entrada
    private JButton boton;          // Creo un botón
    private JButton boton1;         // Creo un botón

    public Basica() {
        super();                    // Llamada al constructor de la clase padre JFrame
        configurarVentana();        // Configuro la ventana
        inicializarComponentes();   // Inicializar los componentes
    }

    private void configurarVentana() {
        this.setTitle("Nombre de la ventana");                  // Título de la ventana
        this.setSize(480, 320);                                 // Tamaño de la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // Centramos la ventana en la pantalla
        this.setLayout(null);                                   // No doi ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // No redimensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Cerrar procesos al cerrar la ventana
    }

    private void inicializarComponentes() {
        // Creo componentes
        texto = new JLabel();
        caja = new JTextField();
        boton = new JButton();
        boton1 = new JButton();
        
        // Establezco parámetros a los componentes
        texto.setText("Introduce tu Nombre"); // Entrada textarea
        texto.setBounds(150, 20, 100, 25);   // Posicion y tamaño al texto (x, y, ancho, alto)
        caja.setBounds(100, 50, 200, 25); // Posicion y tamaño a la caja (x, y, ancho, alto)
        boton.setText("Púlsame"); // Texto en el botón
        boton.setBounds(0, 100, 200, 30);  // Posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(this); // Boton tenga una acción y esa accion estara en esta clase
        
        boton1.setText("No Pulsar!!!");  
        boton1.setBounds(200, 100, 200, 30);
        boton1.addActionListener(this);
 
        
        // Se añaden componentes creados a la ventana
        this.add(texto);
        this.add(caja);
        this.add(boton);
        this.add(boton1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = caja.getText();                                 // Obtenemos el contenido de la caja de texto
        JOptionPane.showMessageDialog(this, "Te saludo " + nombre + ".");    // Mostramos un mensaje (frame, mensaje)
    }

    public static void main(String[] args) {
        Basica V = new Basica();      // Crear una ventana
        V.setVisible(true);             // Hacer visible la ventana creada
    }
}

