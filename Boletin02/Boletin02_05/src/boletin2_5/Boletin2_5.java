/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final float conversion = 1852;
        Scanner sc = new Scanner(System.in);
        float mm, metros;
        System.out.print("Introduce millas marinas: ");
        mm = sc.nextFloat();
        metros = mm*conversion;
        System.out.println("Metros = "+ metros);
    }
    
}
