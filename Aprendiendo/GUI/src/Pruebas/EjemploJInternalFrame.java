package Pruebas;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

public class EjemploJInternalFrame extends JInternalFrame {

    public EjemploJInternalFrame() {
        setBounds(100, 100, 245, 134);
        // coordenadas con las dimensiones de la ventana
        // disposición de capas a nulo para poder posicionar
        // con coordenadas en vez de con el esquema determinado
        getContentPane().setLayout(null);

        // Creo una etiqueta
        JLabel lblstoEsUna = new JLabel("Esto es una ventana interna...");
        lblstoEsUna.setBounds(10, 11, 333, 14);
        getContentPane().add(lblstoEsUna);

        // El botón que cierra ésta ventana interna
        JButton btnAprietaAquPara = new JButton("Aprieta aquí para cerrar");
        btnAprietaAquPara.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Ésto se ejecuta cuando se aprieta el botón (manda clase a basura)
                dispose(); //Cierra la ventana
            }
        });

        btnAprietaAquPara.setBounds(10, 36, 209, 58);
        getContentPane().add(btnAprietaAquPara);

    }
}
