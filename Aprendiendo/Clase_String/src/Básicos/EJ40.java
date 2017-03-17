package Básicos;
/**
 * Crea y compara dos cadenas escogidas aleatoriamente de un array que contenga
 * nombre de países usando compareTo(). ¿Qué ocurre cuando las cadenas son de
 * distinta longitud?
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
import java.util.Random;
public class EJ40 {
    static Random rd = new Random();
    private static String[] array = {"España", "Francia", "Irlanda", "Reino Unido", "Cataluña", "Andalucía"};
    
    public static void main(String[] args) {
        int x1,x2;
        //Seleccionar aleatorios del array
        x1 = rd.nextInt(1000);
        x2 = rd.nextInt(1000);
    }
}
