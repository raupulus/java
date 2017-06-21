package examen_recuperacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */
public class Diccionario {
    //Generar números aleatorios con random
    private static Random rd = new Random();

    //List para contener objetos de la clase "Palabra"
    private List<Palabra> palabras;

    //Constructor
    public Diccionario() {
        //Crear ArrayList de objetos tipo "Palabra"
        palabras = new ArrayList<Palabra>();
        
        //Crea las palabras y las añade al diccionario
        crearDiccionario();
    }
    
    //Método para crear palabras y definiciones
    private void crearDiccionario() {
        //Creo todas las palabras
        //  NOMBRE      DESCRIPCION       EJEMPLO
        palabras.add(new Palabra ("ANATEMA", "Excomunion o Exclusion...", "Entonces la iglesia..."));
        palabras.add(new Palabra ("ANACRONISMO", "Error que resulta...", "Es un anacronismo..."));
        palabras.add(new Palabra ("OXIMORON", "Figura retórica del...", "La soledad sonora de.."));
        palabras.add(new Palabra ("HIPERBATON", "Figura retórica de construcción...", "Los textos de..."));
        palabras.add(new Palabra ("EUFEMISMO", "Palabra o expresión...", "Trasero es un..."));
        palabras.add(new Palabra ("METAFORA", "Figura retórica de pensamiento...", "La primavera..."));
        palabras.add(new Palabra ("HOMOFONO", "Que se pronuncia...", "Hola, saludo a..."));
        palabras.add(new Palabra ("HOMONIMA", "Coincidencia en la escritura...", "Hay una relación..."));
        palabras.add(new Palabra ("POLISEMIA", "Fenómeno del...", "En las palabras..."));
    }
    
    //Método para ordenar el ArrayList
    public void ordenar() {
        Collections.sort(palabras);
    }
    
    //Método para buscar una palabra
    public boolean buscar(String toSearch) {
        boolean existo = false;
        //Recorrer todo el arrayList comparando
        for (int i = 0; i < palabras.size(); i++) {
            if (toSearch.equals(palabras.get(i).getTexto())) {
                existo = true;
                break;
            }
        }
        
        return existo;
    }
    
    //Método que devuelve un objeto de tipo "Palabra" de forma aleatoria
    public Palabra aleatoria() {
        int X;
        //Genero un número aleatorio según la cantidad del ArrayList-1
        X = rd.nextInt(palabras.size() - 1); //numero máximo 1000
        
        return palabras.get(X);
    }
}
