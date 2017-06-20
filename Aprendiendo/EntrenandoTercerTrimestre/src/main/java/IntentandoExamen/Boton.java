package IntentandoExamen;

import javax.swing.JButton;

/**
 * Clase para crear cada botón Incorpora método sobreescrito para compareTo de
 * forma que obteniendo el texto que contiene el botón permitirá compararlo
 * entre los mismos objetos
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 * https://github.com/fryntiz
 */
public class Boton extends JButton implements Comparable<Boton> {

    //Constructor
    public Boton(String nombre) {
        super(nombre);
    }

    //Sobreescribir método "compareTo" de la clase abstracta "Comparable"
    @Override
    public int compareTo(Boton soyElBoton) {
        return this.getText().compareTo(soyElBoton.getText());
    }
}
