package Arrays_Multidimensionales;
/**
 * Que muestre los primeros 100 números de izquierda a derecha
 * usando un array de dos dimensiones
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */

import java.util.Random;

public class EJ26 {
    static Random rd = new Random();
    private static int filas=30,columnas=60;
    private static int[][] matriz = new int[filas][columnas];
    
    public static void main(String[] args) {
        //Llamada a método que genera números aleatorios
        generarAleatorios();
        //Muestra los 100 primeros
        mostrar();
    }
    
    public static void generarAleatorios() {
        for(int i=0;i<filas;i++) {
            for(int j=0;j<columnas;j++) {
                matriz[i][j] = rd.nextInt(1001);
            }
        }
    }
    
    public static void mostrar() {
        int contador=0;
        System.out.println("|nLos 100 primeros números son:");
        for(int i=0;i<filas;i++) {
            for(int j=0;j<columnas;j++) {
                if (contador <= 100){
                    System.out.print(matriz[i][j] + ", ");
                    contador++;
                } else {break;}
            }
        }
    }
}
