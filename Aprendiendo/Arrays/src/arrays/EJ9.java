package arrays;
/**
 * Realiza un programa que cree un vector de 100 posiciones
 * con números aleatorios entre 1 y 100. Una vez creado el vector se ordenará este
 * y mostrar los números entre 1 y 100 que no han sido almacenados.
 * @author fryntiz
 */
import java.util.*; //Añado todas las librerías

public class EJ9 {
    static Random rd = new Random();
//x = rd.nextInt(1000); //numero máximo 1000
    static int[] array = new int[100]; //Creo array de 100 posiciones
    static int tmp;
    
    public static void main(String[] args) {
        generarNumeros();
        ordenar();
        mostrar();
    }
    
    public static void generarNumeros() { //Llena el array de números aleatorios
        for(int i=0; i<array.length; i++) {
            tmp = rd.nextInt(101);
            if ((tmp<101) && (tmp>0)) {
                array[i] = tmp;
            } else {
                i--;
            }
        }
    }
    
    public static void ordenar() { //Ordenar el array de menor a mayor
        
    }
    
    public static void mostrar() { //Dibuja el array por pantalla
        System.out.println("\nLos números no almacenados son:");
        for(int i=1; i<=100; i++) {
            for(int j=0; j<array.length; j++) {
                if (array[j] != i) {
                    tmp = i;
                    //SIN TERMINAR
                } else {
                    
                }
                
            }
            
            System.out.print(tmp + ", ");
        }
    }
}
