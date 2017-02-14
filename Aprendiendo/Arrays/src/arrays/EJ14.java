package arrays;
/**
 * En España cada persona está identificada con un DNI, en el que figura un número y letra (56999545W
 * La letra que sigue al número se calcula siguiendo esta metodología:
 * Tomando el resto de dividir el número del DNI entre 23 (resultado es entre 0 y 22 siempre)
 * Crear programa que  calcule la letra de un DNI a partir del que introduzca el usuario
 * El programa devolverá el DNI completo (con letra)
 * Crear un método obtenerLetra(int numeroDNI) donde según el resultado de la anterior
 * fórmula busque en un array de caracteres la posición que corresponda con la letra:
 * 0,1,2,3,4,5,6,7,8,9.......22
 * T,R,W,A,G,M,Y,F,P,D,X,B,N,J,Z,S,Q,V,H,L,C,K,E
 * Ejemplo: Para el DNI 20267079 el resto entre 23 es 8, sería la letra P
 * @author fryntiz
 */
import java.util.*; //Importo todas las librerías
public class EJ14 {
    private static final Scanner sc = new Scanner(System.in);
    private static int tmp;
    private static String dniFINAL;
    
    public static void main(String[] args) {
        String[] array = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        entrada(); //Entrada de DNI
        obtenerLetra(array); //Calcula la letra que le corresponde a partir del array
        
        System.out.println("El DNI completo es: " + dniFINAL);
    }
    
    public static void entrada() { //Entrada de DNI
        System.out.println("Introduce los dígitos del DNI (son 8)");
        tmp = sc.nextInt();
        if ((tmp<9999999)&&(tmp>99999999)) {
            entrada();
        }
    }
    
    public static String obtenerLetra(String[] numeroDNI) {//Calcular letra correspondiente
        dniFINAL = Integer.toString(tmp) + "-" + numeroDNI[tmp%23];
        return dniFINAL;
    }
}
