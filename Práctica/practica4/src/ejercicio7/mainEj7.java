/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/**
 *
 * @author gonza
 */
public class mainEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolGeneral<Double> a1 = new ArbolGeneral(5);
        ArbolGeneral<Double> a2 = new ArbolGeneral(10);
        ArbolGeneral<Double> a3 = new ArbolGeneral(11);
        ArbolGeneral<Double> a4 = new ArbolGeneral(5);
        ArbolGeneral<Double> a5 = new ArbolGeneral(10);
        ArbolGeneral<Double> a6 = new ArbolGeneral(11);
        ListaGenerica<ArbolGeneral<Double>> hijos = new ListaEnlazadaGenerica();
        ListaGenerica<ArbolGeneral<Double>> hijos2 = new ListaEnlazadaGenerica();
        hijos2.agregarFinal(a4);
        hijos2.agregarFinal(a5);
        hijos2.agregarFinal(a6);
        a1.setHijos(hijos2);
        hijos.agregarFinal(a1);
        hijos.agregarFinal(a2);
        hijos.agregarFinal(a3);
        ArbolGeneral<Double> a = new ArbolGeneral(3, hijos);
        RedDeAguaPotable r=new RedDeAguaPotable(a);
        System.out.println(r.minimoCaudal(900));
    }
    
}
