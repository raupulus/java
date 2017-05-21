package Ventanas;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class VentanaPrincipalYDialogo {

    public static void main(String[] args) {

        //Ventana principal
        JFrame ventanaPrincipal = new JFrame("Ejemplo JFrame");
        ventanaPrincipal.setBounds(0, 0, 800, 600);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Ventana de diálogo
        JDialog ventanaDialogo = new JDialog(ventanaPrincipal);
        ventanaDialogo.setBounds(0,0,400,200);
        ventanaDialogo.setVisible(true);
    }
}
