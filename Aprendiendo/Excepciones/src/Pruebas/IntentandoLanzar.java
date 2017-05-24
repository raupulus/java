package Pruebas;

//Importar paquete para excepciones
import java.util.InputMismatchException;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class IntentandoLanzar {

    private static int opcion;
    
    public static void excepcionArithmetic() {
        throw new ArithmeticException("Ha ocurrido una excepción ArithmeticException");
    }

    public static void excepcionInputMismatch() {
        throw new InputMismatchException("Ha ocurrido una excepción InputMismatchException");
    }

    public static void excepcionIllegalArgument() {
        throw new IllegalArgumentException("Ha ocurrido una excepción IllegalArgumentException");
    }

    public static void excepcionNullPointer() {
        throw new NullPointerException("Ha ocurrido una excepción NullPointerException");
    }

    public static void excepcionIllegalState() {
        throw new IllegalStateException("Ha ocurrido una excepción IllegalStateException");
    }
}
