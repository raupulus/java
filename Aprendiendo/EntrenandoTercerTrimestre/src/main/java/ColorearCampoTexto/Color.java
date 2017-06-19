package ColorearCampoTexto;

/**
 * Esta clase permite crear instancias de cada animal diferenciándolos por el
 * atributo nombre
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 * https://github.com/fryntiz
 */
public class Color {
    //Inicializado atributo nombre del animal
    private String nombre;
    
    //Constructor de la clase
    public Color(String new_name) {
        nombre = new_name;
    }
    
    //Método para consultar el nombre de cada animal
    public String getNombre() {
        return nombre;
    }
}
