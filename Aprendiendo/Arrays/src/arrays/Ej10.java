package arrays;
/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo
 * Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado
 * se deben almacenar los cuadrados de los valores que hay en un número.
 * A continuación, muestra el contenido de los tres arrays dispuesto en tres columnas.
 * @author fryntiz
 */
import java.util.*; //Importo todas las librerías
public class Ej10 {
    static int[] numeros = new int[20];
    static int[] cuadrados = new int[20];
    static int[] cubos = new int[20];
    static int tmp; //Variables
    static Random rd = new Random();

    public static void main(String[] args) {
        llenarNumeros();
        llenarCuadrados();
        llenarCubos();
        mostrar();
    }
    
    public static void llenarNumeros() {
        //int tmp = rd.nextInt(100); //numero máximo 100
        for (int i=0; i<numeros.length; i++) {
            tmp = rd.nextInt(101);
            if ((numeros[i]<0) | (numeros[i]>100)) {
                i--;
                //continue;
            }
            //numeros[i] = tmp;
        }
    }
    
    public static void llenarCuadrados() {
        
    }
    
    public static void llenarCubos() {
        
    }
    
    public static void mostrar() {
        System.out.println("\nArray números:");
        for (int i=0; i<numeros.length;i++) {
            System.out.print(numeros[i] + ", ");
        }
        
        System.out.println("\nArray Cuadrados:");
        for (int i=0; i<cuadrados.length;i++) {
            System.out.print(cuadrados[i] + ", ");
        }
        
        System.out.println("\nArray Cubos:");
        for (int i=0; i<cubos.length;i++) {
            System.out.print(cubos[i] + ", ");
        }
    }
}
