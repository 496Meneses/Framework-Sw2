package Modelo;

import java.util.ArrayList;

/**
 *
 */
public class Disparador extends Sensor {

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    private FabricaItems fabricaItems;

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Default constructor
     */
    public Disparador() {
    }

    /**
     * Custom constructor
     *
     * @param fabricaItems instancia de FabricaItems
     * @param itemMedicion instancia de ItemMedicion
     * @param LecturaSensores instancia de ArrayList<LecturaSensor>
     */
    public Disparador(FabricaItems fabricaItems, ItemMedicion itemMedicion, ArrayList<LecturaSensor> LecturaSensores) {
        super(itemMedicion, LecturaSensores);
        this.fabricaItems = fabricaItems;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * Recupera una FabricaItems
     *
     * @return fabricaItems instancia de FabricaItems
     */
    public FabricaItems getFabricaItems() {
        return fabricaItems;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setters">
    /**
     * Asigna una FabricaItems
     *
     * @param fabricaItems instancia de FabricaItems
     */
    public void setFabricaItems(FabricaItems fabricaItems) {
        this.fabricaItems = fabricaItems;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Metodo sobreescrito lectura
     */
    @Override
    public void lectura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Metodo sobreescrito actualizar
     */
    @Override
    public void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // </editor-fold>
}
