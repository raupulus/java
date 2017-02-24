package Arrays_Objetos;
/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> --> https://github.com/fryntiz
 */
public class Comercial {
    private static String nombre;
    private static int[] ventas = new int[6];
    private static String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
    
    public Comercial(String nombreInput, int longitudInput) {
        //Recibe nombre del comercial
        nombre = nombreInput;
        
        //Recibe longitud del array
        ventas =  new int[longitudInput];
    }
    
    public void ventas(int diaInput, int ventaInput) { //Método llamado para añadir ventas al array
        ventas[diaInput] = ventaInput;
    }
    
    public void mostrar() {
        //Mostrar nombre del vendedor
        //Mostrar la comisión para cada día
    }
    
    public void comisiones() {
        //Comisiones días pares 10% de las ventas (0,2,4)
        //Comisiones días impares 15% de las ventas
        
        //Hacer sumatorio de ventas y sacar módulo entre 2, si sale sin resto es par
    }
    
    public void mejorDia() {
        //De 0(Lunes) a 5(Sábado)
        //Este método devuelve un string con el mejor día que tuvo
    }
}
