/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin17;

/**
 *
 * @author dam1
 */
public class CuentaAhorro extends Conta {
    private float interese;
    private float saldoMinimo;

    public CuentaAhorro(float interese, float saldoMinimo, long enteiroConta, Persoa cliente) {
        super(enteiroConta, cliente);
        this.interese = interese;
        this.saldoMinimo = saldoMinimo;
    }

    public float getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(float saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public float getInterese() {
        return interese;
    }

    public void setInterese(float interese) {
        this.interese = interese;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "interese=" + interese + '}';
    }
    
}
