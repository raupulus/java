package robot_v01;

/**
 * Clase Posición
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 */
public class Posicion {

    private int X;
    private int Y;

    //Constructor sin parámetros, inicializa a 0
    public Posicion() {
        X = 0;
        Y = 0;
    }
    
    //Constructor con parámetros para inicializar con posiciones
    public Posicion(int PosX, int PosY) {
        X = PosX;
        Y = PosY;
    }
    
/******************************
***  ACCESORES Y MUTADORES  ***
*******************************/

    public void setX(int PosX) {
        X = PosX;
    }
    
    public int getX() {
        return X;
    }
    
    public void setY(int PosY) {
        Y = PosY;
    }
    
    public int getY() {
        return Y;
    }
}
