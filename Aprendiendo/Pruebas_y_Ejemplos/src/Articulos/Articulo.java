package Articulos;
/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Articulo {
    private String titulo;
    private int duracion;
    private boolean loTengo;
    private String comentario;

    public Articulo(String titulo, int duracion) {
         this.titulo = titulo;
         this.duracion = duracion;
         loTengo =  false;
         comentario = "";
    }
}

