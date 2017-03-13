package Básicos;
/**
 * Declara dos variables de tipos String llamadas s1 y s2 e inicialízalas
 * con la cadena literal "HOLA". ¿La condición s1==s2 es verdadera o falsa en sete caso)
 * ¿Y la condición s1.equals(s2)? ¿Por qué?
 * Haz lo mismo pero creando los objetos String usando el operador new ¿Que ocurre ahora?
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class EJ35 {
        
    public static void main(String[] args) {
        String s1="HOLA";
        String s2="HOLA";
     
        if (s1==s2) {
            System.out.println("s1==s2 es true");
        } else {
            System.out.println("s1==s2 es false");
        }
        
        System.out.println("s1.equals(s2) devuelve: " + s1.equals(s2));
        
        String ss1 = new String("HOLA");
        String ss2 = new String("HOLA");
        
        if (ss1==ss2) {
            System.out.println("ss1==ss2 es true");
        } else {
            System.out.println("ss1==ss2 es false");
        }
        
        System.out.println("ss1.equals(ss2) devuelve: " + ss1.equals(ss2));
    }
}
