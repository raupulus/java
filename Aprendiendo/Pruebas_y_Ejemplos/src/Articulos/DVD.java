package Articulos;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class DVD extends Articulo {

    private String director;

    public DVD(String titulo, int duracion, String director) {
        super(titulo, duracion); //Pasa atributos al constructor
        this.director = director;
    }
    
    //Sobreescribir método "print()"
    @Override
    public void print() {
        System.out.println("\n");
        System.out.println("Soy un DVD");
        super.print();
        System.out.println("Director --> " + director);
    }
}
