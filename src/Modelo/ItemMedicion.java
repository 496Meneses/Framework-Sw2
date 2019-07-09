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
        this.hacerLeerSensor();
        this.hacerAlmacenarResultado();
        this.hacerCompararValores();
        this.hacerEjecutarAcciones();
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