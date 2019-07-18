/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import appmedicioncerveza.aplication.FabricaCalidadCerveza;
import appmedicioncerveza.aplication.MedicionPesoCerveza;
import appmedicioncerveza.framework.Disparador;
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
public class DoTesting {
    
    public DoTesting() {
    }

    FabricaCalidadCerveza fConcreteItem1 = new FabricaCalidadCerveza();
    MedicionPesoCerveza concreteItem = new MedicionPesoCerveza();
    Disparador d = new Disparador();
    @Test
    public void testCreacionFabrica(){
  
        d.setFabricaItems(fConcreteItem1);
        assertEquals(fConcreteItem1,d.getFabricaItems());
        
    }
    @Test
    public void testCreacionItem(){

        fConcreteItem1.crearItemMedicion();
        assertEquals(concreteItem.getClass().getSimpleName(),fConcreteItem1.crearItemMedicion().getClass().getSimpleName());
    }
}
