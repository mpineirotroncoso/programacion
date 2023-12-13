/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin09_05;

/**
 *
 * @author dam1
 */
public class Soldos {
       public void amosarSoldo() {
        float soldo;
        int i = 0;
        int contadorMenosdemil = 0;
        do {
            soldo = LerDatos.lerFloatPositivo(" Introduce el sueldo del empleado ");
            System.out.println(" El sueldo del empleado " + (i + 1) + " es " + soldo);
            i++;
            if (soldo <= 1750 && soldo >= 1000) {
            } else if (soldo < 1000) {
                contadorMenosdemil++;
                i++;
                float porcentaje = (contadorMenosdemil++ / i) * 100;
                System.out.println(" El porcentaje " + (contadorMenosdemil) + " es " + porcentaje);
            }
        } while (soldo != 0);
        System.out.println(" No hay más trabajadores ");
    }
}
