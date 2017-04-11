package Wrappers;
/**
 * Realiza un programa que realice todas las conversiones posibles entre wrappers,
 * String y primitivo para los Float
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class Ej5 {
    
    public static void main(String[] args) {
        float varFloat= 20; //Declarado variable float primitivo
        String varString = "33"; //Declarado string
        
        //De String a Float
        System.out.println("\n\nConvertir de String a Float");
        System.out.println("Mediante parseFloat --> " + Float.parseFloat(varString));
        
        //De Float a String
        System.out.println("\n\nConvertir de Float a String:");
        System.out.println("Mediante valueOf --> " + String.valueOf(varFloat));
        System.out.println("Mediante toString --> " + Float.toString(varFloat));
    }
    
}
