package ExcepcionesSinCapturar;

/**
 * En el siguiente código planteo una excepción que no capturo
 * La utilizaré en otros ejercicios
 * 
 * Al ejecutarse provocará un error en tiempo de ejecución cuando intente
 * mirar la longitud del String en el métodoC() ya que es "null"
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class NullPointerException {
    public static void main(String[] args) {
        NullPointerException excepcion = new NullPointerException();
        excepcion.metodoA();
    }
    
    private void metodoA() {
        this.metodoB();
    }
    
    private void metodoB() {
        this.metodoC();
    }
    
    private void metodoC() {
        String provocoError = null;
        provocoError.length();
    }
}
