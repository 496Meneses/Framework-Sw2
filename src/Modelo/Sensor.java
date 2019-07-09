package Modelo;
import java.util.*;

/**
 * 
 */
public abstract class Sensor {
    
    private ItemMedicion itemMedicion;
    private ArrayList<LecturaSensor> LecturaSensores;

    /**
     * Default constructor
     */
    public Sensor() {
        this.LecturaSensores = new ArrayList<LecturaSensor>();
    }

    public Sensor(ItemMedicion itemMedicion, ArrayList<LecturaSensor> LecturaSensores) {
        this.itemMedicion = itemMedicion;
        this.LecturaSensores = LecturaSensores;
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

    public ArrayList<LecturaSensor> getLecturaSensores() {
        return LecturaSensores;
    }

    public void setLecturaSensores(ArrayList<LecturaSensor> LecturaSensores) {
        this.LecturaSensores = LecturaSensores;
    }

    
}