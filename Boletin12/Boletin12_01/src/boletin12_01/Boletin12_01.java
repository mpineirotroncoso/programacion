/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin12_01;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin12_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garaxe grx = new Garaxe(4);

        Scanner sc = new Scanner(System.in);
        int seleccion = 0;
        while (seleccion != 10) {
            boolean espacioLibre = grx.espacioDisponible();
            if (espacioLibre == true) {
                System.out.println("HAY PLAZAS DISPONIBLES");
            } else {
                System.out.println("COMPLETO");
            }
            System.out.println("1. Añadir coche");
            System.out.println("2. Eliminar coche");
            System.out.println("3. Salir");
            System.out.println("Introduce numero: ");
            seleccion = sc.nextInt();
            switch (seleccion) {
                case 1:
                    if (espacioLibre  == true){
                        grx.addCocheInteractivo();    
                    } else {
                        System.out.println("El parking esta completo no se puede añadir ningun coche");
                    }
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Saliendo");
                    seleccion = 10;
                    break;
                default:
                    break;
            }
        }
        
    }
    
}
