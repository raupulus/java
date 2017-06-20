package IntentandoExamen;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 * https://github.com/fryntiz
 */
public class Frame extends JFrame {

    private JTextArea areaTexto;
    private List<Animal> listaAnimales;
    private List<Boton> listaBotones;

    public Frame(String new_nombre, List new_animalesList, int longitud_lista) {
        //Asigno el nombre pasado al constructor
        super("new_nombre");

        //Establezco que se pueda cerrar al salir
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Creo los botones
        crearBotones(longitud_lista);
        
        //Llamar al método para construir la ventana
        make_GUI(longitud_lista);
    }

    
    private void crearBotones(int longitud_lista) {
        listaBotones = new ArrayList<>();
        //Por cada valor de "i" toma el nombre del animal como nombre del bóton
        for (int i = 0; i < longitud_lista; i++) {
            //Obtiene el nombre de cada animal del LinkedList anterior
            listaBotones.add(new Boton(listaAnimales.get(i).getNombre()));
        }
        //Ordenar el ArrayList "listaBotones"
        Collections.sort(listaBotones);
    }
    
    private void make_GUI(int longitud_lista) {
        //Crear panel con el nombre botoneraAni
        JPanel botoneraAni = new JPanel();
        botoneraAni.setPreferredSize(new Dimension(900, 40));
        //Añadir botones al panel anterior
        for (int i = 0; i < longitud_lista; i++) {
            botoneraAni.add(listaBotones.get(i));
            listaBotones.get(i).setPreferredSize(new Dimension(130, 30));
        }
        
        //Crear "panelPri" como panel BorderLayout y sugerir tamaño
        JPanel panelPri = new JPanel(new BorderLayout());
        panelPri.setPreferredSize(new Dimension(900, 400));
        //Crear area de texto
        areaTexto = new JTextArea();
        //Crear Panel que permita scroll y establecer preferencias
        JScrollPane scroll = new JScrollPane();
        scroll.setPreferredSize(new Dimension(900, 400));
        scroll.setViewportView(areaTexto);
        //Añadir al panel creado la botonera abajo y scroll en el centro
        panelPri.add(scroll, BorderLayout.CENTER);
        panelPri.add(botoneraAni, BorderLayout.SOUTH);

        //Añadir oir eventos a los botones
        for (int i = 0; i < longitud_lista; i++) {
            listaBotones.get(i).addMouseListener(new EventoRaton());
        }
        
        //Añadir "panelPri" como panel de contenidos para "Frame" mediante pack()
        this.setContentPane(panelPri);
        this.pack();
        //Marcar como visible
        this.setVisible(true);
    }
}
