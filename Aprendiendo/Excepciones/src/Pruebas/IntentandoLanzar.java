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

    public static void main(String[] args) {
        try {
            System.out.println("Todo Correcto, no hay excepción");
        } catch (ArithmeticException e) {
            System.out.println("He atrapado ArithmeticException");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("He atrapado InputMismatchException");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("He atrapado IllegalArgumentException");
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("He atrapado NullPointerException");
            System.out.println(e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("He atrapado IllegalStateException");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("He llegado al final");
            System.out.println("Se acaba de ejecutar: \'finally\'");
        }
    }

}
