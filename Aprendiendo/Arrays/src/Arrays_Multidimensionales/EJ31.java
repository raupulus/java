package Arrays_Multidimensionales;
/**
 * Realiza un programa que sea capaz de rotar todos lo elementos de una matriz 
 * cuadrada una posición en el sentido de las agujas del reloj.
 * La matriz debe tener 12 filas por 12 columnas y debe contener números generados
 * al azar entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz 
 * resultado, ambas con los números convenientemente alineados.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
import java.util.Random;
public class EJ31 {
    static Random rd = new Random();
    private static int filas=12,columnas=12;
    private static int[][] matriz= new int[filas][columnas];
    public static void main(String[] args) {
        generar();
    }
    
    public static void generar() {
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                matriz[i][j] = rd.nextInt(1001);
                if ((matriz[i][j]<0) | (matriz[i][j]>1000)) {j--;} //Comprueba número válido (0-100)
            }
        }
    }
}
