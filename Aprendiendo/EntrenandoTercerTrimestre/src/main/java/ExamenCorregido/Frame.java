package ExamenCorregido;

//Librerías para Collections, List y LinkedList
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Librerías gráficas
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.JScrollPane;

/**
 * Contiene toda la ventana y el desarrollo de esta que será llamado en un hilo
 * independiente.
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 * https://github.com/fryntiz
 */

//Clase extendiendo la clase "JFrame"
public class Frame extends JFrame {
    
    //Área de texto
    private JTextArea areaTexto;
    
    //Constructor de la ventana
    public Frame(String new_nombre) {
        //Asigno el nombre pasado al constructor
        super("new_nombre");
        
        //Establezco que se pueda cerrar al salir
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Llamar al método para construir la ventana
        make_GUI();
    }
    
    //Método que crea la interfaz gráfica
    private void make_GUI() {
        
        //Guardo en una variable la cantidad de animales distintos de la enum.
        int cantidadAnimales = EnumTipoAnimal.values().length;
        
        
        //Crear LinkedList a partir de "List" con objetos de la clase "Animal"
        List<Animal> listaAnimales = new LinkedList<>();
        //Bucle que crea tantos objeto animal como tipos según la clase
        //enumerada "EnumTipoAnimal.java"
        for (int i = 0; i < cantidadAnimales; i++) {
            //Obtiene el nombre de la lista enumerada según el valor de "i"
            listaAnimales.add(new Animal(EnumTipoAnimal.values()[i].name()));
        }
        
        
        //Crear un ArrayList de botones
        List<Boton> listaBotones = new ArrayList<>();
        //Por cada valor de "i" toma el nombre del animal como nombre del bóton
        for (int i = 0; i < cantidadAnimales; i++) {
            //Obtiene el nombre de cada animal del LinkedList anterior
            listaBotones.add(new Boton(listaAnimales.get(i).getNombre()));
        }
        //Ordenar el ArrayList "listaBotones"
        Collections.sort(listaBotones);
        
        
        //Crear panel con el nombre botoneraAni
        JPanel botoneraAni = new JPanel();
        botoneraAni.setPreferredSize(new Dimension(900,40));
        //Añadir botones al panel anterior
        for (int i = 0; i < cantidadAnimales; i++) {
            botoneraAni.add(listaBotones.get(i));
            listaBotones.get(i).setPreferredSize(new Dimension(130,30));
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
        
        
        //Añadir "panelPri" como panel de contenidos para "Frame" mediante pack()
        this.setContentPane(panelPri);
        this.pack();
        //Marcar como visible
        this.setVisible(true);
    }
}
