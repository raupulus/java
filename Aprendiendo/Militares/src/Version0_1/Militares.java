package Version0_1;

import java.util.Arrays;
import java.util.Random;

/**
 * Clase principal
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class Militares {

    public static void main(String[] args) {

        char orden = 'd'; // Determina el tipo de ordenación que se aplicará. a = ascendente - d= descendente.
        int opcion = 0;

        Tropa t1 = new Tropa(30);

        Militar[] mils = new Militar[30];

        rellenaMilitares(mils, t1);

        do {
            opcion = menuOpciones();

            switch (opcion) {
                case 1:
                    orden = 'a';
                    t1.ordenarInsercionDirecta(mils, orden);
                    break;
                case 2:
                    orden = 'd';
                    t1.ordenarInsercionDirecta(mils, orden);
                    break;
                case 3:
                    orden = 'a';
                    t1.ordenarSeleccionDirecta(mils, orden);
                    break;
                case 4:
                    orden = 'd';
                    t1.ordenarSeleccionDirecta(mils, orden);
                    break;
                case 5:
                    orden = 'a';
                    t1.ordenarBurbuja(mils, orden);
                    break;
                case 6:
                    orden = 'd';
                    t1.ordenarBurbuja(mils, orden);
                    break;
                default:
                    break;
            }
            System.out.println(" NIVEL\t CÓD.\t\t\tNOMBRE \t\t\tESTADO");
            System.out.println("┌──────┬───────┬─────────────────────────────────────┬─────────────────────┐");
            for (Militar militar : mils) {
                System.out.println(militar);
            }
            System.out.println("└──────┴───────┴─────────────────────────────────────┴─────────────────────┘\n");
        } while (opcion != 0);
    }

    public static int menuOpciones() {
        String[] menu = {"Salir",
            //                         "Crear Tropa",
            //                         "Crear Militares", 
            "Ord. Inserción Directa Ascendente",
            "Ord. Inserción Directa Descendente",
            "Ord. Selección Directa Ascendente",
            "Ord. Selección Directa Descendente",
            "Ord. Burbuja Ascendente",
            "Ord. Burbuja Descendente"};
        System.out.println(Util.AZUL + "\t M E N Ú");
        System.out.println("\t─────────");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(Util.AZUL + i + ".- " + Util.NEGRO + menu[i]);
        }
        return (Util.leeEntero("Por favor escoja una opción (0-" + (menu.length - 1) + ")", 0, menu.length - 1));
    }

    public static boolean buscarMilitar(Militar[] array, String alias, int contador) {

        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {

            if (array[i].getNombre().equals(alias)) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    public static void rellenaMilitares(Militar[] mils, Tropa t1) {
        int rdmAlias = 0;
        Random x = new Random();

        for (int i = 0; i < mils.length; i++) {
            rdmAlias = x.nextInt(30);
            String alias = ListaAlias.alias[rdmAlias];
            if (i > 0) {
                if (!buscarMilitar(mils, alias, i)) {

                    mils[i] = new Militar(alias, ListaRango.rangos[x.nextInt(21)]);
                    t1.anadirMilitar(mils[i]);
                } else {
                    i--;
                }
            } else {
                rdmAlias = x.nextInt(30);
                mils[i] = new Militar(alias, ListaRango.rangos[x.nextInt(21)]);
                t1.anadirMilitar(mils[i]);
            }
        }
    }

}
