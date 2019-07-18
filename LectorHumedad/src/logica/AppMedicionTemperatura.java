/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Modelo.AbstractApp;
import Modelo.ItemMedicion;
import controller.Controller;
import gui.GUISensor;
import gui.GUIValvula;
import model.Model;

/**
 *
 * @author thebar70
 */
public class AppMedicionTemperatura extends AbstractApp{

    MedicionTemperatura itemMedicion;
    @Override
    public void crearSistemaMedicion() {
        FabricaMedicionTemperatura fabrica= new FabricaMedicionTemperatura();
        this.itemMedicion=(MedicionTemperatura) fabrica.crearItemMedicion();
    }

    @Override
    public void main() {
        crearSistemaMedicion();
        
        Model model= new Model();
        Controller controller= new Controller();
        
        GUISensor view1= new GUISensor();
        GUIValvula view2= new GUIValvula();
        
        model.addObserver(view2);
        model.addObserver(view2);
        controller.addModel(model);
        view1.addController(controller);
        
        itemMedicion.setGUISensor(view1);
        itemMedicion.setGUIValvula(view2);
        
        model.setMedicionTemperatura(itemMedicion);
        
        
    }
     
}
