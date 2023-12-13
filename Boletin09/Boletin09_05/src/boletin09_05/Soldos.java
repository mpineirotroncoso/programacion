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
        float porcentaje;
        int i = 0;
        int contadorMenosdemil = 0;
        int contadorMasDeMil = 0;
        do {
            soldo = LerDatos.lerFloatPositivo(" Introduce el sueldo del empleado ");
            System.out.println(" El sueldo del empleado " + (i + 1) + " es " + soldo);
            if (soldo <= 1750 && soldo >= 1000) {
                contadorMasDeMil++;
                i++;
            }
            if (soldo < 1000 && soldo > 0) {
                System.out.println("menos de 1000");
                contadorMenosdemil++;
                i++;
            }
        } while (soldo != 0);
        System.out.println(" No hay más trabajadores ");
        porcentaje = ((float) contadorMenosdemil / i) * 100;
        System.out.println(" El porcentaje " + (contadorMenosdemil) + " es " + porcentaje);
    }
}
