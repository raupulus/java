package Articulos;

/**
 * Clase artículo que contiene la parte que será común para el resto de
 * artículos los cuales heredarán de esta clase
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */

public class Articulo {

    private String titulo;
    private int duracion;
    private boolean loTengo;
    private String comentario;

    //Constructor de la clase, se invoca con una cadena como título y un int duración
    public Articulo(String titulo, int duracion) {
        this.titulo = titulo; //Asigna el título pasado al atributo de clase
        this.duracion = duracion; //Asigna la duración pasada al atributo de clase
        loTengo = false; //Por defecto "false"
        comentario = ""; //Por defecto sin comentario
    }
    
    //Método print para mostrar atributos privados
    public void print() {
        System.out.println("Título --> " + titulo);
        System.out.println("Duración --> " + duracion);
        System.out.println("Lo tengo --> " + loTengo);
        System.out.println("Comentario --> " + comentario);
    }
    
    //Devolver variable privada "titulo"
    public String getTitulo() {
        return titulo;
    }
    
     //Devolver variable privada "duracion"
    public int getDuracion() {
        return duracion;
    }
    
     //Devolver variable privada "loTengo"
    public Boolean getLoTengo() {
        return loTengo;
    }
    
     //Devolver variable privada "comentario"
    public String getComentario() {
        return comentario;
    }
}
