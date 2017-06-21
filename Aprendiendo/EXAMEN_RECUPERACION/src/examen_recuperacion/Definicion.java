package examen_recuperacion;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Definicion {
    private String descripcion;
    private String ejemplo;
    
    public Definicion(String in_descripcion, String in_ejemplo) {
        descripcion = in_descripcion;
        ejemplo = in_ejemplo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public String getEjemplo() {
        return ejemplo;
    }
    
    //Sobrescribir toString
    @Override
    public String toString() {
        return descripcion + " " + ejemplo;
    }
}
