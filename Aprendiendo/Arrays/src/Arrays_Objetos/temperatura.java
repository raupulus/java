package Arrays_Objetos;
/**
 * Esta clase forma parte del ejercicio 21
 * @author fryntiz
 */
public class temperatura {
    private String mes;
    private Double temp;
    private double tmp_media_grado, tmp_media_fahrenheit;
    
    public temperatura(String mesInput, Double tempInput) { //Constructor de la clase
        mes = mesInput;
        temp = tempInput;
    }
    
    public void temperatura() {
        System.out.println("\nLa temperatura en grados Centígrados es: " + temp + "ºC");
        System.out.println("La temperatura en grados Fahrenheit es: " + (temp*1.8+32) + "ºF\n");
    }

    public Double devolverTemperatura() {
        return temp;
    }
    
}
