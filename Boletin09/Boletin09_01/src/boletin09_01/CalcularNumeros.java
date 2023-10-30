/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin09_01;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class CalcularNumeros {
    public void CalcularNumeros() {
        int num[] = { 1,2,3,4,5,6,7,8,9,10 };
        int pos = 0;
        int neg = 0;
        int cero = 0;
        
        for (int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"+ (i+1)));
            if(num[i]>0){
              pos++;  
            } else if(num[i]==0){
              cero++;
            } else if(num[i]<0) {
              neg++;
            }
        }
        
        System.out.println("Numeros positivos: "+pos+"\nNumeros negativos: "+neg+"\nCeros: "+cero);
    }
}
