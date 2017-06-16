package Version0_1;

/**
 * Clase principal
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class Militar implements Comparable {

    private String nombre;
    private Rango rango;

    public Militar(String nom, Rango r1) {
        nombre = nom;
        rango = r1;
    }

    public String getNombre() {
        return nombre;
    }

    public Rango getRango() {
        return rango;
    }

    public int compareTo(Militar m1) {
        return (rango.compareTo(m1.getRango()));
    }

    @Override
    public String toString() {
        return ("│" + String.format("%1$4s", rango.getNivel()) + "  │ " + String.format("%1$-5s", rango.getCodigo()) + " │ " + String.format("%1$-35s", nombre) + " │ " + String.format("%1$-20s", rango) + "│");
    }

    @Override
    public int compareTo(Object t) {
        return (this.compareTo(t));
    }
}
