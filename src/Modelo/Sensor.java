package Modelo;

import java.util.*;

/**
 *
 */
public abstract class Sensor {

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    private ItemMedicion itemMedicion;
    private ArrayList<LecturaSensor> LecturaSensores;

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Default constructor
     */
    public Sensor() {
        this.LecturaSensores = new ArrayList<LecturaSensor>();
    }

    /**
     * Custom constructor
     *
     * @param itemMedicion instancia de ItemMedicion
     * @param LecturaSensores instancia de ArrayList<LecturaSensor>
     */
    public Sensor(ItemMedicion itemMedicion, ArrayList<LecturaSensor> LecturaSensores) {
        this.itemMedicion = itemMedicion;
        this.LecturaSensores = LecturaSensores;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * Retorna un ItemMedicion
     *
     * @return itemMedicion instancia de ItemMedicion
     */
    public ItemMedicion getItemMedicion() {
        return itemMedicion;
    }

    /**
     * Retorna un ArrayList<LecturaSensores>
     *
     * @return LecturaSensores instancia de ArrayList<LecturaSensor>
     */
    public ArrayList<LecturaSensor> getLecturaSensores() {
        return LecturaSensores;
    }

    /**
     * Asigna un ItemMedicion
     *
     * @param itemMedicion instancia de ItemMedicion
     */
    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setItemMedicion(ItemMedicion itemMedicion) {
        this.itemMedicion = itemMedicion;
    }

    /**
     * Asigna un ArrayList<LecturaSensor>
     *
     * @param LecturaSensores instancia de ArrayList<LecturaSensor>
     */
    public void setLecturaSensores(ArrayList<LecturaSensor> LecturaSensores) {
        this.LecturaSensores = LecturaSensores;
    }

    /**
     * Metodo a implementar setLecturaSensor
     */
    public void setLecturaSensor() {
        // TODO implement here
    }

    // <editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Metodo abstracto lectura
     */
    public abstract void lectura();

    /**
     * Metodo abstracto lectura
     */
    public abstract void actualizar();

}
