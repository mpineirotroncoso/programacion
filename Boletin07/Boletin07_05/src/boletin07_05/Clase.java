/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin07_05;

/**
 *
 * @author dam1
 */
public class Clase {
    public void comprobarMaior(short num1, short num2, short num3){
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1+" Es el mayor");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2+" Es el mayor");
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println(num3+" Es el mayor");
        }
    }
}
