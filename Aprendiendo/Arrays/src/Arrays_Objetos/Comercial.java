package Arrays_Objetos;
/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> --> https://github.com/fryntiz
 */
public class Comercial {
    private static String nombre;
    private static int[] ventas;
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
        System.out.println("Nombre del vendedor " + nombre);
        
        //Mostrar la comisión para cada día
        System.out.println("Comisión  para cada día:");
        for(int i=0;i<dias.length;i++){
            comisiones(i);
        }
    }
    
    public void comisiones(int dia) {
        //Comisiones días pares 10% de las ventas (0,2,4)
        if(dia%2 == 0){
            System.out.println("El " + dias[dia] + " fue par y la comisión del 10% fue: " + ((ventas[dia]*10)/100));
        }
        //Comisiones días impares 15% de las ventas
        else if(dia%2 != 0){
            System.out.println("El " + dias[dia] + " fue impar y la comisión del 15% fue: " + ((ventas[dia]*15)/100));
        }
    }
    
    public String mejorDia() { //Este método devuelve un string con el mejor día que tuvo
        int tmp = 0;
        int tmp1 = 0;
        for(int i=0;i<dias.length;i++) {
            if(ventas[i]>=tmp) {
                tmp = ventas[i];
                tmp1 = i;
            }
        }
        System.out.println("El vendedor " + nombre);
        return dias[tmp1];
    }
    
    public static void ventasTotal() { //Método que muestra el total que ha vendido
        
    }
}
