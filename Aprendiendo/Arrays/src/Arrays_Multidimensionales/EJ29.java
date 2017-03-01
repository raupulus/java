package Arrays_Multidimensionales;
/**
 * Realiza un programa que rellene una matriz de 6 filas por 10 columnas con números
 * enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Random;
public class EJ29 {
    private static int filas=6,columnas=10, minimo,minimoF,minimoC, maximo,maximoF,maximoC;
    private static int[][] matriz = new int[filas][columnas];
    static Random rd = new Random();
    
    public static void main(String[] args) {
        //Genera los números aleatorios
        generarNumeros();
        
        //Busca el número más grande
        maximo();
        
        //Busca el número más pequeño
        minimo();
        
        //Muestra el resultado
        mostrar();
    }
    
    public static void generarNumeros() {
        System.out.println("El array contiene " + (filas*columnas) + " números, los cuales son los siguientes:");
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++) {
                matriz[i][j] = rd.nextInt(1000);
                System.out.print(matriz[i][j] + ", ");
            }
        }
    }
    
    public static void maximo() {
        
    }
    
    public static void minimo() {
        
    }
    
    public static void mostrar() {
        System.out.println("\nEl número máximo es -->\t " + maximo + ". Está en la fila " + maximoF + " y en la columna " + maximoC);
        System.out.println("\nEl número máximo es -->\t " + minimo + ". Está en la fila " + minimoF + " y en la columna " + minimoC);
    }
}
