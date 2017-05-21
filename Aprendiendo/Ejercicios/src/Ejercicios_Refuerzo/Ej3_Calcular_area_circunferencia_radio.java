package Ejercicios_Refuerzo;
/*
 * Realiza un programa que calcule el área de una circunferencia de radio 5,2 centímetros
 * @author fryntiz
 */

import java.util.*;

public class Ej3_Calcular_area_circunferencia_radio {
    private static double area, radio;
    
    public static void main(String[] args) {
        radio = 5.2;
        area = Math.PI * (radio * radio);
        area = Math.round(area*100.00)/100.00;
        System.out.println("El área de una circunferencia de 5,2cm de radio es: " + area + " centímetros");
    }
}
