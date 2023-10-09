/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin06_03;

/**
 *
 * @author dam1
 */
public class Boletin06_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //constructor parametrizado
        Circulo circulo = new Circulo(100);
        System.out.println("Area del circulo = "+circulo.calcularArea());
        System.out.println("Lonxitude del circulo = "+circulo.calcularLonxitude());
        //constructor por defecto
        Circulo circ = new Circulo();
        circ.setRadio(50);
        
        System.out.println("Area del circulo = "+circ.calcularArea());
        System.out.println("Lonxitude del circulo = "+circ.calcularLonxitude());
    }
    
}
