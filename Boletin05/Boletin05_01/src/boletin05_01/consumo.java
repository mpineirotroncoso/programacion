/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin05_01;

/**
 *
 * @author dam1
 */
public class consumo {
        private float km;
        private float litros;
        private float vMed;
        private float pGas;
    public void consumo() { 
    
    }
    
    public void consumo(float km, float litros, float vMed, float pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }
    
    public float getTempo() {
        return km/vMed;
    }
    
    public int consumoMedio() {
        return (int) ((litros/km)*100);
    }
    
    public float consumoEuros() {
        return (pGas/km)*100;
    }
    
    public void setKms(float km) {
        this.km = km;
    }
    public void setLitros(float litros) {
        this.litros = litros;
    }
    public void setvMed(float vMed) {
        this.vMed = vMed;
    }
    public void setpGas(float pGas) {
        this.pGas = pGas;
    }
    
    public float getKms() {
        return this.km;
    }
    public float getLitros() {
        return this.litros;
    }
    public float getvMed() {
        return this.vMed;
    }
    public float getpGas() {
        return this.pGas;
    }
    
}
