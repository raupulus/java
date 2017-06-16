/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Version0_1;

/**
 *
 * @author maedhros
 */
public class ListaRango {
    
    public  static Rango[] rangos;
    private  static String[] codigos = {"CA-1", "CA-2","CA-3","OR-1","OR-2","OR-3","OR-4","OR-5","OR-6","OR-7","OR-8","OR-9",
                                    "OF-1","OF-2","OF-3","OF-4","OF-5","OF-6","OF-7","OF-8","OF-9","OF-10"};
    private   static String[] nombres = {"INSUMISO","SOLDADO CONDENADO","SOLDADO ARRESTADO","SOLDADO","SOLDADO DE PRIMERA",
                                    "CABO","CABO PRIMERO","SARGENTO","SARGENTO PRIMERO","BRIGADA","SUBTENIENTE","TENIENTE",
                                    "CAPITAN","COMANDANTE","TENIENTE CORONEL","CORONEL","GENERAL DE BRIGADA","MAYOR GENERAL",
                                    "TENIENTE GENERAL","GENERAL","CAPITAN GENERAL"};
    private  static String[] descripciones = {"CADENA PERPETUA","TRABAJOS FORZADOS","AISLAMIENTO TEMPORAL","","","","","","","","",
                                        "","","","","","","","","","RANGO HONORIFICO"};
    private static Grupo grupo;
    
    static {
        
        rangos = new Rango[21];

        for (int i = 0; i<rangos.length; i++){
            switch (i){
                case 0: case 1: case 2:
                   grupo = Grupo.CALABOZO;
                    break;
                case 3: case 4: case 5: case 6:
                   grupo = Grupo.TROPA;
                    break;
                case 7: case 8: case 9: case 10:
                   grupo = Grupo.SUBOFICIALES;
                    break;
                case 11: case 12:
                   grupo = Grupo.OF_SUBALTERNOS;
                    break;
                case 13: case 14: case 15:
                   grupo = Grupo.OF_SUPERIORES;
                    break;
                default:
                    grupo = Grupo.GENERALES;
                    break; 
            }
            
            rangos[i] = new Rango(i, codigos[i], nombres[i], descripciones[i], grupo);
            
        }
        
        
    }
}
