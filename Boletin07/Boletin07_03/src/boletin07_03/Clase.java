/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin07_03;

/**
 *
 * @author dam1
 */
public class Clase {
    public void comprobarPositivo(short num){
        if (num > 0){
            System.out.println("+ positivo");
        } else if (num < 0) {
            System.out.println("- negativo");
        } else {
            System.out.println("cero");
        }
    }
}
