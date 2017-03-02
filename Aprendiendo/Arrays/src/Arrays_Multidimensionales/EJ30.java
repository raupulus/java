package Arrays_Multidimensionales;
/**
 * Que rellene una matriz de 3x3 y muestre su traspuesta (la traspuesta se
 * consigue intercambiando filas por columnas y viceversa).
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Random;
public class EJ30 {
    static Random rd = new Random();
    private static int fila=3,columna=3;
    private static int[][] matriz = new int[fila][columna];
    private static int[][] traspuesta = new int[fila][columna];
    
    public static void main(String[] args) {
        generar();
        trasponer();
        mostrar();
    }
    
    public static void generar() {
        //Genera números para llenar matriz
        for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++) {
                matriz[i][j] = rd.nextInt(1001);
            }
        }
    }
    
    public static void trasponer() {
        
    }
    
    public static void mostrar() {
        
    }
}
