package Articulos;
/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class CD extends Articulo
{
   private String artista;
   private int numeroPistas;
  
	   public CD(String titulo, int duracion, String artista, int pistas )
	   {
		super(titulo, duracion);
		this.artista = artista;
		numeroPistas = pistas;
	    }
}
