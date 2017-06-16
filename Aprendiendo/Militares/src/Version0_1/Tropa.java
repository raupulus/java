package Version0_1;

/**
 * Clase Tropa
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class Tropa {

    private Militar[] miembros;
    private int indice;

    public Tropa(int longitud) {
        miembros = new Militar[longitud];
    }

    public boolean anadirMilitar(Militar m1) {
        boolean result = true;
        if (indice < miembros.length) {
            miembros[indice] = m1;
            indice++;
        } else {
            result = false;
        }
        return result;
    }

    public void ordenarInsercionDirecta(Militar[] miembros, char orden) {
        Militar aux = null;
        int j = 0;

        switch (orden) {
            case 'a':
            case 'A':
                for (int i = 1; i < miembros.length; i++) {
                    aux = miembros[i];
                    j = i - 1;

                    while (j >= 0 && miembros[j].compareTo(aux) > 0) {
                        miembros[j + 1] = miembros[j];
                        j--;
                    }
                    miembros[j + 1] = aux;
                }
                break;
            case 'd':
            case 'D':
                for (int i = 1; i < miembros.length; i++) {
                    aux = miembros[i];
                    j = i - 1;

                    while (j >= 0 && miembros[j].compareTo(aux) < 0) {
                        miembros[j + 1] = miembros[j];
                        j--;
                    }
                    miembros[j + 1] = aux;
                }
                break;
            default:
        }
    }

    public void ordenarSeleccionDirecta(Militar[] miembros, char orden) {

        switch (orden) {
            case 'a':
            case 'A':
                for (int i = 0; i < miembros.length - 1; i++) {
                    intercambiarPosicion(miembros, i, posicionMinima(i, miembros));
                }
                break;
            case 'd':
            case 'D':
                for (int i = 0; i < miembros.length - 1; i++) {
                    intercambiarPosicion(miembros, i, posicionMaxima(i, miembros));
                }
                break;
            default:
        }
    }

    public void ordenarBurbuja(Militar[] miembros, char orden) {
        boolean intercambio = false;

        switch (orden) {
            case 'a':
            case 'A':
                do {
                    intercambio = false;
                    for (int i = 0; i < miembros.length - 1; i++) {
                        if (miembros[i].compareTo(miembros[i + 1]) > 0) {
                            intercambiarPosicion(miembros, i, i + 1);
                            intercambio = true;
                        }
                    }
                } while (intercambio);
                break;
            case 'd':
            case 'D':
                do {
                    intercambio = false;
                    for (int i = 0; i < miembros.length - 1; i++) {
                        if (miembros[i].compareTo(miembros[i + 1]) < 0) {
                            intercambiarPosicion(miembros, i, i + 1);
                            intercambio = true;
                        }
                    }
                } while (intercambio);
                break;
        }
    }

    private int posicionMinima(int i, Militar[] miembros) {

        for (int j = i + 1; j < miembros.length; j++) {
            if (miembros[j].compareTo(miembros[i]) < 0) {
                i = j;
            }
        }
        return i;
    }

    private int posicionMaxima(int i, Militar[] miembros) {

        for (int j = i + 1; j < miembros.length; j++) {
            if (miembros[j].compareTo(miembros[i]) > 0) {
                i = j;
            }
        }
        return i;
    }

    private void intercambiarPosicion(Militar[] miembros, int x, int z) {
        Militar aux = miembros[z];
        miembros[z] = miembros[x];
        miembros[x] = aux;
    }
}
