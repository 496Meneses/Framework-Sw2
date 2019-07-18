/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import logica.AppMedicionTemperatura;
import logica.MedicionTemperatura;
import java.util.Observable;


/**
 *
 * @author thebar70
 */
public class Model extends Observable{
  
    MedicionTemperatura medicion;
    
    public void lecturaPorEvento(){
        medicion.procesoMedicion();
    }
    
    public void setMedicionTemperatura(MedicionTemperatura medicion){
        this.medicion=medicion;
    }
   
    
}
