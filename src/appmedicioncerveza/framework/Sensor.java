package appmedicioncerveza.framework;

import java.util.*;

/**
 * 
 */
public abstract class Sensor {
    
    //Atributos derivados
    
    private LecturaSensor atrLecturaSensor;

    // metodo constructor por defecto
    public Sensor() 
    {
    }
    
    // metodo constructor parametrizado
    public Sensor(LecturaSensor parObjLecturaSensor)
    {
        this.atrLecturaSensor = parObjLecturaSensor;
        parObjLecturaSensor.setSensor(this);
    }

    // metodos consultores getter
    public LecturaSensor getLecturaSensor() {
        return atrLecturaSensor;
    }
    
    // metodos mutadores setter
    public void setLecturaSensor(LecturaSensor parObjLectorSensor)
    {
        this.atrLecturaSensor = parObjLectorSensor;
        parObjLectorSensor.setSensor(this);
    }
    
 
    public double lectura()
    {
        return atrLecturaSensor.leer();
    }
    
    // metodo que sera implementado de acuerdo a cada una de las necesidades de las clases derivadas
    public double obtenerMedida()
    {
        return 0.0;
    }

    // Metodo hook a ser redefinido
    public void actualizar()
    {
    }    
}