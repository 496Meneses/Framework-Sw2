package Modelo;

import java.util.ArrayList;

/**
 *
 * @author danielmej
 */
public class Disparador extends Sensor{
    
    private FabricaItems fabricaItems;
    
    public Disparador() {
    }

    public Disparador(FabricaItems fabricaItems, ItemMedicion itemMedicion, ArrayList<LecturaSensor> LecturaSensores) {
        super(itemMedicion, LecturaSensores);
        this.fabricaItems = fabricaItems;
    }

    
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
