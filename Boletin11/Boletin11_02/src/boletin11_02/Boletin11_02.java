/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin11_02;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin11_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        final int NUMSECRETO = r.nextInt(1, 50);
        int num = 0; 
        int intentos = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Jugador 2, Introduce un numero"));
        intentos++;
        while(NUMSECRETO != num) {
            
            
            
            if(20 > (num - NUMSECRETO) || 20 > (NUMSECRETO-num)) {
                num = Integer.parseInt(JOptionPane.showInputDialog("Moi lonxe, "+num));
                intentos++;
            } else if(10 > (num-NUMSECRETO)|| 10 > (NUMSECRETO-num)) {
                num = Integer.parseInt(JOptionPane.showInputDialog("Lonxe "+num));
                intentos++;
            } else if(5 > (num-NUMSECRETO)|| 5 > (NUMSECRETO-num)){
                num = Integer.parseInt(JOptionPane.showInputDialog("Preto "+num));
                intentos++;
            } else if(1 > (num-NUMSECRETO)|| 1 > (NUMSECRETO-num)){
                num = Integer.parseInt(JOptionPane.showInputDialog("Moi preto "+num));
                intentos++;
            } 
        }
        JOptionPane.showMessageDialog(null, "Felicidades, adivinaste el numero en "+intentos+" intentos! es "+ NUMSECRETO);
 
    }
    
}
