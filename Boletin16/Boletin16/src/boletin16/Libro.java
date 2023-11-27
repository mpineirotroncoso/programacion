/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

/**
 *
 * @author dam1
 */
public class Libro extends Publicacion{
    private boolean prestado;

    public Libro(boolean prestado, int codigo, String titulo, int ano) {
        super(codigo, titulo, ano);
        this.prestado = prestado;
    }



    @Override
    public String toString() {
        return "Libro{" + "prestado=" + prestado + '}';
    }
    
    
}
