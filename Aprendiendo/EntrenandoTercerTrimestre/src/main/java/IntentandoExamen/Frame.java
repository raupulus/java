package IntentandoExamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 * https://github.com/fryntiz
 */
public class Frame extends JFrame {

    private JTextArea areaTexto;
    private static List<Animal> listaAnimales;

    public Frame(String new_nombre, List new_animalesList, int longitud_lista) {
        //Asigno el nombre pasado al constructor
        super("new_nombre");

        //Establezco que se pueda cerrar al salir
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Creo los botones
        crearBotones(longitud_lista);
        
        //Llamar al método para construir la ventana
        make_GUI();
    }

    
    public void crearBotones(int longitud_lista) {
        List<Boton> listaBotones = new ArrayList<>();
        //Por cada valor de "i" toma el nombre del animal como nombre del bóton
        for (int i = 0; i < longitud_lista; i++) {
            //Obtiene el nombre de cada animal del LinkedList anterior
            listaBotones.add(new Boton(listaAnimales.get(i).getNombre()));
        }
        //Ordenar el ArrayList "listaBotones"
        Collections.sort(listaBotones);
    }
    
    public void crearBotones() {
        
    }
}
