package IntentandoExamen;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es>
 * https://github.com/fryntiz
 */
public class Animal {
    //Inicializado atributo nombre del animal
    private String nombre;
    
    //Constructor de la clase
    public Animal(String new_name) {
        nombre = new_name;
    }
    
    //Método para consultar el nombre de cada animal
    public String getNombre() {
        return nombre;
    }
}
