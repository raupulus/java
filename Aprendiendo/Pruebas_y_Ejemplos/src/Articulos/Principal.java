package Articulos;

import java.util.ArrayList;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Principal {

    private static ArrayList<CD> cds = new ArrayList<CD>();
    private static ArrayList<DVD> dvds = new ArrayList<DVD>();

    public static void main(String[] args) {
        addCD("Los mejores éxitos", 60, "Los Chichos", 12);
        addCD("Arreando mulas", 43, "Los Chichos", 9);
        addDVD("Blanca la enana y las 7 nieves", 121, "Troglopoco");
        addDVD("Los bollos molan más que los repollos", 154, "Falete");
        
        listar();
    }
    
    public static void addCD(String titulo, int duracion, String artista, int pistas) {
        cds.add(new CD(titulo, duracion, artista, pistas));
        System.out.println(titulo);
    }

    public static void addDVD(String titulo, int duracion, String director) {
        dvds.add(new DVD(titulo, duracion, director));
    }

    public static void listar() {
        for (CD cd : cds) {
            cd.print();
            System.out.println();
        }

        for (DVD dvd : dvds) {
            dvd.print();
            System.out.println();
        }
    }
}
