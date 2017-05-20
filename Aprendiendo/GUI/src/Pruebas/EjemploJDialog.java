package Pruebas;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class EjemploJDialog extends JDialog {

    private final JPanel contentPanel = new JPanel();

    //Crear Ventana con bordes, botones y componentes internos
    public EjemploJDialog() {
        setResizable(false);        // Evita cambio de tamaño
        setTitle("u00C9sto es una ventana de diu00E1logo");        // título del diáolog
        setBounds(100, 100, 450, 229);        // dimensiones que ocupa en la pantalla
        getContentPane().setLayout(new BorderLayout());        // capa que contendrá todo
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));        // borde de la ventan
        getContentPane().add(contentPanel, BorderLayout.CENTER);        // pone el panel centrado
        contentPanel.setLayout(null);        // sin capas para poder posicionar los elementos por coordenadas 
        {
            // aquí se pone el JTextArea dentro de un JScrollPane 
            // para que tenga barras de desplazamiento
            JScrollPane scrollPane = new JScrollPane();
            scrollPane.setBounds(10, 11, 424, 146);
            contentPanel.add(scrollPane);
            {
                JTextArea txtrstoEsUn = new JTextArea();
                txtrstoEsUn.setText("u00C9sto es un JTextArea, aquu00ED podemos poner un texto de varias lu00EDneas.rn1rn2rn3rn..rnrnObserva que no se ve en la barra de tareas que exista u00E9sta ventana.  Si fuera un JFrame su00ED que se veru00EDa en la barra de tareas con el texto  del tu00EDtulo de la ventana...rnrnEl componente JTextArea estu00E1 dentro de un JScrollPane para que se  visualizen las barras de scroll cuando sea necesario.rnrnLa ventana tiene el atributo 'resizable' a 'false' para evitar que se pueda cambiar el tamau00F1o.rnrnrnrnrnrnFin del texto.");
                txtrstoEsUn.setLineWrap(true);
                txtrstoEsUn.setAutoscrolls(true);
                scrollPane.setViewportView(txtrstoEsUn);
            }
        }
        {
            // a continuación tenemos los botones clásicos 'Vale' y 'Cancela'
            // éste código lo ha generado Eclipse...
            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                JButton okButton = new JButton("Vale");
                okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // aquí van las acciones al hacer click en Vale
                        // envía el diálogo al recolector de basura de Java
                        dispose();
                    }
                });
                okButton.setActionCommand("Vale");
                buttonPane.add(okButton);
                getRootPane().setDefaultButton(okButton);
            }
            {
                JButton cancelButton = new JButton("Cancelar");
                cancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        // aquí van las acciones al hacer click en Vale
                        // envía el diálogo al recolector de basura de Java
                        dispose();
                    }
                });
                cancelButton.setActionCommand("Cancelar");
                buttonPane.add(cancelButton);
            }
        }
    }
}