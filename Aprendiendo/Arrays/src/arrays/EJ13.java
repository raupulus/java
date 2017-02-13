package arrays;
/**
 * Pedir al usuario los valores de 10 números y meterlos en un array y después
 * mostrarlos en orden inverso a como fueron introducidos
 * @author fryntiz
 */
import java.util.*; //Importo todas las librerías
public class EJ13 {
    private static final Scanner sc = new Scanner(System.in);
    private static int[] input = new int[10];
    
    
    public static void main(String[] args) {
        entrada();
    }
    
    public static void entrada() { //Entrada de valores
        System.out.println("Introduce los valores");
        for (int i=0;i<input.length;i++) {
            System.out.println("Introduce el valor " + (i+1));
            input[i] = sc.nextInt();
        }
        
    }
    
    public static void mostrar() {
        System.out.println("Mostrando valores de forma inversa");
    }
}
