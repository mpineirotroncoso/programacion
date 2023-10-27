/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin08_01;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin08_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca nombre del articulo : ");
        String articulo = sc.nextLine();
        
        System.out.print("Introduzca numero de ventas : ");
        short ventas = sc.nextShort();
        
        Almacen obx = new Almacen();
        obx.comprobarConsumo(articulo, ventas);
    }
    
}
