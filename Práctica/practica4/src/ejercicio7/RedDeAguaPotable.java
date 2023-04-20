/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/**
 *
 * @author gonza
 */
public class RedDeAguaPotable {
    private ArbolGeneral<Double>a;

    public RedDeAguaPotable(ArbolGeneral<Double> a) {
        this.a = a;
    }
    
    
    private double recorrer(ArbolGeneral<Double>a,double c){
        if(a.tieneHijos()){
            ListaGenerica<ArbolGeneral<Double>> hijos=a.getHijos();
            double c2=(double)c/hijos.tamanio();
            hijos.comenzar();
            while(!hijos.fin()){
                double aux=recorrer(hijos.proximo(),c2);
                c=Math.min(c, aux);
            }       
        }
        return c;
    }
    
    public double minimoCaudal(double c){
        if(!a.esVacio()){
            c=recorrer(a,c);
        }
        return c;
    }
}
