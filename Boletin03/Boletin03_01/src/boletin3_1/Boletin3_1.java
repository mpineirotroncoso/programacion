/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_1;

import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletin3_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float preciotarifa,preciopagado,descuento;
        System.out.print("Introduce el precio original: ");
        preciotarifa = sc.nextFloat();
        System.out.print("Introduce el precio pagado: ");
        preciopagado = sc.nextFloat();
        descuento = 100-(preciopagado/preciotarifa*100);
        
        System.out.print("Hay un "+descuento+"% de descuento");
    }
}
