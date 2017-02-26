package Arrays_Objetos;
/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.Scanner;
public class Curso {
    private static final Scanner sc = new Scanner(System.in);
    private String[] alumnos;
    private String nombreCurso;
    private int tmp,tmp1;
    
    public Curso(int longitud, String nombre) {
        //Entrada longitud del array
        String[] alumnos = new String[longitud];
        nombreCurso = nombre;
        
        //Entrada de nombre para alumnos del curso
        for(int i=0;i<alumnos.length;i++) {
            System.out.println("Inserta el nombre para el alumno " + i + " del curso " + nombre);
            alumnos[i] = sc.next();
        }
    }
    
    public int elMasLargo() {
        //Devuelve el nombre que tenga más caracteres
        tmp = 0; //Contará Posición del array
        tmp1 = 0; //Contará caracteres
        for(int i=0;i<alumnos.length;i++) {
            char[] arrayChar = alumnos[i].toCharArray(); //Convierte en array de caracteres
            
            if(arrayChar.length>tmp1) {
                tmp = i;
                tmp1 = alumnos.length;
            }
        }
        return tmp;
    }
    
    public int elMasCorto() {
        //Devuelve el nombre que tenga menos caracteres
        tmp = 0; //Contará Posición del array
        tmp1 = 0; //Contará caracteres
        for(int i=0;i<alumnos.length;i++) {
            char[] arrayChar = alumnos[i].toCharArray(); //Convierte en array de caracteres
            
            if(arrayChar.length<tmp1) {
                tmp = i;
                tmp1 = alumnos.length;
            }
        }
        return tmp;
    }
    
    public void desplaza() {
        //Desplaza todos los nombres
        //Último nombre pasa a primera posición
    }
    
    public String verNombre(int posicion) {
        //Entrada de posición para devolver nombre de alumno en ella
        return alumnos[posicion];
    }
}
