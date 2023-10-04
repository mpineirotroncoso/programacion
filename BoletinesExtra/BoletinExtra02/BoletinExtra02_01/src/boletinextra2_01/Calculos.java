/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinextra2_01;

/**
 *
 * @author dam1
 */
public class Calculos {
    final float iva = 21; 
    public Calculos() { }
    
    public float addIva(float precio) {
        precio = precio + (precio*(iva/100));
        return precio;
    }
    
}
