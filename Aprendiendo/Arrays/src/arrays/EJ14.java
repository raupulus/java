package arrays;
/**
 * En España cada persona está identificada con un DNI, en el que figura un número y letra (56999545W
 * La letra que sigue al número se calcula siguiendo esta metodología:
 * Tomando el resto de dividir el número del DNI entre 23 (resultado es entre 0 y 22 siempre)
 * Crear programa que  calcule la letra de un DNI a partir del que introduzca el usuario
 * El programa devolverá el DNI completo (con letra)
 * Crear un método obtenerLetra(int numeroDNI) donde según el resultado de la anterior
 * fórmula busque en un array de caracteres la posición que corresponda con la letra
 * La letra T equivale a 0, letra R a 1 y así hasta la letra E que equivale a 22
 * Ejemplo: Para el DNI 20267079 el resto entre 23 es 8, sería la letra P
 * @author fryntiz
 */
import java.util.*; //Importo todas las librerías
public class EJ14 {
    private static final Scanner sc = new Scanner(System.in);
    private static int tmp;

    
    public static void main(String[] args) {
        int[] array = new int[8];
        entrada();
        obtenerLetra(array);
        
        System.out.println("El DNI completo es: " + tmp);
    }
    
    public static void entrada() {
        System.out.println("Introduce los dígitos del DNI (son 8)");
        tmp = sc.nextInt();
        if ((tmp<9999999)&&(tmp>99999999)) {
            entrada();
        }
    }
    
    public static int obtenerLetra(int[] numeroDNI) {
        
        
        
        return tmp;
    }
}
