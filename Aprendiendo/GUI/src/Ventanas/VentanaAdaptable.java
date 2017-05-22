package Ventanas;
import javax.swing.JFrame;
/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class VentanaAdaptable {
    
    public static void main(String[] args) {

    //Ventana principal
        JFrame ventanaPrincipal = new JFrame("Ejemplo JFrame");
        ventanaPrincipal.setBounds(0, 0, 800, 600);
        ventanaPrincipal.setVisible(true);
        
    //Cerrar al Salir
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
