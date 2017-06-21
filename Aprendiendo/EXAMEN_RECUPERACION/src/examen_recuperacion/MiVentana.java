package examen_recuperacion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class MiVentana extends JFrame {
    private JPanel panelSur;
    private JTextArea textoNorte;
    private List<Boton> listaBot = new ArrayList<Boton>();
    
    public MiVentana(String in_name) {
        //Asignar nombre de ventana
        super(in_name);
        
        //Establecer que se puede cerrar al salir
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Llamar al método para construir la ventana
        make_GUI();
        
        //Generar botones escogiendo palabra aleatoria
        crearBotonesAleatorios();
        
        //Añadir eventos a los botones
        addEventToMouse();
    }
    
    private void make_GUI() {
        //Creo panelPrincipal
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setPreferredSize(new Dimension(1000, 500));
        
        //Crear panel con el nombre panelCentro colocado al centro
        JPanel panelCentro = new JPanel();
        panelCentro.setPreferredSize(new Dimension(300, 300));
        panelPrincipal.add(panelCentro, BorderLayout.CENTER);
        
        //Crear panel con el nombre panelSur colocado al sur
        panelSur = new JPanel();
        panelSur.setPreferredSize(new Dimension(300, 50));
        panelPrincipal.add(panelSur, BorderLayout.SOUTH);
        
        //Crear area de texto llamada "textNorte" colocada al norte
        JTextArea areaTexto = new JTextArea();
        
        //Crear Panel que permita scroll y establecer preferencias
        JScrollPane scroll = new JScrollPane();
        scroll.setPreferredSize(new Dimension(300, 150));
        scroll.setViewportView(areaTexto);
        panelPrincipal.add(scroll, BorderLayout.NORTH);

        //Añadir "panelPrincipal" como panel de contenidos para "Frame" mediante pack()
        this.setContentPane(panelPrincipal);
        this.pack();
        
        //Marcar como visible
        this.setVisible(true);
    }
    
    //REPARAR al final del examen
    //Método que crea los botones escogiendo una palabra aleatoria
    private void crearBotonesAleatorios() {
        Palabra suerte; //Esta palabra es la que se usará
        String temporal = "Prueba"; //Pruebas pasando a char[]
        
        //Obtener una palabra de forma aleatoria
        //suerte = Diccionario.aleatoria();
        
        //Crear array de caracteres
        char[] toCharArray = temporal.toCharArray();
        
        //Crear botón con cada caracter y agregar a panelSur
        for (int i = 0; i < toCharArray.length; i++) {
            //System.out.println(toCharArray[i]);
            //listaBot.add(new Boton(toCharArray[i].));
        }
        
        listaBot.add(new Boton("P"));
        listaBot.add(new Boton("R"));
        listaBot.add(new Boton("U"));
        listaBot.add(new Boton("E"));
        listaBot.add(new Boton("B"));
        listaBot.add(new Boton("A"));
        
        //Desordenar botones
        Collections.shuffle(listaBot);
        
        for (int i = 0; i < listaBot.size(); i++) {
            panelSur.add(listaBot.get(i));
            listaBot.get(i).setPreferredSize(new Dimension(140, 20));
        }
    }
    
    //Añadir oir eventos a los botones
    private void addEventToMouse() {
        for (int i = 0; i < listaBot.size(); i++) {
            listaBot.get(i).addMouseListener(new EventoRaton());
        }
    }
    
    //REPARAR
    //Clase que gestiona los eventos de los botones
    private class EventoRaton extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent event) {
            Boton boton = (Boton) event.getSource();
            try {
                System.out.println(event.getSource());
                //panelSur.add(listaBot.get(event.));
                
                //Buscar el boton en el ArrayList
                
                //Agregar el boton a listaBot
            } catch (IllegalStateException exc) {
                System.err.println(exc.getMessage());
            }
        }
    }
}
