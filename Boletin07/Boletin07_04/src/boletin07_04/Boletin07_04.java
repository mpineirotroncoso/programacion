/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin07_04;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin07_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nome persoa 1: ");
        String nom1 = sc.nextLine();
        System.out.print("Introduce un peso persoa 1: ");
        short peso1 = sc.nextShort();
        
        sc.nextLine(); // limpia el buffer, si no se pone se salta el nombre de persoa 2 por alguna razon
        
        System.out.print("Introduce un nome persoa 2: ");
        String nom2 = sc.nextLine();
        System.out.print("Introduce un peso persoa 2: ");
        short peso2 = sc.nextShort();
        
        Clase obx = new Clase();
        obx.comprobarPeso(nom1, peso1, nom2, peso2);

    }
    
}
