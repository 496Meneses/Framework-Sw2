import Modelo.FabricaConcreteItem1;
import Modelo.ConcreteItem;
import Modelo.Disparador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cuatro
 */
public class Testing {
    
    public Testing() {
    }
    
    FabricaConcreteItem1 fConcreteItem1 = new FabricaConcreteItem1();
    ConcreteItem concreteItem = new ConcreteItem();
    Disparador d = new Disparador();
    @Test
    public void testCreacionFabrica(){
  
        d.setFabricaItems(fConcreteItem1);
        
        Assert.assertEquals(fConcreteItem1,d.getFabricaItems());
        
    }
    @Test
    public void testCreacionItem(){

        fConcreteItem1.crearItemMedicion();
        assertEquals(concreteItem.getClass().getSimpleName(),fConcreteItem1.crearItemMedicion().getClass().getSimpleName());
    }
    /**
     * Metodo que prueba el proceso de medicion esperando un resultado ideal
     *
     * 
     */
    @Test
    public void testMedicion(){
        concreteItem.procesoMedicion();
        int enteroMedicion = 10; // Valor Ideal
        assertEquals(enteroMedicion,concreteItem.geTResultado());  //Resultado esperado luego de almacenar la medicion  
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
