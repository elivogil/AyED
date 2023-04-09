/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

/**
 *
 * @author gonza
 */
public class ContadorArbol {
    private ArbolBinario<Integer>arb;

    public ContadorArbol(ArbolBinario<Integer> arb) {
        this.arb = arb;
    }
    
    private void recorrerInOrden(ArbolBinario<Integer>arb,ListaEnlazadaGenerica<Integer>l){
        if(arb.tieneHijoIzquierdo()){
            recorrerInOrden(arb.getHijoIzquierdo(), l);
        }
        if(arb.getDato()%2==0){
            l.agregarFinal(arb.getDato());
        }
        if(arb.tieneHijoDerecho()){
            recorrerInOrden(arb.getHijoDerecho(), l);
        }
    }
    
    private void recorrerPostOrden(ArbolBinario<Integer>arb,ListaEnlazadaGenerica<Integer>l){
        if(arb.tieneHijoIzquierdo()){
            recorrerPostOrden(arb.getHijoIzquierdo(), l);
        }
        if(arb.tieneHijoDerecho()){
            recorrerPostOrden(arb.getHijoDerecho(), l);
        }
        if(arb.getDato()%2==0){
            l.agregarFinal(arb.getDato());
        }
        
    }
    
    public ListaEnlazadaGenerica numerosParesInOrden(){
        ListaEnlazadaGenerica<Integer>l=new ListaEnlazadaGenerica();
        if(!arb.esVacio()){
            recorrerInOrden(arb,l);
        }
        return l;
    }

    public ListaEnlazadaGenerica numerosParesPostOrden(){
        ListaEnlazadaGenerica<Integer>l=new ListaEnlazadaGenerica();
        if(!arb.esVacio()){
            recorrerPostOrden(arb,l);
        }
        return l;
    }
}
