package Arrays_Multidimensionales;
/**
 * Ejercicio en el que se rellene un array de dos dimensiones con números pares,
 * lo pinte y después que pida una posición X,Y y mostrar el número correspondiente.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Scanner;
public class EJ28 {
    private static final Scanner sc = new Scanner(System.in);
    private static int filas=1,columnas=1;
    private static int[][] matriz = new int[filas][columnas];
    
    public static void main(String[] args) {
        //Pedir datos de entrada
        entrada();
        
        //Menú para pedir número o salir
        menu();
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
        Boolean salir = false;
        int input;
        
        while(!salir) {
            System.out.println("*** *** *** OPCIONES *** *** ***");
            System.out.println("1 - Introducir posiciones X,Y para mostrar en el array");
            System.out.println("2 - Salir del programa");
            
            input = sc.nextInt();
            
            switch(input){
                case 1:
                    buscarNumero();
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("No es válido el valor introducido");
            }
        }
    }
    
    public static void buscarNumero() {
        int input=100,tmp=0,tmp1=0;
        
        while ((input>=filas) | (input<0)) {
            System.out.println("Introduce la coordenada X (Correspondiente a la fila");
            input = sc.nextInt();
            tmp = input;
        }
        
        input=100;
        
        while ((input>=filas) | (input<0)) {
            System.out.println("Introduce la coordenada Y (Correspondiente a la Columna");
            input = sc.nextInt();
            tmp1 = input;
        }
        
        System.out.println("Las coordenadas X=" + tmp + " junto a Y=" + tmp1 + ". Corresponden al valor --> " + matriz[tmp][tmp1]);
    }
}
