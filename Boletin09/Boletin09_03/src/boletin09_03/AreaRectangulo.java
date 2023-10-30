/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin09_03;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class AreaRectangulo {
    public static void AreaRectangulo(int base,int altura){
        
        while (base <=0||altura<=0) {
            base= Integer.parseInt(JOptionPane.showInputDialog("Introduzca base:"));
            altura= Integer.parseInt(JOptionPane.showInputDialog("Introduzca base:"));
        }
        
        System.out.println("El area del rectangulo es: "+(base*altura));
    }
}
