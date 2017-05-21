package ExcepcionesSinCapturar;

/**
 * En el siguiente código planteo una excepción que no capturo
 * La utilizaré en otros ejercicios
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
}
