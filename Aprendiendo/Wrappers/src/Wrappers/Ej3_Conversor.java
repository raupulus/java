package Wrappers;
/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class Ej3_Conversor {
    public static int valorEntrada;
    
    public Ej3_Conversor(int entrada) {
        valorEntrada = entrada;
    }
    
    public String getNumero(String x) {
        x = x.toUpperCase(); //Pasa la opción a mayúsculas
        String tmp = "";
        
        switch (x) {
            case "B":
                tmp = Integer.toBinaryString(valorEntrada); 
                break;
            case "H":
                tmp = Integer.toHexString(valorEntrada); 
                break;
            case "O":
                tmp = Integer.toOctalString(valorEntrada); 
                break;
        }
        
        return "\n\nEl resultado es " + tmp;
    }
}
