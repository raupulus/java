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
                matriz[i][j] = rd.nextInt(101);
            }
        }
    }
    
    public static void trasponer() {
        //Transpone los valores
        for(int i=0;i<fila;i++){
            for(int j=0;j<columna;j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }
    }
    
    public static void mostrar() {
        //Array original
        System.out.println("\n\nEl array original: ");
        for(int i=0;i<columna;i++) {
            System.out.println("\n");
            for(int j=0;j<columna;j++) {
                System.out.print(matriz[j][i] + "\t");
            }
        }
        
        //Array transpuesto
        System.out.println("\n\nEl array Transpuesto: ");
        for(int i=0;i<columna;i++) {
            System.out.println("\n");
            for(int j=0;j<columna;j++) {
                System.out.print(traspuesta[j][i] + "\t");
            }
        }
    }
}
