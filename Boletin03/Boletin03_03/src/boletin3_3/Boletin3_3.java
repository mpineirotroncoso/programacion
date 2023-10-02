/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float billetes100, billetes20, billetes5, monedas1;
        System.out.print("Billetes de 100 : ");
        billetes100 = sc.nextFloat();
        System.out.print("Billetes de 20 : ");
        billetes20 = sc.nextFloat();
        System.out.print("Billetes de 5 : ");
        billetes5 = sc.nextFloat();
        System.out.print("Moedas de 1 : ");
        monedas1 = sc.nextFloat();
        
        System.out.print("Dinero total = " + ((billetes100*100)+(billetes20*20)+(billetes5*5)+(monedas1)));
    }
    
}
