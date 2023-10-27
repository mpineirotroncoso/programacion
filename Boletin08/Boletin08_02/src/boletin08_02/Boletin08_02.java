/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin08_02;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin08_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tipo de figura : ");
        String figura = sc.nextLine();
        
        CalcularArea obx = new CalcularArea();
        
        switch (figura) {
            case "cuadrado":
                System.out.print("Introduce la longitud del lado : ");
                float lado = sc.nextShort();
                System.out.println(obx.getAreaCuadrado(lado));
                break;
            case "triangulo":
                System.out.print("Introduce la base : ");
                float base = sc.nextShort();
                System.out.print("Introduce la altura : ");
                float altura = sc.nextShort();
                System.out.println(obx.getAreaTriangulo(base, altura));
                break;
            case "circulo":
                System.out.print("Introduce radio : ");
                float radio = sc.nextShort();
                System.out.println(obx.getAreaCirculo(radio));
                break;
            default:
                System.out.print("Opcion incorrecta.");
                break;
        }
    }
    
}
