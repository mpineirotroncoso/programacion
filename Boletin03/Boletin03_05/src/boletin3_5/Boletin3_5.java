/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario los datos necesarios
        System.out.print("Introduce el salario fijo mensual: ");
        double salarioFijo = scanner.nextDouble();
        
        System.out.print("Introduce el importe total de ventas: ");
        double ventas = scanner.nextDouble();
        
        System.out.print("Introduce la cantidad de kilómetros recorridos: ");
        double kilometros = scanner.nextDouble();

        System.out.print("Introduce la cantidad de días de desplazamiento: ");
        int diasDesplazamiento = scanner.nextInt();

        double comision = ventas * 0.05;

        double salarioKilometros = kilometros * 2;

        double dietas = diasDesplazamiento * 30;

        double salarioTotal = salarioFijo + comision + salarioKilometros + dietas;

        double irpf = salarioTotal * 0.18;

        double seguridadSocial = 36.0;

        // Calcular el salario neto
        double salarioNeto = salarioTotal - irpf - seguridadSocial;

        // Mostrar los resultados
        System.out.println("Salario Bruto: " + salarioTotal + " euros");
        System.out.println("Salario Neto: " + salarioNeto + " euros");
    }
    
}
