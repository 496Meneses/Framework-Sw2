package Modelo;
import java.util.*;

/**
 * 
 */
public abstract class ItemMedicion {
    
    

    /**
     * Default constructor
     */
    public ItemMedicion() {
    }




    /**
     * 
     */
    public void procesoMedicion() {
        // TODO implement here
    }

    /**
     * 
     */
    protected abstract void hacerLeerSensor();

    /**
     * 
     */
    protected abstract void hacerAlmacenarResultado();

    /**
     * 
     */
    protected abstract void hacerCompararValores();

    /**
     * 
     */
    protected abstract void hacerEjecutarAcciones();

    /**
     * 
     */
    public void setSensor() {
        // TODO implement here
    }

    /**
     * 
     */
    public void setActuador() {
        // TODO implement here
    }

}