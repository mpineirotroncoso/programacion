/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin08_01;

/**
 *
 * @author dam1
 */
public class Almacen {
    public void comprobarConsumo(String articulo, short ventas) {
        if (ventas <= 100){
            System.out.println(articulo+" e de baixo consumo");
        } else if (ventas >100 && ventas <=500) {
            System.out.println(articulo+" e de medio consumo");
        } else if (ventas >500 && ventas <= 1000) {
            System.out.println(articulo+" e de alto consumo");
        } else if (ventas > 1000) {
            System.out.println(articulo+" e de primeira necesidade");
        }
    }
}
