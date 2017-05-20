package Calendarios_y_fechas;

/**
 * Practica con GregorianCalendary y SimpleDateFormat. Copia y pega un método main
 * las siguientes sentencias.
 * 
 * @author Raúl Caro Pastorino <Fryntiz www.fryntiz.es> -->
 * https://github.com/fryntiz
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import static java.util.Calendar.AUGUST;
import java.util.GregorianCalendar;

//En el ejercicio pone copiar dentro de main las sentencias pero no funciona
//Tampoco hay documento explicando como funciona
//Dejo este ejercicio tal como se supone que es por falta de datos
public class EJ19 {
    public static void main(String[] args) {
        Calendar c1 = GregorianCalendar.getInstance();
        System.out.println("Fecha actual:"+c1.getTime().toLocaleString());

        c1.set(2000,Calendar.AUGUST,31);
        System.out.println("Fecha 31 Agosto 2000:"+c1.getTime().toLocaleString());

        c1.set(Calendar.MONTH,13);
        System.out.println("Fecha 13 meses más:"+c1.getTime().toLocaleString());

        /*Añadir 13 meses*/
        c1.set(2000,AUGUST,31);
        c1.add(Calendar.MONTH,13);
        System.out.println("Fecha 13 meses más "+c1.getTime().toLocaleString());
             
        /*Uso de roll*/
        c1.roll(Calendar.HOUR,25);/*Añadir 25 horas*/
        System.out.println("Fecha 25 horas más: "+c1.getTime().toLocaleString());
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMMM/yyyyhh:mm:ss");
        
        System.out.println("Fecha Formateada:"+sdf.format(c1.getTime()));
    } 
}
