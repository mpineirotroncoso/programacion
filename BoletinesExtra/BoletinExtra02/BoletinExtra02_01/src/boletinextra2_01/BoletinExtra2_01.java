/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextra2_01;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class BoletinExtra2_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce precio: ");
        float precio = sc.nextFloat();
        Calculos calc = new Calculos();
        float precioFinal = calc.addIva(precio);
        System.out.print("Precio sin iva: "+precio+"\nPrecio con iva: "+precioFinal);
    }
}
