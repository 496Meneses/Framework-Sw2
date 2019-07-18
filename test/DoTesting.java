/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import appmedicioncerveza.aplication.FabricaCalidadCerveza;
import appmedicioncerveza.aplication.MedicionPesoCerveza;
import appmedicioncerveza.aplication.SensorPesoCerveza;
import appmedicioncerveza.framework.Disparador;
import appmedicioncerveza.framework.ItemMedicion;
import appmedicioncerveza.framework.LecturaSensor;
import appmedicioncerveza.framework.LecturaSimple;
import javax.swing.JTextField;
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
    ItemMedicion concreteItem = new MedicionPesoCerveza();
    LecturaSimple lector = new LecturaSimple(new SensorPesoCerveza());
    
    Disparador d = new Disparador(lector,fConcreteItem1);
    @Test
    public void creacionFabricaTest(){
  
        assertEquals(fConcreteItem1,d.getFabricaItems());
        
    }
    @Test
    public void creacionItemTest(){

        assertEquals(concreteItem.getClass().getSimpleName(),fConcreteItem1.crearItemMedicion().getClass().getSimpleName());
    }
    // Test Intencional
    @Test
    public void notCreacionFabricaTest(){
  
        d.setFabricaItems(fConcreteItem1);
        assertNotEquals(null,d.getFabricaItems());
        
    }
    @Test
    public void notCreacionItemTest(){

        fConcreteItem1.crearItemMedicion();
        assertNotEquals(null,fConcreteItem1.crearItemMedicion().getClass().getSimpleName());
    }
    @Test
    public void ObtenerMedidaTest(){
       double numero = 10.0; 
       JTextField atrCampo = new JTextField("10");
       SensorPesoCerveza sensorPesoCerveza = new SensorPesoCerveza(lector,atrCampo);
       assertEquals(numero,sensorPesoCerveza.obtenerMedida(),0.001);
    }
    @Test
    public void notObtenerMedidaTest(){
       double numero = 11;
       JTextField atrCampo = new JTextField("10");
       SensorPesoCerveza sensorPesoCerveza = new SensorPesoCerveza(lector,atrCampo);
       assertNotEquals(numero,sensorPesoCerveza.obtenerMedida(),0.001);
    }
}
