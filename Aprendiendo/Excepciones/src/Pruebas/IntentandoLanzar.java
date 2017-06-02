package Pruebas;

//Importar paquete para excepciones
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class IntentandoLanzar {

    private static final Scanner sc = new Scanner(System.in);
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

    public static void iniciar(int x) {
        if (x == 1) {
            excepcionArithmetic();
        } else if (x == 2) {
            excepcionInputMismatch();
        } else if (x == 3) {
            excepcionIllegalArgument();
        } else if (x == 4) {
            excepcionNullPointer();
        } else if (x == 5) {
            excepcionIllegalState();
        } else {
            System.out.println("No has elegido ninguna opción válida");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("0 - No hay excepción");
            System.out.println("1 - ArithmeticException");
            System.out.println("2 - InputMismatchException");
            System.out.println("3 - IllegalArgumentException");
            System.out.println("4 - NullPointerException");
            System.out.println("5 - IllegalStateException");
            System.out.println("Introduce el valor de la excepción:");

            opcion = sc.nextInt();
            iniciar(opcion);

            System.out.println("\nTodo Correcto, no hay excepción");
        } catch (ArithmeticException e) {
            System.out.println("\nHe atrapado ArithmeticException");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("\nHe atrapado InputMismatchException");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("\nHe atrapado IllegalArgumentException");
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("\nHe atrapado NullPointerException");
            System.out.println(e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("\nHe atrapado IllegalStateException");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\nHe llegado al final");
            System.out.println("Se acaba de ejecutar: \'finally\'");
        }
    }
}
