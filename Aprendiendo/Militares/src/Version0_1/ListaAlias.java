/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Version0_1;

/**
 *
 * @author Clase
 */
public class ListaAlias {
    public static String[] alias;
    
    private static String[] nombres ={ "ACOSTA JURADO, MIGUEL ANGEL", 
		    "ALDON GARCIA, ANA MARIA", 
		    "AMUEDO DOMINGUEZ, IVAN", 
		    "ANGELIT ROMERO, JOSE MANUEL", 
		    "JACOBSON, IVAR", 
		    "CARABALLO RUIZ, MIGUEL", 
		    "CLIMENT MARQUEZ, DANIEL",
		    "RODRIGUEZ CUEVAS, ANTONIO", 
		    "GONZALEZ RODRIGUEZ, ANTONIO", 
		    "GONZALEZ GONZALEZ, AURORA", 
		    "BOOCH, GRADY", 
		    "RUIZ AGUILAR, ROXANA WENDOLINE",
		    "GONZALEZ SOUTO, MIGUEL ANGEL", 
		    "HARANA BAZAN, MARIA CARIDAD", 
		    "HERRERA CAMACHO, FRANCISCO JOSE", 
		    "LORENZO IBAÑEZ, DANIEL", 
		    "LORENZO MORALES, AGUSTIN", 
		    "RUMBAUGH, JAMES", 
		    "MACHUCA BARCENA, MANUEL", 
		    "MONGE JIMENEZ, ALEJANDRA", 
		    "MONTILLA ROLDAN, LEO", 
		    "NARVAEZ SALAZAR, JOSE LUIS", 
		    "PEREZ RODRIGUEZ, BLADI", 
		    "ROCA GONZALEZ, MANUEL", 
		    "ROMERO TIERNES, JOSE LUIS", 
		    "SERRANO PEREZ, MIGUEL ANGEL", 
		    "RUIZ RODRIGUEZ, MATEO", 
		    "RUIZ DE LA ROSA, SAMUEL", 
		    "VILASECO JURADO JORGE", 
		    "SUMARIVA, OLGA"      }; 
    
    static {
        alias = new String[30];
        
        for (int i = 0; i < alias.length; i++) {
            alias[i] = nombres[i];
        }
    }
}
