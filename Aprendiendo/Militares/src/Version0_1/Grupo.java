package Version0_1;

import java.util.Random;

/**
 * 
 * @author maedhros
 */


public enum Grupo { CALABOZO("Calabozo"), TROPA("Tropa"), SUBOFICIALES("Suboficiales"), OF_SUBALTERNOS("Oficiales Subalternos"), OF_SUPERIORES("Oficiales Superiores"), GENERALES("Generales"); 
    
    private String nombre;
    
    private Grupo(String nombre){
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return nombre;
    }
    
    public Grupo devuelveAleat(){
        Random x = new Random();
        
        return (Grupo.values()[x.nextInt(Grupo.values().length)]);
    }


    
}
