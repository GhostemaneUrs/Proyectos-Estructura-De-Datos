/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.metodosSimulacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JDialog;
import javax.swing.Timer;

/**
 *
 * @author Urueta
 */
public class MetodoDeJDialog implements WindowListener{
    private Timer t;
    private JDialog ventana;

    public MetodoDeJDialog(JDialog ventana) {
        this.ventana = ventana;
    }

    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosing(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {
    t = new Timer(Metodos.verSegundos() * 1000, acciones);
    t.start();
    }
    @Override
    public void windowDeactivated(WindowEvent e) {}
    
    ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Metodos.borrarArchivo();
            ventana.dispose();
            t.stop();
        }
    };
    
}
