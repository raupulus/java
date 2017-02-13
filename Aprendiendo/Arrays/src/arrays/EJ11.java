package arrays;
/**
 * Leer 10 números por teclado, almacenarlo en un array y mostrar la suma, resta,
 * multiplicación y división de todos
 * @author fryntiz
 */
import java.util.*; //Importo todas las librerías
public class EJ11 {
    private static final Scanner sc = new Scanner(System.in);
    private static int suma,resta,multiplicacion,division;
    static int[] array = new int[10];

    public static void main(String[] args) {
        entrada(); //Pide los 10 números
        suma(); //Suma todos los valores
        resta(); //Resta todos los valores
        multiplicacion(); //Multiplica todos los valores
        division(); //Divide todos los valores
    }
    
    public static void entrada() { //Pide los 10 números
        for(int i=0;i<array.length;i++) {
            System.out.println("Introduce el número --> " + i);
            array[i] = sc.nextInt();
            
        }
    }
    
    public static void suma() {
        System.out.println("\nSuma:");
        for(int i=0;i<array.length;i++) {
            suma += array[i];
            System.out.print(suma);
        }
    }
    
    public static void resta() {
        System.out.println("\nResta:");
        for(int i=0;i<array.length;i++) {
            resta -= array[i];
            System.out.print(resta);
        }
    }
    
    public static void multiplicacion() {
        
    }
    
    public static void division() {
        
    }
}
