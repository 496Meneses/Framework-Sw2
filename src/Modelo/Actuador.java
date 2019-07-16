package Modelo;

import java.util.*;

/**
 *
 */
public abstract class Actuador {

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    private ItemMedicion itemMedicion;

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Default constructor
     */
    public Actuador() {
    }

    /**
     * Custom constructor
     *
     * @param itemMedicion instancia de ItemMedicion
     */
    public Actuador(ItemMedicion itemMedicion) {
        this.itemMedicion = itemMedicion;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * Returna un ItemMedicion
     *
     * @return itemMedicion instancia de ItemMedicion
     */
    public ItemMedicion getItemMedicion() {
        return itemMedicion;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setters">
    /**
     * Asigna un ItemMedicion
     *
     * @param itemMedicion instancia de ItemMedicion
     */
    public void setItemMedicion(ItemMedicion itemMedicion) {
        this.itemMedicion = itemMedicion;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Metodo abstracto actuar
     */
    public abstract void actuar();

    // </editor-fold>
}
