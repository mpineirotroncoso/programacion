/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cantidad en euros: ");
        int cantidadEuros = scanner.nextInt();
        int billetes100 = cantidadEuros / 100;
        cantidadEuros %= 100;
        int billetes20 = cantidadEuros / 20;
        cantidadEuros %= 20;
        int billetes5 = cantidadEuros / 5;
        cantidadEuros %= 5;
        int monedas1 = cantidadEuros;
       
        System.out.println("billetes de 100: " + billetes100);
        System.out.println("billetes de 20: " + billetes20);
        System.out.println("billetes de 5: " + billetes5);
        System.out.println("monedas de 1 euro: " + monedas1);
    }
    
}
