/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin07_01;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin07_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        short numero = sc.nextShort();
        Clase obx = new Clase();
        obx.comprobarPositivo(numero);
        
    }
    
}
