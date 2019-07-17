/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedicioncerveza.aplication;

import appmedicioncerveza.framework.FabricaItems;
import appmedicioncerveza.framework.ItemMedicion;
import appmedicioncerveza.framework.LecturaSimple;
import appmedicioncerveza.framework.Sensor;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author HECTOR
 */
public class FabricaCalidadCerveza extends FabricaItems
{
    // Atributos
    JTextField atrPeso;
    
    // metodo constructor por defecto
    public FabricaCalidadCerveza()
    {
        
    }
    
    // metodo mutador para la interaccion humano computador
    public void settings(JTextField parObjPeso) 
    {
      this.atrPeso = parObjPeso;
    }

    @Override
    public ItemMedicion crearItemMedicion() 
    {
        ItemMedicion varObjItemsMedCerveza= new MedicionPesoCerveza();
        varObjItemsMedCerveza.setSensor(new SensorPesoCerveza(new LecturaSimple(),atrPeso) );
        varObjItemsMedCerveza.setActuador(new BrazoEmpuje());
        return varObjItemsMedCerveza;
    }
    
}
