package robot_v01;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Robot {
    private static int contador = 0;
    private int id;
    private String alias;
    private char generacion; //Valores posibles "A","B","C"
    private TipoOrientacion = TipoOrientacion.aleatorio();
    private int distancia = 0;
    private int posicionX = 0;
    private int posicionY = 0;
    
    public Robot(String alias, char generacion) {
        
    }
    
    public void avanzar(int distancia) {
        //Sumar distancia a la distancia ya recorrida
        //sumar distancia a la posición según TipoOrientación
    }
    
    public void saludar() {
        
    }
    
    private String getCodigo() {
        String codigo="";
        //codigo=generacion+id
        return codigo;
    }
}
