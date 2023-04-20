/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/**
 *
 * @author gonza
 */
public class RecorridosAG {
    
    private void numerosImparesMayoresQuePreOrden(ListaGenerica<Integer> l,ArbolGeneral<Integer>a,Integer n){
        if((a.getDato()%2==1)&&(a.getDato()>n)){
            l.agregarFinal(a.getDato());
        }
        if(a.tieneHijos()){
            ListaGenerica<ArbolGeneral<Integer>> aux=a.getHijos();
            aux.comenzar();
            while(!aux.fin()){
                numerosImparesMayoresQuePreOrden(l,aux.proximo(), n);
            }
        }
        
    }
    
    public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral<Integer>a,Integer n){
        ListaGenerica<Integer>l=new ListaEnlazadaGenerica();
        if(!a.esVacio()){
            numerosImparesMayoresQuePreOrden(l, a, n);
        }
        return l;
    }
    
    
    private void numerosImparesMayoresQueInOrden (ListaGenerica<Integer>l,ArbolGeneral<Integer> a, Integer n){
        if(a.tieneHijos()){
            ListaGenerica<ArbolGeneral<Integer>> aux=a.getHijos();
            aux.comenzar();
            numerosImparesMayoresQueInOrden(l, aux.proximo(), n);
            if((a.getDato()%2==1)&&(a.getDato()>n)){
                l.agregarFinal(a.getDato());
            }
            while(!aux.fin()){
                numerosImparesMayoresQueInOrden(l,aux.proximo(), n);
            }
        }else if((a.getDato()%2==1)&&(a.getDato()>n)){
                l.agregarFinal(a.getDato());
        }
    }
    
    public ListaGenerica<Integer> numerosImparesMayoresQueInOrden (ArbolGeneral<Integer> a, Integer n){
        ListaGenerica<Integer>l=new ListaEnlazadaGenerica();
        if(!a.esVacio()){
            numerosImparesMayoresQueInOrden(l, a, n);
        }
        return l;
    }
    
    
    private void numerosImparesMayoresQuePostOrden (ListaGenerica<Integer>l,ArbolGeneral<Integer> a, Integer n){
        if(a.tieneHijos()){
            ListaGenerica<ArbolGeneral<Integer>> aux=a.getHijos();
            aux.comenzar();
            while(!aux.fin()){
                numerosImparesMayoresQuePostOrden(l,aux.proximo(), n);
            }
        }
        if((a.getDato()%2==1)&&(a.getDato()>n)){
            l.agregarFinal(a.getDato());
        }
        
    }
    
    public ListaGenerica<Integer> numerosImparesMayoresQuePostOrden (ArbolGeneral<Integer> a, Integer n){
        ListaGenerica<Integer>l=new ListaEnlazadaGenerica();
        if(!a.esVacio()){
            numerosImparesMayoresQuePostOrden(l, a, n);
        }
        return l;
    }
    
    
    public ListaGenerica<Integer> numerosImparesMayoresQuePorNiveles(ArbolGeneral <Integer> a, Integer n){
        ListaGenerica<Integer> result = new ListaEnlazadaGenerica();
        ColaGenerica<ArbolGeneral<Integer>> cola= new ColaGenerica();
        ArbolGeneral<Integer> arbol_aux;
        cola.encolar(a);
        while (!cola.esVacia()) {
            arbol_aux = cola.desencolar();
            if((arbol_aux.getDato()%2==1)&&(arbol_aux.getDato()>n)){
                result.agregarFinal(arbol_aux.getDato());
            }
            if (arbol_aux.tieneHijos()) {
                ListaGenerica<ArbolGeneral<Integer>> hijos = arbol_aux.getHijos();
                hijos.comenzar();
                while (!hijos.fin()) {
                    cola.encolar(hijos.proximo());
                }
            }
        }
        return result;
    }
    
    
}
