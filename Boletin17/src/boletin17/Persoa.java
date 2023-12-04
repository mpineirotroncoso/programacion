/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin17;

/**
 *
 * @author dam1
 */
public class Persoa {
    private String nome;
    private String apelidos;
    private String nif;

    public Persoa(String nome, String apelidos, String nif) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persoa{" + "nome=" + nome + ", apelidos=" + apelidos + ", nif=" + nif + '}';
    }
    
    
}
