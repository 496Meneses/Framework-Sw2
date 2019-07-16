package Modelo;

/**
 *
 */
public abstract class ItemMedicion {

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    private Sensor sensor;
    private Actuador actuador;

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Default constructor
     */
    public ItemMedicion() {
    }

    /**
     * Custom constructor
     *
     * @param sensor instancia de Sensor
     * @param actuador instancia de Actuador
     */
    public ItemMedicion(Sensor sensor, Actuador actuador) {
        this.sensor = sensor;
        this.actuador = actuador;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Metodo procesoMedicion
     *
     * Ejecuta: hacerLeerSensor hacerAlmacenarResultado hacerCompararValores
     * hacerEjecutarAcciones
     *
     */
    public void procesoMedicion() {
        this.hacerLeerSensor();
        this.hacerAlmacenarResultado();
        this.hacerCompararValores();
        this.hacerEjecutarAcciones();
    }

    /**
     * Metodo abstracto hacerLeerSensor
     */
    protected abstract void hacerLeerSensor();

    /**
     * Metodo abstracto hacerAlmacenarResultado
     */
    protected abstract void hacerAlmacenarResultado();

    /**
     * Metodo abstracto hacerCompararValores
     */
    protected abstract void hacerCompararValores();

    /**
     * Metodo abstracto hacerEjecutarAcciones
     */
    protected abstract void hacerEjecutarAcciones();

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setters">
    /**
     * Asigna un Sensor
     *
     * @param sensor instancia de Sensor
     */
    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    /**
     * Asigna un Actuador
     *
     * @param actuador instancia de Actuador
     */
    public void setActuador(Actuador actuador) {
        this.actuador = actuador;
    }

    // </editor-fold>
}
