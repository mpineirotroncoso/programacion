/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin17;

/**
 *
 * @author dam1
 */
public class Conta {
    private long numeroConta;
    private double saldo;
    private Persoa cliente;

    public Conta(long enteiroConta, Persoa cliente) {
        this.numeroConta = enteiroConta;
        this.cliente = cliente;
    }


    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persoa getCliente() {
        return cliente;
    }

    public void setCliente(Persoa cliente) {
        this.cliente = cliente;
    }

    public void ingresar(double saldo) {
        this.saldo = this.saldo + saldo;
    }
    
    public void retirar(double saldo) {
        double result = this.saldo - saldo;
        if (result >= 0) {
            this.saldo = this.saldo - saldo;
        } else {
            System.out.println("No hay suficiente saldo");
        }
    }
    
    public void actualizarSaldo(double saldo) {
        
    }

    @Override
    public String toString() {
        return "Conta{" + "enteiroConta=" + numeroConta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
    
    
}
