package Ejercicios_Refuerzo;
/*
 * Realiza un programa que genere letras aleatorias y determine si son vocales o consonantes.
 * @author fryntiz
 */
import java.util.*;//Importo librerías

public class Ej6_Letras_aleatorias_vocal_o_consonante {
    private static int a1;
    public static void main(String[] args) {
        letras();//Método que genera letras aleatorias
        System.out.println("La letra generada aleatoriamente es:  " + (char)a1); //Imprimo la letra con la equivalencia del número en ASCII
        comprobar();//Método que comprueba si es consonante o vocal
    }
    
    public static void letras() {//Método que genera números para pasar al lenguaje ASCII
       //En código ASCII del 65 al 90 son letras en mayúsculas y del 97 al 122 son letras en minúsculas
       Random rnd = new Random();
       a1 = (int)(rnd.nextDouble() * 122 + 1);
       if (((a1 <= 64) || (a1 >= 123)) || ((a1 >= 90) && (a1 <= 97))) {//Filtro los números que equivalen a letras en ASCII
           letras();
       }
    }
    
    public static void comprobar() {//Comprueba si es consonante o vocal y si es mayúsculas o minúsculas
        //Vocales en ASCII son para mayúsculas: 65 69 73 79 85  y para minúsculas: 97 101 105 111 117
        if ((a1 == 65) || (a1 == 69) || (a1 == 73) || (a1 == 79) || (a1 == 85)) {
            System.out.println("La letra generada es una Vocal Mayúsculas");
        } else if ((a1 == 97) || (a1 == 101) || (a1 == 105) || (a1 == 111) || (a1 == 117)) {
            System.out.println("La letra generada es una Vocal Minúsculas");
        } else if (a1 <= 90) {
            System.out.println("La letra generada es una Consonante Mayúsculas");
        } else if (a1 >= 97) {
            System.out.println("La letra generada es una Consonante Minúsculas");
        }
    }
}