package arrays;
/**
 * Realiza un programa que cree un vector de 500 posiciones cargado con valores aleatorios.
 * Los valores aleatorios deberán de estar entre el 1 y el 1000.
 * Una vez cargado el vector deberá de ordenarlo mediante el método de la burbuja,
 * insercción directa y selección directa y mostrarlo ordenado por pantalla.
 * Calcula el número de iteraciones que han sido necesarias en cada método.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 * https://github.com/fryntiz
 */
public class EJ23 {
    public static int[] valores = {2,5,1,6,3,4,8,32,21,62,23,73,21,46,28,98,423,49,23,71,51,422,638};
    public static int contadorburbuja = 0, contadorInserccion = 0, contadorSeleccion = 0, tmp;
    
    public static void main(String[] args) {
        burbuja();
        inserccionDirecta();
        seleccionDirecta();
        System.out.println("\n\nEl método burbuja ha realizado \"" + contadorburbuja + "\" iteraciones");
        System.out.println("\nEl método Dicotómico ha realizado \"" + contadorSeleccion + "\" iteraciones");
        System.out.println("\nEl método Dicotómico ha realizado \"" + contadorInserccion + "\" iteraciones");
    }
    
    public static void burbuja() {
        for(int i=0;i<valores.length;i++){
            contadorburbuja++;
            //Método para ordenar array por Burbuja
        }
    }
    
    public static void inserccionDirecta() {
        for(int i=0;i<valores.length;i++){
            contadorInserccion++;
            //Método para ordenar array por Insercción directa
        }
    }
    public static void seleccionDirecta() {
        for(int i=0;i<valores.length;i++){
            contadorSeleccion++;
            //Método para ordenar array por Selección directa
        }
    }
}
