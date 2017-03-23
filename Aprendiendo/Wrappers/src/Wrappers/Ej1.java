package Wrappers;
/**
 * Crea dos wrappers de tipo entero con el mismo valor y compáralo con los
 * operadores de == y con el método equals
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Ej1 {
   
    public static void main(String[] args) {
        Integer wrapper1 = new Integer(10);
        Integer wrapper2 = new Integer(10);
        
        Boolean compara = wrapper1 == wrapper2;
        System.out.println("Con el comparador == el resultado es: " + compara);
        System.out.println("Con el método equals el resultado es: " + wrapper1.equals(wrapper2));
    }
}
