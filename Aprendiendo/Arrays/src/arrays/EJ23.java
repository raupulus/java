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
        System.out.println("\nEl método Dicotómico ha realizado \"" + contadorSeleccion + "\" iteraciones");
        System.out.println("\nEl método Dicotómico ha realizado \"" + contadorInserccion + "\" iteraciones");
    }
    
    //Método que genera números aleatorios para llenar el array
    public static void generarAleatorios() { 
        System.out.println("Array generado:");
        for(int i=0;i<valores.length;i++) {
            valores[i] = rd.nextInt(1001); //Mete número aleatorio en cada posición del array
            System.out.println(valores[i] + ", "); //Dibuja el valor generado en el array
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
        System.out.println("\nArray ordenado por método burbuja:");
        for(int i=0;i<arrayTmp.length;i++) {
            System.out.print(arrayTmp[i] + ", ");
        }
    }
    
    public static void inserccionDirecta() {
        arrayTmp = valores;
        tmp = 0;
        for(int i=0;i<arrayTmp.length;i++){
            contadorInserccion++;
            //Método para ordenar array por Insercción directa
        }
        
        System.out.println("\nArray ordenado por método Insercción Directa:");
        for(int i=0;i<arrayTmp.length;i++) {
            System.out.print(arrayTmp[i] + ", ");
        }
    }
    public static void seleccionDirecta() {
        arrayTmp = valores;
        tmp = 0;
        for(int i=0;i<arrayTmp.length;i++){
            contadorSeleccion++;
            //Método para ordenar array por Selección directa
        }
        
        System.out.println("\nArray ordenado por método Selección directa:");
        for(int i=0;i<arrayTmp.length;i++) {
            System.out.print(arrayTmp[i] + ", ");
        }
    }
}
