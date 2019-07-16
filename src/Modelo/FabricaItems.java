package Modelo;

import java.util.*;

/**
 *
 */
public abstract class FabricaItems {

    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Default constructor
     */
    public FabricaItems() {
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Metodo abstracto crearItemMedicion
     *
     * @return ItemMedicion instancia de ItemMedicion
     */
    public abstract ItemMedicion crearItemMedicion();

    // </editor-fold>
}
