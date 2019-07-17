/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedicioncerveza.aplication;

import appmedicioncerveza.framework.ItemMedicion;

/**
 *
 * @author HECTOR
 */
public class MedicionPesoCerveza extends ItemMedicion
{
    //Atributos
    public double atrValor;
    
    // metodo constructor por defecto
    public MedicionPesoCerveza()
    {
        
    }

    @Override
    protected void hacerLeerSensor() 
    {
        this.atrValor = this.atrsSensor.lectura();
    }

    @Override
    protected void hacerAlmacenarResultado() 
    {
       // por ahora no se almacenaran los resultados
    }

    @Override
    protected boolean hacerCompararValores()
    {
        System.out.println(""+this.atrValor);
        return (this.atrValor<10 || this.atrValor >12);
    }

    @Override
    protected void hacerEjecutarAcciones() {
        this.atrActuador.actuar();
    }
    
}
