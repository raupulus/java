package Ejemplos.GestoresDeColocacionTodos;

import javax.swing.SwingUtilities;

public class Principal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormPrincipal();
            }
        });
    }

}
