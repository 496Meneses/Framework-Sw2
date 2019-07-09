package Modelo;
import java.util.*;

/**
 * 
 */
public abstract class ItemMedicion {
    
    private Sensor sensor;
    private Actuador actuador;

    /**
     * Default constructor
     */
    public ItemMedicion() {
    }

    public ItemMedicion(Sensor sensor, Actuador actuador) {
        this.sensor = sensor;
        this.actuador = actuador;
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

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public void setActuador(Actuador actuador) {
        this.actuador = actuador;
    }

    /**
     * 
     */
    

}