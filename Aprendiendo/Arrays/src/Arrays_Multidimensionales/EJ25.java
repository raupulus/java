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
    
    private static int tmp,filas=2,columnas=3;
    
    //Creo la matriz
    private static int[][] matriz = new int[filas][columnas];//[filas][columnas]
    
    public static void main(String[] args) {
        //Entrada de datos, método entrada()
        entrada();
    }
    
    public static void entrada() {
        System.out.println("Introduce los valores");
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<3;j++) {
                System.out.println("Fila " + i + ", columna " + j);
                matriz[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<matriz.length;i++) {
            System.out.println("");
            for(int j=0;j<3;j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            
            
            
        }
    }
}
