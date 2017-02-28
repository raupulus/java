package Arrays_Multidimensionales;
/**
 * Ejercicio en el que se rellene un array de dos dimensiones con números pares,
 * lo pinte y después que pida una posición X,Y y mostrar el número correspondiente.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class EJ28 {
    private static int filas=4,columnas=4;
    private static int[][] matriz = new int[filas][columnas];
    
    public static void main(String[] args) {
        //Pedir datos de entrada
        entrada();
    }
    
    public static void entrada() {
        System.out.println("Introduce los números para la matriz:");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.println("Introduce el valor de la fila " + i + ", columna " + j);
                
            }
        }
    }
}