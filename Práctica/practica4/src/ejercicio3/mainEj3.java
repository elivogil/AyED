/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/**
 *
 * @author gonza
 */
public class mainEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolGeneral<Integer> a1 = new ArbolGeneral(5);
        ArbolGeneral<Integer> a2 = new ArbolGeneral(10);
        ArbolGeneral<Integer> a3 = new ArbolGeneral(11);
        ListaGenerica<ArbolGeneral<Integer>> hijos = new ListaEnlazadaGenerica();
        hijos.agregarFinal(a1);
        hijos.agregarFinal(a2);
        hijos.agregarFinal(a3);
        ArbolGeneral<Integer> a = new ArbolGeneral(3, hijos);
        RecorridosAG r=new RecorridosAG();
        /*imprimir(r.numerosImparesMayoresQuePreOrden(a, 1));
        imprimir(r.numerosImparesMayoresQueInOrden(a, 1));
        imprimir(r.numerosImparesMayoresQuePostOrden(a, 1));
        imprimir(r.numerosImparesMayoresQuePorNiveles(a, 1));*/
        System.out.println(a.nivel(11));
        
    }
    
    public static void imprimir(ListaGenerica l){
        System.out.println("");
        l.comenzar();
        while (!l.fin()) {
            System.out.println(l.proximo());
        }
    }
    
}
