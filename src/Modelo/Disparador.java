package Modelo;

import java.util.ArrayList;

/**
 *
 * @author danielmej
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
     * @param fabricaItems
     * @param itemMedicion
     * @param 
     */
    public Disparador(FabricaItems fabricaItems, ItemMedicion itemMedicion, ArrayList<LecturaSensor> LecturaSensores) {
        super(itemMedicion, LecturaSensores);
        this.fabricaItems = fabricaItems;
    }
    // </editor-fold>

    public FabricaItems getFabricaItems() {
        return fabricaItems;
    }

    public void setFabricaItems(FabricaItems fabricaItems) {
        this.fabricaItems = fabricaItems;
    }

    @Override
    public void lectura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
