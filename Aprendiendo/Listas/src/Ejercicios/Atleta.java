package Ejercicios;
/**
 * CLASE COMPLEMENTARIA DEL EJERCICIO 9
 * 
 * Clase Atleta con los atributos:
 * dorsal(int),nombre(String),tiempos(int [3])
 * Y los métodos:
 * -Un constructor que pide los datos por teclado
 * -Métodos get y set que creas necesarios
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Atleta {
    private int dorsal;
    private String nombre;
    private int[] tiempos = new int[3];
    
    public Atleta(int inputDorsal, String inputNombre, int[] inputTiempos) { //Constructor de la clase
        dorsal = inputDorsal;
        nombre = inputNombre;
        tiempos = inputTiempos; //COMPROBAR QUE FUNCIONA ESTA PARTE
    }
    
    public int getDorsal() {
        return dorsal;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getTiempos(int x) {
        return tiempos[x];
    }
    
    public String toString() {
        return "Dorsal:\t" + getDorsal() + "\t\tnombre:\t" + getNombre() + "\t\ttiempos:\t" + tiempos[0] + ", " + tiempos[1] + ", " + tiempos[2];
    }
}
