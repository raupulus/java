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
        x = String.toUpperCase(x);
        int binario,hexadecimal,octal;
        
        switch (x) {
            case "B":
            
            break;
            case "H":
            
            break;
            case "O":
            
            break;
        }
        
        System.out.println("Soy el número devuelto!!!");
        
        return "El resultado es " + x;
    }
}
