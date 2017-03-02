package Arrays_Multidimensionales;
/**
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en una matriz de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Scanner;
public class EJ27 {
    private static int filas=5, columnas=6,contadorF,contadorC;;
    private static int[][] matriz = new int[filas][columnas];
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Entrada port teclado de valores
        entrada();
        //Mostrar valores
        mostrar();
    }
    
    public static void entrada() {
        System.out.println("");
        for (int i=0;i<filas-1;i++) {
            for (int j=0;j<columnas-1;j++) {
                if(j == (columnas-2)) {
                    matriz[i][j] = contadorC;
                } else {
                    matriz[i][j] = sc.nextInt();
                    contadorC += matriz[i][j];
                }
            }
        }
    }
    
    public static void mostrar() {
        System.out.println("Array completo");
        for (int i=0;i<filas-1;i++) {
            for (int j=0;j<columnas-1;j++) {
                System.out.print(matriz[i][j] + ", ");
            }
        }
        
        //Mostrar la suma de las Filas almacenadas en la última posición
        System.out.println("\nSumas de FIlas:");
        int x=0;
        for (int i=0;i<filas-1;i++) {
            x++;
            
            System.out.println("Fila " + i + " suma un total de --> " + matriz[i][x]);
            
            matriz[0][1]
                    matriz[1][1]
                            matriz[2][1]
            
        }
        
        System.out.println("\nSumas de Columnas");
        //Mostrar la suma de las Filas almacenadas en la última posición
        for (int i=0;i<filas;i++) {
            for (int j=columnas-2;j==columnas-2;j++) {
                System.out.println("Columna " + i + " suma un total de --> " + matriz[i][filas-1]);
            }
        }
    }
}
