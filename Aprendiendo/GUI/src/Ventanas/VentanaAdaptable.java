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
    
    //AutoAjustar al contenido
        ventanaPrincipal.pack();
    
    //Declarar como visible
        ventanaPrincipal.setVisible(true);
        
    //Cerrar al Salir
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
