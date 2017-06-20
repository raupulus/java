package ExJon;

import java.awt.Dimension;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */

public class Principal {

    public static void main(String[] args) {

        List<Animal> listaAni = new LinkedList<Animal>();

        Animal gato = new Animal("GATO");
        Animal perro = new Animal("PERRO");
        Animal raton = new Animal("RATON");
        Animal leon = new Animal("LEON");
        Animal conejo = new Animal("CONEJO");
        Animal ornitorrinco = new Animal("ORNITORRINCO");

        listaAni.add(gato);
        listaAni.add(perro);
        listaAni.add(raton);
        listaAni.add(leon);
        listaAni.add(conejo);
        listaAni.add(ornitorrinco);

        List<Boton> listBot = new LinkedList<Boton>();

        Iterator<Animal> it = listaAni.iterator();

        while (it.hasNext()) {

            Animal animal = (Animal) it.next();

            String nombreAni = animal.getNombre();

            Boton boton = new Boton(nombreAni);
            boton.setPreferredSize(new Dimension(200, 100));
            listBot.add(boton);

        }

        Collections.sort(listBot);

        final GUI gui = new GUI(listBot);

        try {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    gui.generarYMostrarVentana();
                }
            });

        } catch (IllegalStateException e) {
            System.out.println("Cazada");
        }

    }

}
