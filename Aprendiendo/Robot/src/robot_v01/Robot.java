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
    private TipoOrientacion orientacion;
    private int distancia = 0;
    private Posicion posicion; //Crea objeto de tipo posicion(X,Y)
    
    public Robot(String new_alias, char new_generacion) {
        alias = new_alias;
        generacion = new_generacion;
        //orientacion = TipoOrientacion.aleatorio();
        posicion = new Posicion(0, 0);
    }
    
    public void avanzar(int distancia) {
        //Sumar distancia a la distancia ya recorrida
        //sumar distancia a la posición según TipoOrientación
    }
    
    public void saludar() {
        
    }
    
    private String getCodigo() {
        String codigo = "";
        //codigo=generacion+id
        return codigo;
    }
    
    @Override
    public String toString() {
        String cadena = "";
        return cadena;
    }
    
    public void girar(TipoOrientacion direccion) {
        orientacion = direccion;
    }
    
    public void girar(){
        switch (orientacion) {
            case NORTE:
                orientacion = TipoOrientacion.ESTE;
                break;
            case ESTE:
                orientacion = TipoOrientacion.SUR;
                break;
            case SUR:
                orientacion = TipoOrientacion.OESTE;
                break;
            case OESTE:
                orientacion = TipoOrientacion.NORTE;
                break;
        }
    }
}
