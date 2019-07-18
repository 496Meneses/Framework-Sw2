/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Modelo.FabricaItems;
import Modelo.ItemMedicion;

/**
 *
 * @author thebar70
 */
public class FabricaMedicionTemperatura extends FabricaItems{

    @Override
    public ItemMedicion crearItemMedicion() {
        ItemMedicion medTemperatura= new MedicionTemperatura();
        medTemperatura.setSensor(new SensorTemperatura());
        medTemperatura.setActuador(new Valvula());
        return medTemperatura;
    }
    
}
