package ExcepcionesEnCadena;

import java.util.InputMismatchException;

public class EjemploExcepcionesEncadenadas {

    public static void main(String[] args) {

        int x = 0;

        try {

            while (++x <= 3) {
                try {
                    System.out.println("TRY " + x);
                    lanzar("BOLA1");
                    System.out.println("AQUI NO LLEGAMOS... :)");
                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                    throw new IllegalArgumentException("BOLA2");
                } finally {
                    System.out.println("FINALLY");
                }
            }

        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Cazada: " + e.getMessage());
        }
    }

    private static void lanzar(String s) {
        throw new InputMismatchException(s);
    }

}
