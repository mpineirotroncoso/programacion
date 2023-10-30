/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin09_03;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin09_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base= Integer.parseInt(JOptionPane.showInputDialog("Introduzca base:"));
        int altura= Integer.parseInt(JOptionPane.showInputDialog("Introduzca base:"));
        
        AreaRectangulo obx = new AreaRectangulo();
        
        obx.AreaRectangulo(base, altura);
    }
    
}
