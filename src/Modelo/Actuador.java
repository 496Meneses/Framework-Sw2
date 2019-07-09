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
     * @param itemMedicion clase ItemMedicion
     */
    public Actuador(ItemMedicion itemMedicion) {
        this.itemMedicion = itemMedicion;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * Returna la clase ItemMedicion
     *
     * @return itemMedicion
     */
    public ItemMedicion getItemMedicion() {
        return itemMedicion;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setters">
    /**
     * Asigna la instancia ItemMedicion a Actuador
     * 
     * @param itemMedicion clase ItemMedicion
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
