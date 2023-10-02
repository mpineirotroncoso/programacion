/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextra1;

/**
 *
 * @author dam1
 */
public class BoletinExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Extra 1
        System.out.println("Marcos Piñeiro Troncoso\n19 marzo 2004");
        //Extra 2
        System.out.println("Programación\n1ºParcial = "+10+"\n2ºParcial = "+10+"\nNota Final = "+10);
        //Extra 3
        final float precio= 90, descuentoporcentaje = 25;
        float descuento = precio * descuentoporcentaje / 100;     
        System.out.println("Precio final = "+(precio - descuento)+"€");
    }
    
}
