/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin12_01;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Garaxe {
    final int MAXPRAZAS = 5;
    private int numeroCoches = 0;
    
    public Garaxe() {
    }

    public Garaxe(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }
    
    
    public void addCoche(String matricula, String marca) {
        Coche obx = new Coche(matricula, marca);
        numeroCoches++;
        System.out.println("Coche añadido!");
    }
    
    public void addCocheInteractivo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la matrícula: ");
        String matricula = sc.nextLine();
        System.out.println("Introduce la marca: ");
        String marca = sc.nextLine();
        Coche obx = new Coche(matricula, marca);
        numeroCoches++;
        System.out.println("Coche añadido!");
    }
    
    public void eliminarCoche() {
        
    }
    
    public void eliminarCocheInteractivo() {
        
    }
    
    public boolean espacioDisponible() {
        if ((MAXPRAZAS - numeroCoches) > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    @Override
    public String toString() {
        return "Garaxe{" + "MAXPRAZAS=" + MAXPRAZAS + ", numeroCoches=" + numeroCoches + '}';
    }

    
}
