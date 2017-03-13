package Básicos;
/**
 * Crear una cadena y mostrarla al revés
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */

public class EJ37 {
    
    public static void main(String[] args) {
        String s1 = "Esta cadena tiene que mostrarse al revés";
        System.out.println(s1);
        
        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
        }
    }
}
