/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin18_02;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Precios {
    private int zona;
    private double peso;

    public void calcularPrecio() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca la zona de localización:\nAmérica del Norte(pulse 1)\nAmérica Central(pulse 2)\nAmérica do Sur (pulse 3)\nEuropa(pulse 4)\nAsia(pulse 5)\nSalir(pulse 0)");
            zona = sc.nextInt();
            switch (zona) {

                case 1 -> {
                    System.out.println("Selecciona el peso del paquete");
                    peso = sc.nextDouble();
                    if (peso > 5) {
                        System.out.println("No se permiten paquetes que pesen mas de 5kg");
                    } else if (peso < 0) {
                        System.out.println("El peso no puede ser negativo");
                    } else {
                        double total = peso * 24;
                        System.out.println("El precio de la entrega del paquete es de: " + total+" €");
                    }
                }
                case 2 -> {
                    System.out.println("Selecciona el peso del paquete");
                    peso = sc.nextDouble();
                    if (peso > 5) {
                         System.out.println("No se permiten paquetes que pesen más de 5 Kg");
                    } else if (peso < 0) {
                         System.out.println("El peso no puede ser negativo");
                    } else {
                        double total = peso * 20;
                        System.out.println("El precio de la entrega del paquete es de: " + total+" €");                    }
                }
                case 3 -> {
                    System.out.println("Selecciona el peso del paquete");
                    peso = sc.nextDouble();
                    if (peso > 5) {
                         System.out.println("No se permiten paquetes que pesen más de 5 Kg");
                    }else if (peso < 0) {
                        System.out.println("El peso no puede ser negativo");
                    } else {
                        double total = peso * 21;
                        System.out.println("El precio de la entrega del paquete es de: " + total+" €");
                    }
                }
                case 4 -> {
                    System.out.println("Selecciona el peso del paquete");
                    peso = sc.nextDouble();
                    if (peso > 5) {
                         System.out.println("No se permiten paquetes que pesen más de 5 Kg");
                    }else if (peso < 0) {
                        System.out.println("El peso no puede ser negativo");
                    } else {
                        double total = peso * 10;
                        System.out.println("El precio de la entrega del paquete es de: " + total+" €");
                    }
                }
                case 5 -> {
                    System.out.println("Selecciona el peso del paquete");
                    peso = sc.nextDouble();
                    if (peso > 5) {
                         System.out.println("No se permiten paquetes que pesen más de 5 Kg");
                    }else if (peso < 0) {
                        System.out.println("El peso no puede ser negativo");
                    } else {
                        double total = peso * 18;
                        System.out.println("El precio de la entrega del paquete es de: " + total+" €");
                    }
                }
                case 0 -> {
                    System.out.println("Saliendo..."); 
                    System.exit(0);
                }
            }
    }
}
