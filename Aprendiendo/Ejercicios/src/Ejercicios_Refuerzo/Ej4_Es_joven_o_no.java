package Ejercicios_Refuerzo;
/*
 * Dentro de una clase joven tenemos las variables enteras edad, nivel_de_estudios e ingresos.
 * Necesitamos almacenar en la variable booleana jasp el valor:
 * >Verdadero. Si la edad es menos o igual a 28 y el nivel_de_estudios es mayor que tres, o bien, la edad es menos que 30 y los ingresos supera los 28.000 (euros)
 * >Falso. En caso contrario
 * @author fryntiz
 */

import java.util.*;//Importo librerías

public class Ej4_Es_joven_o_no {
    private static int edad, nivel_de_estudios, ingresos;
    private static boolean jasp;
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Introduce la edad");
        edad = sc.nextInt();//Input edad
        
        System.out.println("Introduce Nivel de Estudios (valor numérico)");
        nivel_de_estudios = sc.nextInt();//Input estudios
        
        System.out.println("Introduce cantidad de ingresos en Euros");
        ingresos = sc.nextInt();//Input ingresos
        
        comprobar();
        
        System.out.println("¿Es joven? -> " + jasp);
    }
    
    public static void comprobar() { //Comprueba si entra en la categoría joven
        if (((edad <= 28) && (nivel_de_estudios > 3)) || ((edad < 30) && (ingresos > 28000))) {
            jasp = true;
        } else {
            jasp = false;
        }
    }
}
