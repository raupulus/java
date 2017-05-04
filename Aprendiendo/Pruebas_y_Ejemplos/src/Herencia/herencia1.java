package Herencia;

/**
 * Prueba de herencia
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class herencia1 {

    public class Articulo {

        private String titulo;
        private int duracion;
        private boolean loTengo;
        private String comentario;

        public Articulo(String titulo, int duracion) {
            this.titulo = titulo;
            this.duracion = duracion;
            loTengo = false;
            comentario = "";
        }
    }

    public class CD extends Articulo {

        private String artista;
        private int numeroPistas;

        public CD(String titulo, int duracion, String artista, int pistas) {
            super(titulo, duracion);
            this.artista = artista;
            numeroPistas = pistas;
        }
    }
}
