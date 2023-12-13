
package boletin09_04;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin09_04 {

    /**
     * ejecutar las multiplicaciones de 0 a 10 de cualquier numero
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculo obx = new Calculo();
        int num;
        System.out.println("Calculadora de multiplicaciones");
        do {
        System.out.print("Introduce un numero: ");        
        num = sc.nextInt();
        obx.Calculo(num);
        } while(num != 0);
    }
    
}
