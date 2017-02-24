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
    public static int[] valores = new int[500];
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
        tmp=0;
        for(int i=0;i<valores.length-1;i++) {
            for(int j=0;j<valores.length-i-1;j++) {
                contadorburbuja++;
                if(valores[j+1]<valores[j]){
                    tmp=valores[j+1];
                    valores[j+1]=valores[j];
                    valores[j]=tmp;
                }
            }  
        }
        System.out.println("\nArray ordenado por método burbuja:");
        for(int i=0;i<valores.length;i++) {
            System.out.print(valores[i] + ", ");
        }
    }
    
    public static void inserccionDirecta() {
        for(int i=0;i<valores.length;i++){
            contadorInserccion++;
            //Método para ordenar array por Insercción directa
        }
        
        System.out.println("\nArray ordenado por método burbuja:");
        for(int i=0;i<valores.length;i++) {
            System.out.print(valores[i] + ", ");
        }
    }
    public static void seleccionDirecta() {
        for(int i=0;i<valores.length;i++){
            contadorSeleccion++;
            //Método para ordenar array por Selección directa
        }
        
        System.out.println("\nArray ordenado por método burbuja:");
        for(int i=0;i<valores.length;i++) {
            System.out.print(valores[i] + ", ");
        }
    }
}
