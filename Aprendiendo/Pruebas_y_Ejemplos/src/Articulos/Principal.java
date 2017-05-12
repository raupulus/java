package Articulos;

import java.util.ArrayList;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Principal {
    private ArrayList<CD> cds;
    private ArrayList<DVD> dvds;

    public BaseDatos() {
            cds = new ArrayList<CD>();
            dvds = new ArrayList<DVD>();
    }

    public void addCD(CD elCD) {
            cds.add(elCD);
    }

    public void addDVD(DVD elDVD) {
            dvds.add(elDVD);
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
