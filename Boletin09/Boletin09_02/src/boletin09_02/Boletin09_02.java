/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin09_02;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin09_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num = Double.parseDouble(JOptionPane.showInputDialog("introduce un numero:"));
        HacerCalculo obx = new HacerCalculo();
        obx.HacerCalculo(num);
    }
    
}
