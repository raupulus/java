package Arrays_Objetos;
/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class Curso {
    private String[] alumnos;
    private int tmp,tmp1;
    
    public Curso(int longitud, String nombre) {
        //Entrada longitud del array
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
