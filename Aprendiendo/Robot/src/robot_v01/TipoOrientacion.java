package robot_v01;

import java.util.Random;

/**
 * Clase de tipo enumerada con los puntos cardinales
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public enum TipoOrientacion {
    NORTE, SUR, ESTE, OESTE;

    static Random rd = new Random();

    //Genera un número aleatorio rango 0-3 y asigna ese valor
    public TipoOrientacion aleatorio() {
        TipoOrientacion ale = NORTE;
        int x;
        x = rd.nextInt(4);
        switch (x) {
            case 0:
                ale = NORTE;
                break;
            case 1:
                ale = SUR;
                break;
            case 2:
                ale = ESTE;
                break;
            case 3:
                ale = OESTE;
                break;
        }
        return ale;
    }
}
