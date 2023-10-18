/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin07_02;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin07_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        short num1 = sc.nextShort();
        System.out.print("Introduce otro numero: ");
        short num2 = sc.nextShort();
        Clase obx = new Clase();
        obx.hacerSuma(num1, num2);
    }
    
}
