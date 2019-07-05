package Modelo;
import java.util.*;

/**
 * 
 */
public abstract class Sensor {
    
    private ItemMedicion itemMedicion;

    /**
     * Default constructor
     */
    public Sensor() {
    }

    public Sensor(ItemMedicion itemMedicion) {
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
    public abstract void lectura();

    /**
     * 
     */
    public abstract void actualizar();

    /**
     * 
     */
    public void setLecturaSensor() {
        // TODO implement here
    }

}