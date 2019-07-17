/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedicioncerveza.framework;


import java.util.ArrayList;

/**
 *
 * @author Jeison
 */
public class LecturaPorEvento extends LecturaSensor{
    

    // metodo constructor por defecto
    public LecturaPorEvento() 
    {
    }
    
    // metodo constructor parametrizado
    public LecturaPorEvento(Sensor parObjSensor) 
    {
        super(parObjSensor);
    }

    public void notificarTodos()
    {
        this.atrSensor.actualizar();
    }
    
    public void addSensor(Sensor parObjSensor)
    {
        this.atrSensor = parObjSensor;
    }

    @Override
    public double leer() {
        this.notificarTodos();
        return this.atrSensor.obtenerMedida();
    }
    
}
