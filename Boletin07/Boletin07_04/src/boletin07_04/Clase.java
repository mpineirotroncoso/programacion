/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin07_04;

/**
 *
 * @author dam1
 */
public class Clase {
    public void comprobarPeso(String nom1, short peso1, String nom2, short peso2){
        if (peso1 > peso2){
            System.out.println(nom1+" pesa "+(peso1-peso2)+" kilos mas que "+nom2);
        } else {
            System.out.println(nom2+" pesa "+(peso2-peso1)+" kilos mas que "+nom1);
        }
    }
}
