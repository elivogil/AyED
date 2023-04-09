/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author gonza
 */
public class Datos {
    private int max;
    private int min;
    private double prom;

    public Datos() {
    }

    public Datos(int max, int min, double prom) {
        this.max = max;
        this.min = min;
        this.prom = prom;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }

    @Override
    public String toString() {
        return "Datos{" + "max=" + max + ", min=" + min + ", prom=" + prom + '}';
    }
    
    
    
}
