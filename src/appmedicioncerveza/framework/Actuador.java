package appmedicioncerveza.framework;

import java.util.*;

/**
 *
 */
public abstract class Actuador {
    
    // atributos derivados
    private ItemMedicion atrItemMedicion;
    
    // metodo constructor por defecto
    public Actuador() 
    {
    }
    
    // metodo constructor parametrizado
    public Actuador(ItemMedicion parObjItemMedicion)
    {
        this.atrItemMedicion = parObjItemMedicion;
    }

    // metodos mutadores setter
    public void setItemMedicion(ItemMedicion itemMedicion) {
        this.atrItemMedicion = itemMedicion;
    }
    
    // metodos mutadores getter
    public ItemMedicion getItemMedicion()
    {
        return this.atrItemMedicion;
    }

    // metodo abstracto que sera implementado deacuerdo a las necesidades de cada clase derivada
    public abstract void actuar();
}
