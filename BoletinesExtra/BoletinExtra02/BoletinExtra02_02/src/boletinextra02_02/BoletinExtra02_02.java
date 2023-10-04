/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextra02_02;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class BoletinExtra02_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca primer valor: ");
        double a = sc.nextDouble();
        System.out.print("Introduzca segundo valor: ");
        double b = sc.nextDouble();
        System.out.print("Introduzca tercer valor: ");
        double c = sc.nextDouble();
        Calculos cal = new Calculos();
        double resultado = cal.hacerEcuacion(a, b, c);
        System.out.print("Resultado de la ecuación: "+resultado);
        
    }
    
}
