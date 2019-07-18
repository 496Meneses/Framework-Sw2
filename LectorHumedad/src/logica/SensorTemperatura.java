/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Modelo.Sensor;
import gui.GUISensor;

/**
 *
 * @author thebar70
 */
public class SensorTemperatura extends Sensor{
    GUISensor gui;
    int temperaturaActual;
    @Override
    public void lectura() {
        temperaturaActual=gui.getEstado();
    }

    @Override
    public void actualizar() {
        
    }
    public void setGUI(GUISensor gui){
        this.gui=gui;
        gui.setVisible(true);
    }
    public int getTemperatura(){
        return this.temperaturaActual;
    }
}
