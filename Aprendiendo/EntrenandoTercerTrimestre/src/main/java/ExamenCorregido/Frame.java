package ExamenCorregido;

import javax.swing.JFrame;

/**
 * Contiene toda la ventana y el desarrollo de esta que será llamado en un hilo
 * independiente.
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 * https://github.com/fryntiz
 */

//Clase extendiendo la clase "JFrame"
public class Frame extends JFrame {
    
    //Constructor de la ventana
    public Frame(String new_nombre) {
        //Asigno el nombre pasado al constructor
        super("new_nombre");
        
        //Establezco que se pueda cerrar al salir
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
