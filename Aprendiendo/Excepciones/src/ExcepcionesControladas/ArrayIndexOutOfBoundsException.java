package ExcepcionesControladas;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        try {
            String[] arrayError = new String[5];
            arrayError = null;
            arrayError[20] = "prueba"; //Solo tiene 5 posiciones (0-4)
        } catch (Exception e) { //Falla con ArrayIndexOutOfBoundsException .....
            System.out.println("Error capturado");

            //Mostrar en la consola el error producido:
            e.printStackTrace();
        }
    }
}
