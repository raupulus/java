package arrays;
/**
 *Realiza un método que tome como parámetros de entrada dos arrays de enteros 
 * y devuelva como salida un único array con los elementos de los anteriores arrays ordenados de forma ascendente
 * @author fryntiz
 */
import java.util.*; //Importo librerías
public class EJ7 {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) { //Clase principal
        System.out.println("*****PRIMER ARRAY*****");
        int[] arrayA = input(); //Entrada arrayA
        System.out.println("*****SEGUNDO ARRAY*****");
        int[] arrayB = input(); //Entrada arrayB
        int[] arrayC = ordenar(arrayA, arrayB); //Método que ordena los arrays
        
        System.out.println("\n\nEl conjunto de los dos Arrays ordenados es:");
        for(int i=0;i<arrayC.length; i++) {
            System.out.println(arrayC[i]);
        }
    }
    
    public static int[] input() {
        System.out.println("Introduce la longitud del array");
        int tmp = sc.nextInt(); //Longitud del array
        int[] array = new int[tmp];
        
        for (int i=0; i<tmp; i++){
            System.out.println("Introduce el valor " + i + " del array");
            array[i] = sc.nextInt();
        }
        
        return array; //Devuelve el array
    }
    
    public static int[] ordenar(int a[],int b[]) { //Método que mezcla en C los dos array y los ordena
        int sumaLongitudArray = a.length + b.length;
        int[] arrayC = new int[sumaLongitudArray]; //Creo un Array con la longitud de A+B
        
        int tmp = 0; //Variable para intercambio de posiciones
        for(int i=0;i<sumaLongitudArray; i++) { //Meter valores de A y B en C
           if (i > a.length-1){
               arrayC[i] = b[tmp];
               tmp++;
           } else {
               arrayC[i] = a[i];
           }
        }
        
        for (int i=0; i<arrayC.length; i++) { //Método que ordena arrayC
            for (int j=0; j<arrayC.length; j++) {
                if (arrayC[j] > arrayC[i]) {
                    tmp = arrayC[i];
                    arrayC[i] = arrayC[j];
                    arrayC[j] = tmp;
                }
            }
        }

        return arrayC; //Devuelve el array C ordenado
    }
}
