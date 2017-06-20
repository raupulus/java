package ExJon;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.TextArea;
import java.util.Iterator;
import java.util.List;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 * https://github.com/fryntiz
 */
public class GUI {

    private List<Boton> listAni;

    public GUI(List<Boton> listBotones) {

        listAni = listBotones;
    }

    public void generarYMostrarVentana() {

        JFrame frame = new JFrame("¡EXAMEN!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = frame.getContentPane();

        JPanel panelTexto = new JPanel();
        panelTexto.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(1000, 400));
        panelTexto.add(textArea, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel();

        Iterator<Boton> it = listAni.iterator();

        while (it.hasNext()) {

            Boton boton = (Boton) it.next();

            boton.addMouseListener(new MouseListener() {

                @Override
                public void mouseReleased(MouseEvent evento) {

                }

                @Override
                public void mousePressed(MouseEvent evento) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void mouseExited(MouseEvent evento) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void mouseEntered(MouseEvent evento) {
                    evento.getSource();

                }

                @Override
                public void mouseClicked(MouseEvent evento) throws IllegalStateException {

                    if (boton.getNombre().equals("PERRO") && evento.getButton() == 2) {

                        throw new IllegalStateException("El boton perro no se puede pulsar con el click central");
                    }

                    if (evento.getButton() == 1) {

                        textArea.append(boton.getNombre() + " -> Izquierdo\n");

                    } else if (evento.getButton() == 3) {

                        textArea.append(boton.getNombre() + " -> Derecho\n");

                    }

                }
            });

            panelBotones.add(boton);
        }

        pane.add(panelTexto, BorderLayout.NORTH);
        pane.add(panelBotones, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
