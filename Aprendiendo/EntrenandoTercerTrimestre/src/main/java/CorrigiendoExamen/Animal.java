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
        setNombre(nombre);
    }
    
    private void setNombre(String nombre) 
    throws NullPointerException, IllegalArgumentException { //Lanza arriba las excepciones, al método que llama
        
        //Comprueba si es nulo el nombre
        if (nombre == null) {
            //Crea y Lanza la excepción hacia arriba
            throw new NullPointerException("El nombre de un animal no puede ser nulo");
        
        //Comprueba si es una cadena vacía
        } else if (nombre.isEmpty()) {
            //Crea y lanza la excepción hacia arriba. IllegalArgument exception
            //se utiliza cuando indicamos que un argumento no es válido
            throw new IllegalArgumentException("El nombre del animal no puede estar vacío"); 
        } else {
            this.nombre=nombre;
        }
    }
    
    //Método toString para mostrar nombre
    @Override
    public String toString() {
        return nombre;
    }
}
