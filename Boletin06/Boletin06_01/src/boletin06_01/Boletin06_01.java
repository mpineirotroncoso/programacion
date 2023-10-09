/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin06_01;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin06_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coche coche = new Coche();
        
        coche.acelerar((int) Float.parseFloat(JOptionPane.showInputDialog("Introduce aceleracion : ")));
        
        coche.frenar((int) Float.parseFloat(JOptionPane.showInputDialog("Introduce frenada : ")));
        
        JOptionPane.showMessageDialog(null, "Velocidad final = "+coche.getVelocidade());
    }
    
}
