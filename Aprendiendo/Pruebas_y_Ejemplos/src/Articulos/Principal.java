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
