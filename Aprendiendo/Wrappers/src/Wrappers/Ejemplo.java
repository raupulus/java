package Wrappers;
/**
 * Analizar y comprobar el siguiente código de ejemplo
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.ArrayList;
import java.util.List;
public class Ejemplo {
    
    public static void main(String[] args) {
        Integer i = -8; // (1)
        
        // Unboxing en paso de parámetros
        int va = valorAbsoluto(i);
        System.out.println("Valor absoluto de  " + i + " = " + va);
        List<Double>ld =new ArrayList<>();
        ld.add(Math.PI); // (2)
        
        // Unboxing en asignación
        double pi = ld.get(0);
        System.out.println("pi = " + pi);
    }
    
    public static int valorAbsoluto(int i) {
        return (i < 0) ? -i : i;
    }
}
