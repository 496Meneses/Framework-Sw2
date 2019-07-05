package Modelo;
import java.util.*;

/**
 * 
 */
public abstract class Actuador {
    
    private ItemMedicion itemMedicion;
    /**
     * Default constructor
     */
    public Actuador() {
    }

    public Actuador(ItemMedicion itemMedicion) {
        this.itemMedicion = itemMedicion;
    }

    public ItemMedicion getItemMedicion() {
        return itemMedicion;
    }

    public void setItemMedicion(ItemMedicion itemMedicion) {
        this.itemMedicion = itemMedicion;
    }
    
       
    /**
     * 
     */
    public abstract void actuar();

}