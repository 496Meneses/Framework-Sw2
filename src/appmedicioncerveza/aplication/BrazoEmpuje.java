/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedicioncerveza.aplication;

import appmedicioncerveza.framework.Actuador;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author HECTOR
 */
public class BrazoEmpuje extends Actuador
{
    // atributos
    
    // metodo constructor por defecto
    public BrazoEmpuje()
    {
        
    }
    
    // metodo constructor parametrizado
    /*
    public BrazoEmpuje(JLabel parObjEmpuje)
    {
        this.atrEmpuje = parObjEmpuje;
    }*/
    
    public void actuar(){
        JOptionPane.showMessageDialog(null, "La cerveza fue rechazada por estandares de calidad.");
//        this.atrEmpuje.setText("Cerveza Rechazada");
    }
    
    
}
