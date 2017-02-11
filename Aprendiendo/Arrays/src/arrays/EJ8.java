package arrays;
/**
 * Realiza un programa que cree un vector de 100 posiciones con números aleatorios entre 10 y 80.
 * Una vez creado el vector el programa deberá mostrar
 * el mayor, el menor, el que más se repite  y la media
 * @author fryntiz
 */
import java.util.*; //Importo todas las librerías
public class EJ8 {
    static int[] array = new int[100]; //Declaración del array con 100 posiciones
    static Random rd = new Random();
    public static int mayor,menor,repetido,media,tmp;
    
    public static void main(String[] args) {
        llenarArray();
        sacarValores();
        
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void llenarArray() { //Generar números aleatorios
        for (int i=0; i<array.length; i++) {
            tmp = rd.nextInt(80);
            if ((tmp>=10) && (tmp<=80)) {
                array[i] = tmp;
            } else {
                i--;
            }
        }
    }
    
    public static void sacarValores() { //Sacar mayor, menor...
        
    }
    
    
}
