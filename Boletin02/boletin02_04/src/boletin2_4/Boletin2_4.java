/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_4;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1,num2;
        float suma,resta,multi,divi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero 1: ");
        num1 = sc.nextFloat();
        System.out.print("Introduce numero 2: ");
        num2 = sc.nextFloat();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2;
        
        System.out.println("Resultado de suma : " + suma + "\nResultado de resta : " + resta + "\nResultado de multiplicacion : " + multi + "\nResultado de división : " + divi);
    }
    
}
