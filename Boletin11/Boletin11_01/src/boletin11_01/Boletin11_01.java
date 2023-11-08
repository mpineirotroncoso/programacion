 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin11_01;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin11_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int NUMSECRETO = 0;
        while (NUMSECRETO <=0 || NUMSECRETO >= 50) {
            NUMSECRETO = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1, introduce el numero a adivinar, debe ser entre 1 y 50"));
        }

        int num = 0; 
        int intentos = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Jugador 2, Introduce un numero"));
        intentos++;
        while(NUMSECRETO != num) {
            
            if(num > NUMSECRETO) {
                num = Integer.parseInt(JOptionPane.showInputDialog("El numero es menor que "+num));
                intentos++;
            } else if(num < NUMSECRETO) {
                num = Integer.parseInt(JOptionPane.showInputDialog("El numero es mayor que "+num));
                intentos++;
            } 
        }
        JOptionPane.showMessageDialog(null, "Felicidades, adivinaste el numero en "+intentos+" intentos! es "+ NUMSECRETO);
        
    }
    
}
