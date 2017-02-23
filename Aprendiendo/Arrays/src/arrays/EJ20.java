package arrays;
/**
 * Crea un programa con dos métodos: busquedaLineal y busquedaDicotomica.
 * En el programa principal se define el siguiente array:
 * int[] valores = {2,5,1,6,3,4,8,32}
 * 
 * Muestra el número de iteraciones necesarias para buscar el número 4 y compararlos
 * 
 * Luego puedes comprobar otros valores en el array:
 * int[] valores = {2,5,1,6,3,4,8,32,21,62,23,73,21,46,28,98,423,49,23,71,51,422,638}
 * int[] valores = {57,53,21,37,17,36,22,3,44,97,89,26,31,47,8,17,4}
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class EJ20 {
    public static int[] valores = {2,5,1,6,3,4,8,32};
    public static int contadorLineal = 0, contadorDicotomica = 0, valorBuscado = 4, tmp;
    
    public static void main(String[] args) {
        busquedaLineal();
        busquedaDicotomica();
        System.out.println("\n\nEl método Lineal ha realizado \"" + contadorLineal + "\" iteraciones");
        System.out.println("\nEl método Dicotómico ha realizado \"" + contadorDicotomica + "\" iteraciones");
    }
    
    public static void busquedaLineal() {
        for(int i=0;i<valores.length;i++){
            contadorLineal++;
            if (valores[i] == valorBuscado) {
                break;
            }
        }
    }
    
    public static void busquedaDicotomica() {
        //Ordenar el array
        for(int i=0;i<valores.length;i++){
            for(int j=0;j<valores.length;j++){
                contadorDicotomica++;
                if (valores[i] <= valores[j]) {
                    tmp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = tmp;
                }
            }
        }
        
        //Mostrar Array Dicotómico ordenado
        System.out.println("\nOrdenar el array para el método Dicotómico ha necesitado: " + contadorDicotomica + " iteraciones");
        System.out.println("Array Dicotómico ordenado: ");
        for(int i=0;i<valores.length;i++){
            System.out.print(valores[i] + ", ");
        }
    }
}
