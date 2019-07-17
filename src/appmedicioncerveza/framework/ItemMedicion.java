package appmedicioncerveza.framework;

import javax.swing.JOptionPane;


/**
 *
 */
public abstract class ItemMedicion {

    //atributos derivados
    
    protected Sensor atrsSensor;
    protected Actuador atrActuador;

    // metodo constructor por defecto
    public ItemMedicion() 
    {
    }
    
    // metodo constructor parametrizado
    public ItemMedicion(Sensor parObjSensor, Actuador parObjActuador) 
    {
        this.atrsSensor = parObjSensor;
        this.atrActuador = parObjActuador;
    }
    
    // metodo plantilla su estructura no sera modificada por sus clases derivadas
    public void procesoMedicion() {
        this.hacerLeerSensor();
        this.hacerAlmacenarResultado();
        if(this.hacerCompararValores())
        {
            this.hacerEjecutarAcciones();
        }else{
            JOptionPane.showMessageDialog(null, "La cerveza fue aceptada satisfactoriamente, felicitaciones.");
        }
        
    }

    // metodos abstractos que seran implementados dependiendo de las necesidades de cada clase derivada
    protected abstract void hacerLeerSensor();

    protected abstract void hacerAlmacenarResultado();

    protected abstract boolean hacerCompararValores();

    protected abstract void hacerEjecutarAcciones();

    // metodos mutadores setter
    public void setSensor(Sensor parObjSensor)
    {
        this.atrsSensor= parObjSensor;
    }
    public void setActuador(Actuador parObjActuador)
    {
        this.atrActuador = parObjActuador;
    }
    
    // metodos consultores getter
    public Sensor gerAtrSensor()
    {
        return this.atrsSensor;
    }
    
    public Actuador getAtrActuador()
    {
        return this.atrActuador;
    }
}
