/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin07_05;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin07_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero 1: ");
        Short num1 = sc.nextShort();
        System.out.print("Introduce numero 2: ");
        Short num2 = sc.nextShort();
        System.out.print("Introduce numero 3: ");
        Short num3 = sc.nextShort();
        
        Clase obx = new Clase();
        obx.comprobarMaior(num1, num2, num3);
    }
    
}
