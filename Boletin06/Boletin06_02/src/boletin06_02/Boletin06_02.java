/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin06_02;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin06_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double meridiano = Double.parseDouble(JOptionPane.showInputDialog("Introduce meridiano : "));
        double paralelo = Double.parseDouble(JOptionPane.showInputDialog("Introduce paralelo : "));
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Introduce distancia a terra : "));
        Satelite satelite = new Satelite(meridiano, paralelo, distancia);
        satelite.verPosicion();
    }
    
}
