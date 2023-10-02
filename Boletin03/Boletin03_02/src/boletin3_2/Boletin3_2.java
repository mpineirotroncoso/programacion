/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_2;

import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletin3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float centigrados,kelvin,fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Grados centigrados: ");
        centigrados = sc.nextFloat();
        kelvin = (float) (centigrados + 273.15);
        fahrenheit = (float) (centigrados * 1.8 + 32);
        System.out.print("Kelvin = "+kelvin+"\nFahrenheit = "+fahrenheit);
    }
}
