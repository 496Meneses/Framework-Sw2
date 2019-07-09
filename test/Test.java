import Modelo.ConcreteItem;
import Modelo.Disparador;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test {
    
    
    FabricaConcreteItem1 fConcreteItem1 = new FabricaConcreteItem1();
    ConcreteItem concreteItem = new ConcreteItem();
    Disparador d = new Disparador();
    
    public Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    public void testCreacionFabrica(){
  
        d.setFabricaItems(fConcreteItem1);
        
        Assert.assertEquals(fConcreteItem1,d.getFabricaItems());
        
    }
    
    public void testCreacionItem()
    {

        fConcreteItem1.crearItemMedicion();
        Assert.assertEquals(concreteItem.getClass().getSimpleName(),fConcreteItem1.crearItemMedicion().getClass().getSimpleName());
        
    }
    
    public void testMedicion()
    {
        
        fConcreteItem1.procesoMedicion();
        Assert.assertEquals(enteroMedion,fConcreteItem1.resultado());
       
        
    }
    
    
}
