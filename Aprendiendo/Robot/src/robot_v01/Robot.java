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
    private char generacion; //Valores posibles "A","B","M"
    private TipoOrientacion orientacion;
    private int distancia = 0;
    private Posicion posicion; //Crea objeto de tipo Posicion(X,Y)
    
    public Robot(String new_alias, char new_generacion) {
        setAlias(new_alias);
        setGeneracion(new_generacion);
        //orientacion = TipoOrientacion.aleatorio();
        posicion = new Posicion(0, 0); //Crea el objeto Posicion(X,Y)
        ++contador;
        id = contador;
    }
    
    public void avanzar(int AñadeDistancia) {
        //Sumar distancia a la distancia ya recorrida
        distancia += AñadeDistancia;
        
        //Sumar distancia a la posición según TipoOrientación
        //Pedir 2 valores(X,Y) controlar para sumar o restar
    }
    
    public void saludar() {/**************TODO************/
        
    }
    
    private String getCodigo() {
        String codigo = "";
        codigo = String.valueOf(generacion) + String.valueOf(id);
        return codigo;
    }

    @Override
    public String toString() {/**************TODO************/
        //Terminar método con cadena visible al llamar a toString
        String cadena = "";
        return cadena;
    }

    //Girar hacia la el punto cardinal establecido
    public void girar(TipoOrientacion direccion) {
        orientacion = direccion;
    }
    
    //Girar si no tiene parámetros lo hará en sentido agujas reloj
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

/******************************
***  ACCESORES Y MUTADORES  ***
*******************************/
    
    private void setGeneracion(char setG) {
        //Comprueba que se ha introducido un valor válido
        if ((generacion == 'A') || (generacion == 'B') || (generacion == 'M')) {
            generacion = setG;
        } else {
            System.out.println("Error, no es válido " + setG + " Solo puede ser A,B,M");
        }
    }
    
    private void setAlias(String setAli) {
        //Comprueba que la cadena no está vacía ni es nula
        if ((setAli.equals("")) || (setAli == null)) {
            System.out.println("ERROR!!! El Alias no puede ser null ni estar vacía");
        } else {
            alias = setAli;
        }
    }
}
