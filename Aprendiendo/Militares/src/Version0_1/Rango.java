package Version0_1;

/**
 * Clase Rango para cada militar
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class Rango {

    private double nivel;
    private String codigo;
    private String nombre;
    private String descripcion;
    private Grupo grupo;

    public Rango(int nivel, String codigo, String nombre, String descripcion, Grupo grupo) {
        this.nivel = nivel / 2.0;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.grupo = grupo;
    }

    public double getNivel() {
        return nivel;
    }

    public String getCodigo() {
        return codigo;
    }

    public int compareTo(Rango r1) {
        if (nivel > r1.getNivel()) {
            return 1;
        }
        if (nivel < r1.getNivel()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
