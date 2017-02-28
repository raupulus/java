package Arrays_Multidimensionales;
/**
 * Realizar un programa que genere un matriz de 5x8 y que solicite al usuario de
 * manera intuitiva los valores para insertarlos en dicha matriz.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Scanner;
public class EJ25 {
    //Importo la clase Scanner para entrada de datos
    private static final Scanner sc = new Scanner(System.in);
    
    //Declaro tamaño de matriz
    private static int filas=5,columnas=8;
    
    //Creo la matriz
    private static int[][] matriz = new int[filas][columnas];//[filas][columnas]
    
    public static void main(String[] args) {
        //Entrada de datos, método entrada()
        entrada();
        
        //Muestra números introducidos, método mostrar();
        mostrar();
    }
    
    public static void entrada() {
        System.out.println("Introduce los valores");
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<3;j++) {
                System.out.println("Fila " + i + ", columna " + j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    
    public static void mostrar() {
        for(int i=0;i<matriz.length;i++) {
            System.out.println("");
            for(int j=0;j<3;j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
    }
}