package appmedicioncerveza.framework;

import java.util.ArrayList;

/**
 *
 * @author danielmej
 */
public class Disparador extends Sensor {

    // Atributos derivados
    private FabricaItems atrFabricaItems;
    
    // Metodo constructor por defecto
    public Disparador() 
    {
    }

    // Metodo constructor parametrizado
    public Disparador(LecturaSensor parObjLecturaSensor,FabricaItems parObjFabricaItems) 
    {
        super(parObjLecturaSensor);
        this.atrFabricaItems = parObjFabricaItems;
    }
    
    //Metodos mutadores getter
    public FabricaItems getFabricaItems() {
        return this.atrFabricaItems;
    }

    public void setFabricaItems(FabricaItems parObjFabricaItems) {
        this.atrFabricaItems = parObjFabricaItems;
    }

    @Override
    public void actualizar() 
    {
        this.atrFabricaItems.crearItemMedicion().procesoMedicion();
    }
    
     public double obtenerMedida()
     {
         return 0.0;
     }

}
