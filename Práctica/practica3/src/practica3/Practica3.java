/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;
import tp03.ejercicio3.ContadorArbol;

/**
 *
 * @author gonza
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario<Integer>a=new ArbolBinario(1);
        ArbolBinario<Integer>aux=new ArbolBinario(2);
        a.agregarHijoIzquierdo(aux);
        aux=new ArbolBinario(5);
        a.agregarHijoDerecho(aux);
        aux=new ArbolBinario(3);
        a.getHijoIzquierdo().agregarHijoIzquierdo(aux);
        aux=new ArbolBinario(4);
        a.getHijoIzquierdo().agregarHijoDerecho(aux);
        aux=new ArbolBinario(6);
        a.getHijoDerecho().agregarHijoIzquierdo(aux);
        a.entreNiveles(2,9);
        /*imprimirArb(a);
        ContadorArbol cont=new ContadorArbol(a);
        ListaEnlazadaGenerica lis1=new ListaEnlazadaGenerica();
        ListaEnlazadaGenerica lis2=new ListaEnlazadaGenerica();
        lis1=cont.numerosParesInOrden();
        lis2=cont.numerosParesPostOrden();
        System.out.println("Lista 1\n");
        imprimirLista(lis1);
        System.out.println("Lista 2\n");
        imprimirLista(lis2);*/
        
        
    }
    
    public static void imprimirArb(ArbolBinario<Integer> a){
        System.out.println(a.getDato());
        if(a.tieneHijoIzquierdo()){
            imprimirArb(a.getHijoIzquierdo());
        }
        if(a.tieneHijoDerecho()){
            imprimirArb(a.getHijoDerecho());
        }
    }
    
    public static void imprimirLista(ListaEnlazadaGenerica l){
        l.comenzar();
        while(!l.fin()){
            System.out.println(l.proximo());
        }
    }
    
}
