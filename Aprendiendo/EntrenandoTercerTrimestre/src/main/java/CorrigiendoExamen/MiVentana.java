package CorrigiendoExamen;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class MiVentana extends JFrame {
    
    //Constructor de la clase
    public MiVentana(String nombre) {
        //Invoca la clase de la que hereda con el nombre pasado
        super(nombre);
        
        //Activar cerrar al salir de la ventana y no poner en BG
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Crear la lista de animales
        crearGUI();
    }
    
    
    
    private void crearGUI() {
        //Crear la lista de animales en un LinkedList
        List<Animal> listaAni = new LinkedList<>();
        
        //Creo un alias de array de objetos para la lista enumerada "TipoAnimal"
        TipoAnimal[] tiposAnimales = TipoAnimal.values();//Es un array con objetos para cada tipo de animales
        
        //Bucle para recorrer la clase enumerada para añadir los valores
        for (int i=0; i < tiposAnimales.length; i++) {
            listaAni.add(TipoAnimal.values().name)
            
        }
    }
}
