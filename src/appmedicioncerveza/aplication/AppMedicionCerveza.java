/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedicioncerveza.aplication;

import appmedicioncerveza.framework.AbstractApp;
import appmedicioncerveza.framework.Disparador;
import appmedicioncerveza.framework.LecturaPorEvento;


public class AppMedicionCerveza extends AbstractApp
{
   
    @Override
    public void crearSistemaMedicion()
    {        
        FabricaCalidadCerveza objFaCalidadCerveza = new FabricaCalidadCerveza();
        Disparador objDisparador = new Disparador(new LecturaPorEvento(),objFaCalidadCerveza);
        FrameCerveceria objCerveceria = new FrameCerveceria(objDisparador);
        
        objFaCalidadCerveza.settings(objCerveceria.getPeso());
        objCerveceria.setVisible(true);
//        objDisparador.lectura();
    }
    
    
}
