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
import java.util.Random;
public class EJ23 {
    static Random rd = new Random();
    public static int[] valores = new int[500];
    public static int[] arrayTmp = new int[valores.length];
    public static int contadorburbuja = 0, contadorInserccion = 0, contadorSeleccion = 0, tmp;
    
    public static void main(String[] args) {
        generarAleatorios();
        burbuja();
        inserccionDirecta();
        seleccionDirecta();
        System.out.println("\n\nEl método burbuja ha realizado \"" + contadorburbuja + "\" iteraciones");
        System.out.println("\nEl método Insercción directa ha realizado \"" + contadorSeleccion + "\" iteraciones");
        System.out.println("\nEl método Selección directa ha realizado \"" + contadorInserccion + "\" iteraciones");
    }
    
    //Método que genera números aleatorios para llenar el array
    public static void generarAleatorios() { 
        System.out.println("Array generado:");
        for(int i=0;i<valores.length;i++) {
            valores[i] = rd.nextInt(1001); //Mete número aleatorio en cada posición del array
            System.out.print(valores[i] + ", "); //Dibuja el valor generado en el array
        }
    }
    
    public static void burbuja() {
        arrayTmp = valores;
        tmp=0;
        for(int i=0;i<arrayTmp.length-1;i++) {
            for(int j=0;j<arrayTmp.length-i-1;j++) {
                contadorburbuja++;
                if(arrayTmp[j+1]<arrayTmp[j]){
                    tmp=arrayTmp[j+1];
                    arrayTmp[j+1]=arrayTmp[j];
                    arrayTmp[j]=tmp;
                }
            }  
        }
        System.out.println("\n\nArray ordenado por método burbuja:");
        for(int i=0;i<arrayTmp.length;i++) {
            System.out.print(arrayTmp[i] + ", ");
        }
    }
    
    public static void inserccionDirecta() {
        arrayTmp = valores;
        tmp = 0;
        //Algoritmo para ordenar array por Insercción directa
        int j;
        for (int i = 1; i < arrayTmp.length; i++){
            tmp = arrayTmp[i];
            j = i - 1;
            
            for (j=0;(j>=0) && (tmp<arrayTmp[j]);i++) {
                contadorInserccion++;
                arrayTmp[j + 1] = arrayTmp[j];
                j--;
            }
            
            arrayTmp[j + 1] = tmp;
        }
        
        System.out.println("\n\nArray ordenado por método Insercción Directa:");
        for(int i=0;i<arrayTmp.length;i++) {
            System.out.print(arrayTmp[i] + ", ");
        }
    }
    public static void seleccionDirecta() {
        arrayTmp = valores;
        tmp = 0;
        int menor, posicion;
        
        for(int i=0;i<arrayTmp.length;i++){
            contadorSeleccion++;
            
        }
        
        
        //Algoritmo para ordenar array por Selección directa
        for (int i = 0; i < arrayTmp.length - 1; i++) { // tomamos como menor el primero
                menor = arrayTmp[i]; // de los elementos que quedan por ordenar
                pos = i; // y guardamos su posición
                for (int j = i + 1; j < arrayTmp.length; j++){ // buscamos en el resto
                      if (arrayTmp[j] < menor) { // del array algún elemento
                          menor = arrayTmp[j]; // menor que el actual
                          pos = j;
                      }
                }
                if (pos != i){ // si hay alguno menor se intercambia
                    tmp = arrayTmp[i];
                    arrayTmp[i] = arrayTmp[pos];
                    arrayTmp[pos] = tmp;
                }
          }
        
        System.out.println("\n\nArray ordenado por método Selección directa:");
        for(int i=0;i<arrayTmp.length;i++) {
            System.out.print(arrayTmp[i] + ", ");
        }
    }
}
