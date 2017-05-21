package Ejercicios_Refuerzo;

/*
 * Realiza un método para la clase Test que genere letras de forma aleatoria
 * @author fryntiz
 */

import java.util.*;//Importo librerías

public class Ej1_test_letras_aleatorias {
    private static int a1;
    public static void main(String[] args) {
        letras();//Método que genera letras aleatorias
        System.out.println("La letra generada aleatoriamente es:  " + (char)a1); //Imprimo la letra con la equivalencia del número en ASCII
        
    }
    
    public static void letras() {//Método que genera números para pasar al lenguaje ASCII
       //En código ASCII del 65 al 90 son letras en mayúsculas y del 97 al 122 son letras en minúsculas
       Random rnd = new Random();
       a1 = (int)(rnd.nextDouble() * 122 + 1);
       if (((a1 <= 64) || (a1 >= 123)) || ((a1 >= 90) && (a1 <= 97))) {//Filtro los números que equivalen a letras en ASCII
           letras();
       }
    }
}