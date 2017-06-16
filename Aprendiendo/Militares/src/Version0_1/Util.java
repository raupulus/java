package Version0_1;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase principal
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class Util {

    // Constantes que definen los códigos de escape para poner letras en color.
    public final static String NEGRO = "\u001B[30m";    // Color negro para cadenas.
    public final static String ROJO = "\u001B[31m";    // Color rojo para cadenas.
    public final static String VERDE = "\u001B[32m";    // Color azul para cadenas.
    public final static String AMARILLO = "\u001B[33m";    // Color verde para cadenas.    
    public final static String AZUL = "\u001B[34m";    // Color verde para cadenas.
    public final static String PURPURA = "\u001B[35m";    // Color verde para cadenas.
    public final static String CYAN = "\u001B[36m";    // Color verde para cadenas.
    public final static String BLANCO = "\u001B[37m";    // Color blanco para cadenas.

    //Método para proporcionar una cadena aleatoria de x caracteres.
    public static String generarCadena(String patron, int longitud, boolean repetir) {
        String cadena = "";
        String cadaux = "";
        Random aleat = new Random();
        int caracter;

        do {
            caracter = aleat.nextInt(patron.length());
            cadaux += patron.charAt(caracter);
            if (repetir) {
                cadena += patron.charAt(caracter);
            } else if (!cadena.contains(cadaux)) {
                cadena += patron.charAt(caracter);
            }
            cadaux = "";
        } while (cadena.length() < longitud);

        return cadena;
    }

    public static String mezclarCadena(String cadena) {

        Random auxRdn = new Random();
        String aux = "";
        StringBuilder bff = new StringBuilder(cadena);

        for (int x = 0; x < cadena.length(); x++) {
            int y = auxRdn.nextInt(bff.length());
            aux += bff.charAt(y);
            bff = bff.deleteCharAt(y);
        }
        cadena = aux;
        return cadena;
    }

    //Simplificación del método print.
    public static void print(String cadenaAImprimir) {
        System.out.print(cadenaAImprimir);
    }

    //Simplificación del método println.
    public static void println(String cadenaAImprimir) { // simplificación del println...
        System.out.println(cadenaAImprimir);
    }

    //Método que solicita la entrada de una cadena al usuario.
    public static boolean leeSiNo(String mensaje) {

        Scanner teclado = new Scanner(System.in);
        String cadena = "";
        boolean result = false;
        println(mensaje);

        do {
            try {
                cadena = teclado.nextLine().substring(0, 1);
                cadena = cadena.toUpperCase();
                result = cadena.charAt(0) == 'S';
            } catch (Exception e) {
                Error.muestraError("Error: Ha fallado la entrada de datos.");
            }
            if (cadena.equals("")) {
                println("Ha introducido una cadena vacía. Por favor, inténtelo de nuevo: ");
            }
            if (cadena.charAt(0) != 'S' || cadena.charAt(0) != 'N') {
                println("Por favor introduzca " + AZUL + "S" + NEGRO + " o " + AZUL + "N" + NEGRO);
            }

        } while (cadena.equals(""));
        return result;

    }

    //Método que solicita la entrada de una cadena al usuario.
    public static String leeCadena(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String cadena = "";
        println(mensaje);

        do {
            try {
                cadena = teclado.nextLine();
            } catch (Exception e) {
                Error.muestraError("Error: Ha fallado la entrada de datos.");
            }
            if (cadena.equals("")) {
                println("Ha introducido una cadena vacía. Por favor, inténtelo de nuevo: ");
            }

        } while (cadena.equals(""));
        return cadena;

    }

    //Método que solicita la lectura de una combinación de 4 letras tomadas de 6 válidas.
    public static String leeCombUsuario(String mensaje, String patron) {
        String cadena = "";
        int validos;
        boolean valido = false;
        println(mensaje);

        do {

            validos = 0;
            try {
                Scanner teclado = new Scanner(System.in);
                cadena = teclado.nextLine().substring(0, 4); // Desecha el resto de caracteres a partir de cuatro.
                cadena = cadena.toUpperCase();
            } catch (Exception e) {
                Error.muestraError("Error: Ha fallado la entrada de datos.");
            }
            for (int x = 0; x <= cadena.length() - 1; x++) {
                valido = (patron.contains(cadena.substring(x, x + 1)));
                if (valido) {
                    validos++;
                }
            }
            if (validos < 4) {
                Error.muestraError("Hay caracteres no válidos en su entrada.");
                println("Introduzca su combinación de nuevo.\nLe recordamos que los únicos caracteres permitidos son: " + patron);
            }
        } while (validos < 4);
        return cadena;

    }

    //Comprobar si un carácter está dentro de una cadena.
    public static boolean comprobarCaracter(char caracter, String cadena) {
        return (cadena.contains(String.valueOf(caracter)));
    }

    //Lee un entero.
    public static int leeEntero(String mensaje) {
        boolean leido = false;
        int numero = -1;

        println(mensaje);

        do {
            try {
                Scanner teclado = new Scanner(System.in);
                numero = teclado.nextInt();
            } catch (Exception e) {
                Error.muestraError("Error: No se ha introducido un número entero.");
            }
            leido = true;
        } while (!leido);
        return numero;
    }

    //Lee un entero que debe estar comprendido entre dos números.
    public static int leeEntero(String mensaje, int minimo, int maximo) {
        int numero = -1;
        boolean leido = false;

        println(mensaje);

        do {
            try {
                Scanner teclado = new Scanner(System.in);
                numero = teclado.nextInt();
                leido = true;
            } catch (Exception e) {
                Error.muestraError("Error: Ha fallado la entrada de datos.");
            }

            if (numero != -1 && (numero < 0 || numero > maximo)) {
                Error.muestraError("Debe ser un número entero comprendido entre " + minimo + " y " + maximo + ".");
                Util.println("Introdúzcalo de nuevo: ");
                leido = false;
            }

        } while (numero < minimo || numero > maximo || !leido);
        return numero;
    }

    //Método para producir un retardo en la ejecución de la siguiente instrucción.
    public static void esperar(int retardo) {
        try {
            Thread.sleep(retardo);
        } catch (InterruptedException e) {
        }
    }
}
