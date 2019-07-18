/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.Model;

/**
 *
 * @author thebar70
 */
public class Controller implements ActionListener, ChangeListener{
    Model model;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    public void addModel(Model modelo){
        this.model=modelo;
    }
   

    @Override
    public void stateChanged(ChangeEvent e) {
        System.out.println("notificando");
        model.lecturaPorEvento();
    }
    
}
