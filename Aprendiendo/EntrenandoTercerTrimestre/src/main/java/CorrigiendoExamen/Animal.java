/*
 * Clase Animal
 */
package CorrigiendoExamen;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Animal {
    private String nombre;
    
    //Constructor de la clase
    public Animal(String nombre) {
        this.nombre=nombre;
    }
    
    private void setNombre(String nombre) {
        //Comprueba si es nulo el nombre
        if (nombre == null) {
            //Crea y Lanza la excepción hacia arriba
            throw new NullPointerException("El nombre de un animal no puede ser nulo");
        }
    }
}
