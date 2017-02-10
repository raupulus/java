package arrays;
/*
 * Construye un método para rotar una posición a la derecha un array de números
 */

public class EJ3 {
    private static int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    private static int x=(array.length-1);

    public static void main(String[] args) {
        System.out.println("");
        rotarDerecha(array);
    }
    public static void rotarDerecha(int[] numeros){
        for (int i = 0; i <= (numeros.length-1); i++) {
            if (x>=numeros.length) { x=0;}
            System.out.println(numeros[x]);
            x++;
        }
    }
}