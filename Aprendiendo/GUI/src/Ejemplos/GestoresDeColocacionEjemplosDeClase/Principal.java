package Ejemplos.GestoresDeColocacionEjemplosDeClase;

import javax.swing.SwingUtilities;

public class Principal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal();
            }
        });
    }
}
