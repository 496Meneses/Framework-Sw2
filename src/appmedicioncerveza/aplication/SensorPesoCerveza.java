/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedicioncerveza.aplication;

import appmedicioncerveza.framework.LecturaSensor;
import appmedicioncerveza.framework.Sensor;
import javax.swing.JTextField;

/**
 *
 * @author HECTOR
 */
public class SensorPesoCerveza extends Sensor 
{
     private final JTextField atrCampo;
     
     // metodo constructor por defecto
     public SensorPesoCerveza()
     { 
         this.atrCampo =null;
     }
     
     // metodo constructor parametrizado
     public SensorPesoCerveza(LecturaSensor parObjSensor,JTextField parObjJTextField)
     {
         super(parObjSensor);
         this.atrCampo = parObjJTextField;
     }
    
     // metodo que permite obtener el valor leido por el sensor
     @Override
    public double obtenerMedida() {
        if (!this.atrCampo.getText().isEmpty())
            return Double.parseDouble(this.atrCampo.getText());
        else
            return -1;
    }
}
