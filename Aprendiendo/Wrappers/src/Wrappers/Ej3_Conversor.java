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
        int binario,hexadecimal,octal;
        
        switch (x) {
            case "B":
                System.out.println("Salida = " + valorEntrada);
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
