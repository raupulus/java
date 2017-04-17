package Ejercicios;
/**
 * Se pretende hacer una selección de los atletas que van a participar en una
 * prueba de Triatlón. Diseñar para ello una clase llamada Atleta con los atributos:
 * dorsal(int),nombre(String),tiempos(int [3])
 * Y los métodos:
 * -Un constructor que pide los datos por teclado
 * -Métodos get y set que creas necesarios
 * 
 * Una clase carrera con los atributos:
 * -arrayList de atletas
 * Con los métodos:
 * -Un constructor que crea el ArrayList
 * 
 * Método necesarios para llevar a cabo las tareas que se piden en el menú
 * repetitivo siguiente:
 * 1 - Añadir un atleta
 * 2 - Listado de atletas con el tiempo total empleado en las 3 pruebas
 * 3 - Borrar todos los atletas cuyo tiempo sea inferior al tiempo medio de todos
 * 4 - Listado de los atletas seleccionados ordenado por tiempo y prueba
 * 5 - Listado de ganadores (Sumando todos los tiempos)
 * 6 - Buscar un Atleta (Por nombre o dorsal)
 * 7 - Salir
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */

public class EJ9 {
   
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        System.out.println("1 - Añadir un atleta");
        System.out.println("2 - Listado de atletas con el tiempo total empleado en las 3 pruebas");
        System.out.println("3 - Borrar todos los atletas cuyo tiempo sea inferior al tiempo medio de todos");
        System.out.println("4 - Listado de los atletas seleccionados ordenado por tiempo y prueba");
        System.out.println("5 - Listado de ganadores (Sumando todos los tiempos)");
        System.out.println("6 - Buscar un Atleta (Por nombre o dorsal)");
        System.out.println("7 - Salir");
    }
    
    public static void añadirAtleta() {
        
    }
}


