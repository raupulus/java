package Arrays_Objetos;
/**
 * Se pretende diseñar una clase llamada temperatura que tiene como atributos privados mes (entero), temperatura media(double)
 * en grados centígrados, Fahrenheit (double) como temperatura pasada a grados Fahrenheit y como miembros públicos:
 * 
 * -Un constructor que recibe como argumento un mes y una temperatura en grados centígrados
 * 
 * Para pasar temperaturas de grados Centígrados a Fahrenheit utilizar la fórmula: F=C*1.8+32;
 * 
 * Desde una función principal declarar un array de objetos temperatura que guarde en cada posición las temperaturas de cada mes, y que permita:
 * 1-Mostrar la temperatura de un mes en grados centígrados y Fahrenheit
 * 2-Mostrar la temperatura media del año
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class EJ21 {
    private static int tmp;
    private static int[] array_temp = new int[12];
    
    public static void main(String[] args) {
        entrada();
        menu();
    }
    
    public static void entrada() {
        
    }
    
    public static void menu() {
        boolean salir = false;
        while (!salir) {
            System.out.println("1-Mostrar la temperatura de un mes en grados centígrados y Fahrenheit");
            System.out.println("2-Mostrar la temperatura media del año");
            System.out.println("3-Introducir nuevas temperaturas");
            System.out.println("4-Salir");
            
            switch (tmp) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println("No corresponde a una opción válida");
                    break;
            }
                
        }
    }
}
