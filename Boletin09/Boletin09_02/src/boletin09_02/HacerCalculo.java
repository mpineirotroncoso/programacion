/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin09_02;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class HacerCalculo {
    public void HacerCalculo(double num) {

        double i = 10;
        double acuSuma = num;
        while(i<=90){
            System.out.println(acuSuma+" + "+i+" = "+(acuSuma+i));
            acuSuma = acuSuma+i;
            i++;
        }
        
        double j = 10;
        double acuMulti = num;
        while(j<=90){
            System.out.println(acuMulti+" * "+j+" = "+(acuMulti*j));
            acuMulti = acuMulti*j;
            j++;
        }
    }
}
