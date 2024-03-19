/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.sismusica.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.sismusica.Modelo.RegistroCancion;
import ucr.ac.cr.sismusica.Vista.JFrameCanciones;
import ucr.ac.cr.sismusica.Vista.JPanelBotones;
import ucr.ac.cr.sismusica.Vista.JPanelDatosCancion;

/**
 *
 * @author Estudiante
 */
public class ManejadorCanciones implements ActionListener{
    private RegistroCancion registroC;
    private JFrameCanciones jfCanciones;
    private JPanelBotones jpBotones; 
    private JPanelDatosCancion jpDatosCancion; 
    
    
    
    public ManejadorCanciones (){
        this.jfCanciones= new JFrameCanciones();
        this.jfCanciones.setEscuchador(this);
       this.jfCanciones.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        
        
    }
    
}
