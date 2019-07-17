/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedicioncerveza.framework;



/**
 *
 * @author Jeison
 */
public class LecturaPeriodica extends LecturaSensor{

    
    // metodo constructor por defecto
    public LecturaPeriodica()
    {
    }
    
    // metodo constructor parametrizado
    public LecturaPeriodica(Sensor parObjSensor)
    {
        super(parObjSensor);
    }

    @Override
    public double leer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
