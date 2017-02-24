package Arrays_Objetos;
/**
 * Una empresa desea realizar una aplicación para controlar las ventas realizadas por sus comerciales
 * a lo largo de una semana. Se trata de diseñar para ello una clase llamada "Comercial" con los atributos privados:
 * -nombre
 * -Array numérico real de 6 elementos que contiene las ventas en euros realizadas en cada uno de los 6 días laborables de la semana y los métodos:
 * -Un constructor que recibe como argumento el nombre del comercial, dimensiona el array a 6 elementos y pide por teclado las ventas de los 6 días.
 * -Un método llamado mostrar que escribe el nombre del comercial seguido del total de ventas realizadas por el comercial en los 6 días.
 * -Un método llamado comisiones que devuelve el importe que le corresponde al comercial por las ventas realizadas 
 * sabiendo que las ventas realizadas en días pares llevan una comisión del 10% mientras que las ventas realizadas en días impares llevan una comisión del 15%
 * (Se consideran pares las posiciones 0,2,4 e impares el resto)
 * -Un método llamado mejorDia que devuelve un String con el día que mejor ventas tuvo.
 * (Si el mejor día está en la posición 0 devolverá lunes y así hasta la 5 que será sábado)
 * 
 * Desde la clase Main declara un array de objetos de tipo comercial para 5 comerciales y comprueba que funcionan los métodos, de la misma forma, comprueba cual
 * es el comercial que más vende, cual ha sido de todos los comerciales el que ha vendido más en un día y qué día.
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> --> https://github.com/fryntiz
 */
import java.util.Scanner; //Importo la clase scanner para entrada por teclado
public class EJ22 {
    private static int tmp, input, cantidadComerciales = 2; //Dejar 5 comerciales
    private static final Scanner sc = new Scanner(System.in);
    private static String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"}; //Array con días de la semana
    
    public static void main(String[] args) {
        Comercial[] comerciales = new Comercial[cantidadComerciales];
        inicio(comerciales);
        mejorVendedor(comerciales);
    }
    
    public static void inicio(Comercial[] comerciales) {
        //Dimensión del array con las ventas (6)
        int tamañoArrayVentas = 6;
        
        for(int i=0;i<cantidadComerciales;i++) {
            //Pedir nombre de comercial
            System.out.println("\n Introduce el nombre del comercial --> " + i);
            String nombreComercial = sc.next();
            
            //Crear comercial en el array
            comerciales[i] = new Comercial(nombreComercial, tamañoArrayVentas);
            
            //Pedir ventas realizadas para cada dia (6)
            for(int j=0;j<tamañoArrayVentas;j++){
                System.out.println("Introduce la venta del " + dias[j] + " para el comercial " + i + " llamado " + nombreComercial);
                tmp = sc.nextInt();
                comerciales[i].ventas(j, tmp);
            }
        }
    }

    public static void mejorVendedor(Comercial[] comerciales) {
        //Compara la mejor venta de cada comercial y muestra el mejor
        //Mostrar también el día en el que más ha vendido
        System.out.println("Mejor día de cada vendedor: ");
        for(int i=0;i<comerciales.length;i++){
                System.out.println(comerciales[i].mejorDia());
            }
        
        
        //Mostrar vendedor que más ha vendido
        tmp = 0;
        System.out.println("El vendedor que más ha vendido es: ");
        for(int i=0;i<comerciales.length;i++) {
            
        }
       
    }
}