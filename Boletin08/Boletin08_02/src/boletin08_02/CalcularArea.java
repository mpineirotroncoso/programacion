/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin08_02;

/**
 *
 * @author dam1
 */
public class CalcularArea {
    final double pi = 3.14;
    
    public float getAreaCuadrado(float lado) { return lado*lado; }
    
    public float getAreaTriangulo(float base, float altura) { return base*altura/2; }
    
    public double getAreaCirculo(float radio) { return pi*Math.pow(radio, 2); }
}
