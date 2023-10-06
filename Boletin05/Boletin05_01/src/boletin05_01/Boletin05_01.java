/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin05_01;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin05_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce kilometros : ");
        float km = sc.nextFloat();
        System.out.print("Introduce litros : ");
        float litros = sc.nextFloat();
        System.out.print("Introduce velocidad media : ");
        float vMed = sc.nextFloat();
        System.out.print("Introduce precio gasolina : ");
        float pGas = sc.nextFloat();
        // Constructor
        consumo consume = new consumo();
        consume.setLitros(litros);
        consume.setpGas(pGas);
        consume.setKms(km);
        consume.setvMed(vMed);
        System.out.println("Consumo medio = "+consume.consumoMedio()+" litros/km");
        System.out.println("Velocidade media = "+consume.getvMed()+" Km/h");
        System.out.println("Tiempo viaje = "+consume.getTempo()+" Horas");
        
        // Constructor parametrizado
        consumo consumo = new consumo(km,litros,vMed,pGas);
        //consumo.consumo(km,litros,vMed,pGas);
        System.out.println("Consumo medio = "+consumo.consumoMedio()+" litros/km");
        System.out.println("Velocidade media = "+consumo.getvMed()+" Km/h");
        System.out.println("Tiempo viaje = "+consume.getTempo()+" Horas");
    }
    
}
