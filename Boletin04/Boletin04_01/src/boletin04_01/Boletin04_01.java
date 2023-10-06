/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin04_01;

/**
 *
 * @author dam1
 */
public class Boletin04_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear libro
        Libro lib = new Libro();
        lib.inicializarLibro();
        
        //Crear libro con constructor
        lib.Libro("aa", "autor", 1990,(short) 100, 5);

        //Mostrar libro
        lib.getLibro();
        
        lib.inicializarLibro();
        //Crear libro
        lib.setTitulo("El Principito");
        lib.setAutor("Antoine de Saint-Exupéry");
        lib.setAno(1943);
        lib.setPaginas((short) 96);
        lib.setValoracion(4.5f);
        //Mostrar libro
        lib.getLibro();
    }
    
}
