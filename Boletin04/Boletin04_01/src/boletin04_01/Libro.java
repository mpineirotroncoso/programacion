/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin04_01;

/**
 *
 * @author dam1
 */
public class Libro {
    
        String titulo;
        String autor;
        int ano;
        short numPaginas;
        float valoracion;
        
    public void Libro() { }
    
    public void Libro(String tit, String aut, int an, short paginas, float valora) {
        titulo = tit;
        autor = aut;
        ano = an;
        numPaginas = paginas;
        valoracion = valora;
    }
    
    public void getLibro() {
        System.out.println("\nInformación del libro\ntitulo = " + titulo + "\nautor = " + autor + "\nano = "+ ano + "\nnumero de paxinas = " + numPaginas + "\nvaloracion = " + valoracion);
    }
    
    public void inicializarLibro() {
        titulo = "";
        autor = "";
        ano = 0;
        numPaginas = 0;
        valoracion = 0.0f;
    }
    
    public void setTitulo (String m) {
        titulo = m;
        //System.out.println("Establecido el titulo en = " + m);
    }
    public void setAutor (String m) {
        autor = m;
        //System.out.println("Establecido el autor en = " + m);
    }
    public void setAno (int m) {
        ano = m;
        //System.out.println("Establecido el año en = " + m);
    }
    public void setPaginas (short m) {
        numPaginas = m;
        //System.out.println("Establecido el numero de paginas en = " + m);
    }
    public void setValoracion (float m) {
        valoracion = m;
        //System.out.println("Establecida la valoracion en = " + m);
    }
    public String getTitulo() {
    return titulo;
    }

    public String getAutor() {
        return autor;
    }
    public int getAno() {
        return ano;
    }
    public short getPaginas() {
        return numPaginas;
    }
    public float getValoracion() {
        return valoracion;
    }
    
}
