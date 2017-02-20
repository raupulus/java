package Ejercicios_básicos;
/**
 * Crea una clase llamada países que tiene como atributo un array con el nombre
 * países y los métodos:
 * -Un constructor que inicializa el array con el nombre de los países pasados por la línea de órdenes
 * -Un método llamado sorteo que devuelve el nombre del país elegido al azar de entre todos los países
 * -Un método llamado buscar que recibe como argumento el nombre de un país y devuelve la posición en que se encuentra el país en el array o -1 si no lo encuentra
 * 
 * Desde el método principal declarar un objeto de tipo Paises y probar todos los métodos de la clase
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Scanner; //Importo librería scanner
public class EJ1 {
    private static final Scanner sc = new Scanner(System.in);
    private static int input;
    private static String pais;
    private static String[] paises = new String[3];
    private static boolean salir;
    private static Pais paisesObjeto;
    
    public static void main(String[] args) {
        entrada();
    }
    
    public static void menu() {
        salir=false;
        while (!salir) {
            System.out.println("***** MENÚ *****");
            System.out.println("1 - Introducir países");
            System.out.println("2 - Realizar sorteo");
            System.out.println("3 - Posición del país");
            System.out.println("4 - Salir");
            input = sc.nextInt(); //Pedir acción del menú
            switch (input) {
                case 4:
                    salir = true;
                    break;
                case 3:
                    posicion(); //Muestra la posición del país
                    break;
                case 2:
                    sorteo(); //Elige un país al azar
                    break;
                case 1:
                    entrada(); //Pide los datos de entrada
                    break;
                default:
                    System.out.println("No entiendo lo que escribes, inserta un valor válido");
                    break;
            }
        }
    }
    
    public static void entrada() { //Pide los paises y crea el array Objeto
        System.out.println("Introduce los países");
        
        for (int i=0;i<paises.length;i++) {
            System.out.println("Introduce el país " + i);
            paises[i] = sc.next();
            //Constructor de la clase "Pais" para pasar array de paises y crear objeto
            paisesObjeto = new Pais(paises);
        }
        
        System.out.println("Los paises introducidos son:"); //Muestra valores introducidos
        for (int i=0;i<paises.length;i++) {
            System.out.print(paises[i] + ", ");
        }
    }
    
    public static void posicion() {
        System.out.println("Introduce el país que desea conocer la posición:");
        pais = sc.nextLine();
        //Llamar a la clase en este punto pasandole como parámetro el pais
        //System.out.println(paisesObjeto.buscar(pais));
    }
    
    public static void sorteo() {
        System.out.println("El país elegido por el sorteo es: ");
        //Llamar a la clase, exactamente al método que sortea el array
        //System.out.println(paisesObjeto.sorteo());
    }
}
