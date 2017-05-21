package Pruebas;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
import java.util.regex.*;

public final class Ejemplo1 {

    public static void checkForContent(String aText) {
        if (!Util.textHasContent(aText)) {
            throw new IllegalArgumentException("Text has no visible content");
        }
    }

    public static void checkForRange(int aNumber, int aLow, int aHigh) {
        if (!Util.isInRange(aNumber, aLow, aHigh)) {
            throw new IllegalArgumentException(aNumber + " not in range " + aLow + ".." + aHigh);
        }
    }

    public static void checkForPositive(int aNumber) {
        if (aNumber < 1) {
            throw new IllegalArgumentException(aNumber + " is less than 1");
        }
    }

    public static void checkForMatch(Pattern aPattern, String aText) {
        if (!Util.matches(aPattern, aText)) {
            throw new IllegalArgumentException(
              "Text " + Util.quote(aText) + " does not match '" + aPattern.pattern() + "'"
            );
        }
    }

    public static void checkForNull(Object aObject) {
        if (aObject == null) {
            throw new NullPointerException();
        }
    }

    private Ejemplo1() {
        //empty - prevent construction
    }
}
