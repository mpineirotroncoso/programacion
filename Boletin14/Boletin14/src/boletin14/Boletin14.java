/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin14;

import partes.Monitor;
import partes.Procesador;
import partes.Teclado;

/**
 *
 * @author dam1
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ordenador ord = new Ordenador(new Monitor(10), new Teclado("Xiaomi"), new Procesador(2.5f), 10);
        
        System.out.println(ord.toString());
        
        System.out.println("Precio ordenador: "+ord.getPrecio()+"€");
        System.out.println("Marca teclado: "+ord.getTe().getMarca());
        System.out.println("Velocidade procesador: "+ord.getPro().getVelocidade()+"GHz");
    }
    
}
