package Arrays_Objetos;
/**
 *
 * @author fryntiz
 */
public class alumno {
    private static int tmp,notaMayor,notaMenor,notaMedia;
    private static String nombre_alumno;
    private static int[] notas = new int[5];
    
    public alumno(String a,int[] b) {
        nombre_alumno = a;
        notas = b;
    }
    
    public void mayor() { //Método que devuelve la mejor nota
        tmp = notas[0];
        for(int i=0;i<notas.length;i++) {
            if (notas[i]>tmp) {
                tmp = notas[i];
            }
        }
        notaMayor = tmp;
        System.out.println("Nota Mayor: " + notaMayor);
    }
    
    public void menor() { //Método que devuelve la menor nota
        tmp = notas[0];
        for(int i=0;i<notas.length;i++) {
            if (notas[i]<tmp) {
                tmp = notas[i];
            }
        }
        notaMenor = tmp;
        System.out.println("Nota Menor: " + notaMenor);
    }
    
    public void mostrar() { //Muestra nombre de alumno en mayus y nota media
        for(int i=0;i<notas.length;i++) {//Sacar nota media
            notaMedia += notas[i];
        }
        notaMedia = (notaMedia/notas.length);
        System.out.println("Nombre: " + nombre_alumno + ", Notamedia: " + notaMedia);
    }
}
