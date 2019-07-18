/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Modelo.Actuador;
import gui.GUIValvula;

/**
 *
 * @author thebar70
 */
public class Valvula extends Actuador{
    
    GUIValvula gui;
    int temperaturaActual;
    @Override
    public void actuar() {
       
        gui.actualizar(temperaturaActual);
        
    }
    public void setGUI(GUIValvula gui){
        this.gui=gui;
        gui.setVisible(true);
    }
    public void setTempereaturaActual(int temperaturaActual){
        this.temperaturaActual=temperaturaActual;
    }
    
}
