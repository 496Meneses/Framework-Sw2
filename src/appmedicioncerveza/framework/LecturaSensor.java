package appmedicioncerveza.framework;


import java.util.*;

/**
 *
 */
public abstract class LecturaSensor 
{
 
    //Atributo derivado que me permite realizar la lectura de sensores
    protected Sensor atrSensor;
    
    //Constructor por defecto
    public LecturaSensor()
    {
    }
    
    // Constructor parametrizado
    public LecturaSensor(Sensor parObjSensor)
    {
        atrSensor = parObjSensor;
    }
    
    // metodo que define el comportamiento comun entre sus clases derivadas
    public double leer()
    {
        return this.atrSensor.obtenerMedida();
    }
    
    
    // metodos mutadores setter
    public void setSensor(Sensor parObjSensor)
    {
        atrSensor = parObjSensor;
    }
    
    // metodos consultores getter
    
    public Sensor getSensor()
    {
        return this.atrSensor;
    }

}
