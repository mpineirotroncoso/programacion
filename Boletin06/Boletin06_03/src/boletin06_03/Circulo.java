/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin06_03;

/**
 *
 * @author dam1
 */
public class Circulo {
    private final double PI = 3.14;
    double radio;
    public Circulo () {
    }
    
    public Circulo (double rad) {
        radio = rad;
    }
    
    public void setRadio(double rad){
        radio = rad;
    }
    public double getRadio(){
        return radio;
    }
    
    public double calcularArea(){
        return PI*Math.pow(radio, 2);
    }
    
    public double calcularLonxitude(){
        return 2*PI*radio;
    }
}
