/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

/**
 *
 * @author dam1
 */
public class Revista extends Publicacion{
    private int num;

    public Revista(int num, int codigo, String titulo, int ano) {
        super(codigo, titulo, ano);
        this.num = num;
    }

    @Override
    public String toString() {
        return "Revista{" + "num=" + num + '}';
    }
    
}
