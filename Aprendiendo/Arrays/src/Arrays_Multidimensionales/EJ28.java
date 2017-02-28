package Arrays_Multidimensionales;
/**
 * Ejercicio en el que se rellene un array de dos dimensiones con números pares,
 * lo pinte y después que pida una posición X,Y y mostrar el número correspondiente.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Scanner;
public class EJ28 {
    private static final Scanner sc = new Scanner(System.in);
    private static int filas=4,columnas=4;
    private static int[][] matriz = new int[filas][columnas];
    
    public static void main(String[] args) {
        //Pedir datos de entrada
        entrada();
        
        //Menú para pedir número o salir
    }
    
    public static void entrada() {
        System.out.println("Introduce los números para la matriz:");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.println("Introduce el valor de la fila " + i + ", columna " + j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    
    public static void menu() {
        
    }
    
    public static void buscarNumero() {
        
    }
}
