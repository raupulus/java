package Ejercicios_básicos;
/**
 * Clase país como complemento del ejercicio 1
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Random;
public class Pais {
    public String[] paises = new String[3];
    
    public Pais(String[] input) {
        paises = input;
    }
    
    public void sorteo() {
        System.out.println("El pais ganador del sorteo es:");
        Random rd = new Random();
        
        //Número aleatorio de los valores posibles en el array
        System.out.println(paises[rd.nextInt(paises.length)]);
    }

    public void buscar(String posicion) {
        for(int i=0;i<paises.length;i++) {
            if(paises[i] == posicion) { //Comprueba si existe el pais pasado
                System.out.println("La posición de este país es: " + i + "Dentro del array");
            }
        }
    }
}
