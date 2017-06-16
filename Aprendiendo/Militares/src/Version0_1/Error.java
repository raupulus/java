package militares;


/*
 * En esta clase definimos el tratamiento para errores de nuestra aplicación.
 * Se usa una constante para el color, por defecto rojo con el fin de normalizar la presentación
 * de errores en todas las plataformas.
 * @author Agustín Lorenzo Morales
 * @version 0.01
 */
public class Error {

    // Constante para definir el color para mostrar el error.
    public final static String ACT_COLOR = "\u001B[31m";    // Color rojo.
    public final static String DES_COLOR = "\u001B[30m";    // Color negro.

    /**
     * Mostrar errores. Realiza una caja alrededor de la cadena recibida en color verde e imprime el error en rojo.
     * @param cadena 
     */
    public static void muestraError(String cadena){
        int lg = cadena.length();
        String cadsup = "";
        String cadinf = "";
        
        for (int x = 0; x<(lg/2-5); x++){ // Rellena de ─ la primera parte de la linea superior del recuadro de error.
            cadsup += "─";
        }
        cadsup += " E R R O R "; // Sitúa la palabra ERROR en el centro de la línea superior del recuadro de error.
        
        // Rellena de - la parte final de la linea superior del recuadro de error.
        for (int x = (lg/2+7); x<=lg+2; x++){
            cadsup += "─"; 
        }
        
        // Rellena de ─ la parte inferior del recuadro de error.
        for (int x = 0; x<=lg+1; x++){
            cadinf += "─";
        }
//        System.err.println(cadsup);
        System.err.println(ACT_COLOR+"\n\t┌"+cadsup+"┐");
        System.err.print(ACT_COLOR+"\t│ "+cadena+" │\n");
        System.err.print(ACT_COLOR+"\t└"+cadinf+"┘\n"+DES_COLOR);

    }
    
}
