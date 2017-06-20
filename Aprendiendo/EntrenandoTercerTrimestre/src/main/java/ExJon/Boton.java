package ExJon;

import javax.swing.JButton;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 * https://github.com/fryntiz
 */

public class Boton extends JButton implements Comparable<Boton> {

    private String nombre;

    public Boton(String new_nombre) {
        super(nombre);
        nombre = new_nombre;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String new_nombre) {
        nombre = new_nombre;
    }

    public int compareTo(Boton otroBoton) {

        String texOtroBoton = otroBoton.nombre;

        return this.nombre.compareTo(texOtroBoton);
    }

}
