/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin18_01;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Llamada {
    private double precio;
    private double preciofinal;
    private int tiempo;
    private int nombredia;
    
    public void llamada(){
        int salir;
        
        do{    
        salir=Integer.parseInt(JOptionPane.showInputDialog("Quieres continuar el programa? \n1.Si \n2.Non"));
        if(salir==1){
        tiempo=Integer.parseInt(JOptionPane.showInputDialog("Duración de la llamada en minutos"));
        if(tiempo<=5){
        precio=1;
    }
        else if(tiempo>5&&tiempo<=8){
           precio=1.8; 
        }
        
        else if(tiempo>8&&tiempo<=10){
           precio=2.5;
        }
        else if(tiempo>10){
           precio=2.5+((tiempo-10)*0.5); 
        }
        nombredia=Integer.parseInt(JOptionPane.showInputDialog("Seleccione el dia de la semana \n 1.De luns a sábado pola mañá \n 2.De luns a sábado pola tarde \n 3.Domingo"));
        switch(nombredia){
            case 1:
            preciofinal=precio+precio*0.15;
                break; 
            case 2:
            preciofinal=precio+precio*0.10;
                break;
            case 3:
            preciofinal=precio+precio*0.03;
                break;
                
            default:
                System.out.println("Opción seleccionada no válida, pruebe con otra");
        }
        JOptionPane.showMessageDialog(null, "Duración de la llamada: "+tiempo+" minutos"+"\nPrecio final de la llamada: " +preciofinal+"€");
        }
        }while(salir==1);  
    }
}
