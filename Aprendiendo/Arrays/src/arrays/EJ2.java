package arrays;
/**
 * Definir método que reciba array de enteros y devuelva otro array con los valores pares encontrados en el original
 * @author fryntiz
 */

public class EJ2 { 
    private static int[] arrayB = new int[8];
    static int x = 0;
    
    public static void main(String[] args) {
        int[] arrayA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        valoresPares(arrayA);
    }
    
    public static void valoresPares(int z[]) {//Calcula los números pares
        System.out.println("Los números pares son:");
        for (int i=0; i<=(z.length-1); i++) {
            if ((z[i]%2) == 0) {
                arrayB[x] = z[i];
                System.out.print(arrayB[x] + ", ");
                x++;
            }
        }
    }
    
}
