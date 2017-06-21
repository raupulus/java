package examen_recuperacion;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Palabra implements Comparable<Palabra> {
    
    private String texto; //Nombre de la palabra
    private Definicion definicion;
    
    public Palabra(String in_texto, String in_Descripcion, String in_Ejemplo) {
        //Asignar valor de palabra
        texto = in_texto;
        
        //Construir Definición asociada a esta palabra
        definicion = new Definicion(in_Descripcion, in_Ejemplo);
    }
    
    public String getTexto() {
        return texto;
    }
    
    public String getDescripcion() {
        return definicion.getDescripcion();
    }
    
    public String getEjemplo() {
        return definicion.getEjemplo();
    }
    
    //Mostrar texto y definición en toString
    @Override
    public String toString() {
        return texto + " " + definicion.getDescripcion();
    }
    
    @Override
    public int compareTo(Palabra soyLaPalabra) {
        return this.getTexto().compareTo(soyLaPalabra.getTexto());
    }
}
