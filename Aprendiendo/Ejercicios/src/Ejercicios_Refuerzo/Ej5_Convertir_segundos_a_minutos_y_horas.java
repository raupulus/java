package Ejercicios_Refuerzo;
/*
 * Realiza un programa con una variable entera t la cual contiene el tiempo en segundos y queremos conocer este tiempo pero expresado en horas, minutos y segundos.
 * @author fryntiz
 */

import java.util.*;

public class Ej5_Convertir_segundos_a_minutos_y_horas {
   private static int t, horas, segundos, minutos;
   private static final Scanner sc = new Scanner(System.in);
   
   public static void main(String[] args) {
       System.out.println("Introduce el tiempo en segundos:");
       t = sc.nextInt(); //Input en segundos
       
       System.out.println("\n Has introducido " + t + " segundos");//Muestra segundos introducidos
       
       convertir();//Realiza la conversión a minutos/horas/segundos
       
       System.out.println("\n Equivale a " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos \n");
   }
   
   public static void convertir() { //Este método convierte "t" los segundos de entrada a horas/minutos/segundos
       horas = t / 3600; //1 hora = 3600 segundos
       minutos = (t % 3600) / 60; //Calculos los minutos con el resto de la conversión a horas en segundos
       segundos = t - ((horas * 3600) + (minutos * 60)); //Paso las horas y minutos a segundos para sumarlos y luego restarlo a los segundos introducidos
   }
}