package ExcepcionesControladas;

/**
 * Controlando una excepción del tipo "NullPointerException"
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class NullPointerException {

    public static void main(String[] args) {
        try {
            String cadenaNula = null;
            cadenaNula.length();
        } catch(NullPointerException e) {
            System.out.println("Atención, este error ha sido capturado");
            
            //Mostrar en la consola el error producido:
            //e.printStackTrace();
        }
    }
}
