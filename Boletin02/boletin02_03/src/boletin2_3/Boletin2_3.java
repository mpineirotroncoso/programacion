/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float euros, dolares;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir euros: ");
        euros = sc.nextFloat();
        dolares = euros * 1.06f;
        
        System.out.println("Dolares = " + dolares);
    }
    
}
