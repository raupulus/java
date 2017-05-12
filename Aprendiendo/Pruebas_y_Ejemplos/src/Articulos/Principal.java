package Articulos;

import java.util.ArrayList;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Principal {

    private ArrayList<CD> cds = new ArrayList<CD>();
    private ArrayList<DVD> dvds = new ArrayList<DVD>();

    public void main(String[] args) {
        cds.add(new CD("Los mejores éxitos", 60, "Los Chichos", 12));
        cds.add(new CD("Arreando mulas", 43, "Los Chichos", 9));
        dvds.add(new DVD("Blanca la enana y las 7 nieves", 121, "Troglopoco"));
        dvds.add(new DVD("Los bollos molan más que los repollos", 154, "Falete"));
    }
    
    public void addCD(CD nombreCD) {
        cds.add(nombreCD);
    }

    public void addDVD(DVD nombreDVD) {
        dvds.add(nombreDVD);
    }

    public void listar() {
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
