/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Modelo.ItemMedicion;
import gui.GUISensor;
import gui.GUIValvula;


/**
 *
 * @author thebar70
 */
public class MedicionTemperatura extends ItemMedicion {
    
    Valvula val;
    SensorTemperatura sen;
    int temperaturaActual;
    
    public MedicionTemperatura(){
        this.val= new Valvula();
        this.sen= new SensorTemperatura();
    }

    @Override
    protected void hacerLeerSensor() {
        sen.lectura();
        
    }

    @Override
    protected void hacerAlmacenarResultado() {
        //Nada por hacer
    }

    @Override
    protected boolean hacerCompararValores() {
        temperaturaActual=sen.getTemperatura();
        return (temperaturaActual>15 || temperaturaActual<50);
    }

    @Override
    protected void hacerEjecutarAcciones() {
        if(hacerCompararValores()){
            val.setTempereaturaActual(temperaturaActual);
            val.actuar();
        }
            
    }
    public void setGUIValvula(GUIValvula gui_val){
        this.val.setGUI(gui_val);
    }
    public void setGUISensor(GUISensor gui_sensor){
        this.sen.setGUI(gui_sensor);
    }
    
}
