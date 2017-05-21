package Ejercicios_Refuerzo;
/*
 * Realiza un programa en Java que dadas dos variables a y b, intercambie los valores de a y b
 * @author fryntiz
 */
import java.util.*;
public class Ej2_Intercambiar_a_y_b {
   private static String a, b, tmp;
   private static final Scanner sc = new Scanner(System.in);
   
   public static void main(String[] args) {
       System.out.println("Introduce el primer valor");
       a = sc.nextLine();//Input valor a
       System.out.println("Introduce el Segundo valor");
       b = sc.nextLine();//Input valor b
       
       System.out.println("Has introducido la variable a: " + a + " y la variable b: " + b);
       //Intercambio las variables
       tmp = a;
       a = b;
       b = tmp;
       System.out.println("Intercambiando el valor de las variables ahora a: " + a + " y la variable b: " + b);
   }
}