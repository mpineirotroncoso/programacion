/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinextra02_02;

/**
 *
 * @author dam1
 */
public class Calculos {
    public Calculos() { }
    
    public double hacerEcuacion(double varA, double varB, double varC) {
        //varA = Math.sqrt(varA);
        //varB = Math.sqrt(varB);
        //varC = Math.sqrt(varC);
        
        double resultado = ((-varB) - (4 * varA * varC)) / (2 * varA);
        return resultado;
    }
}
