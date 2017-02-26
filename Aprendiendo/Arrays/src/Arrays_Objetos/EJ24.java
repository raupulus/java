package Arrays_Objetos;
/**
 * Diseñar una clase llamada Curso que tiene como atributos privados el nombre
 * del curso y como miembros públicos:
 * -Un constructor que recibe como argumento el número de alumnos dimensiona el 
 * array y pide los nombres por teclado.
 * -Un método llamado elMasLargo que devuelve el nombre que tenga más caracteres
 * -Un método llamado desplaza que desplaza todos los nombres un lugar a la derecha
 * de forma que el último pasa a ocupar la primera posición.
 * -Un método llamado verNombre que recibe como argumento una posición y devuelve
 * el nombre que está en esa posición.
 * 
 * Desde una función principal declarar un array de 4 objetos de la clase curso (1ºDAW, 2ºDAW, 1ºSMR, 2ºSMR)
 * 
 * Desarrollar un menú que muestre:
 * 1 - Resumen de un curso pedido por teclado
 * 2 - Mostrar el alumno con el nombre más largo y en qué curso está
 * 3 - Mostrar qué clase tiene el alumno con el nombre más corto
 * 0 - Salir
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class EJ24 {
    
    public static void main(String[] args) {
        principal();
        menu();
    }
    
    public static void principal() {
        //Creo array con los cursos y parametros
        Curso[] cursos = { 
            new Curso(2,"1ºDAW"),
            new Curso(2,"2ºDAW"),
            new Curso(2,"1ºSMR"),
            new Curso(2,"2ºSMR")
        };
        
    }
    
    public static void menu() {
        boolean salir = false;
        int input = 0;
        
        
        while (!salir) {
            System.out.println("***** MENÚ *****");
            System.out.println("1 - Resumen de un curso pedido por teclado");
            System.out.println("2 - Mostrar el alumno con el nombre más largo y en qué curso está");
            System.out.println("3 - Mostrar qué clase tiene el alumno con el nombre más corto");
            System.out.println("0 - Salir");
            
            
            switch (input) {
                case 1:
                    
                    break;
            }
        }
    }
}
