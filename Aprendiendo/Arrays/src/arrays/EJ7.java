package arrays;

/**
 *Realiza un método que tome como parámetros de entrada dos arrays de enteros 
 * y devuelva como salida un único array con los elementos de los anteriores arrays ordenados de forma ascendente
 * @author fryntiz
 */
public class EJ7 {
    static int[] arrayA = {9,1,12,3,21};
    static int[] arrayB = {13,8,6,44,31};
    //static int[] arrayC = new int[10];
    
    public static void main(String[] args) {
        int[] arrayC = ordenar(arrayA, arrayB);
        
        for(int i=0;i<arrayC.length; i++) {
            System.out.println(arrayC[i]);
        }
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
            System.out.println(i);
        }
        
        
        
        
        
        return arrayC;
    }
}
