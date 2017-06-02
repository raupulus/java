package CorrigiendoExamen;

import javax.swing.SwingUtilities;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class principal {

    public static void crear() {
        MiVentana ventana = new MiVentana("Animales");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                crear();
            }
        });
    }
}
