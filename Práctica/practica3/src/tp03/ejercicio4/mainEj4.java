/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;

/**
 *
 * @author gonza
 */
public class mainEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RedBinariaLlena<Integer>a=new RedBinariaLlena(1);
        ArbolBinario<Integer>aux=new ArbolBinario<>(2);
        a.getArb().agregarHijoIzquierdo(aux);
        aux=new ArbolBinario<>(5);
        a.getArb().agregarHijoDerecho(aux);
        aux=new ArbolBinario<>(3);
        a.getArb().getHijoIzquierdo().agregarHijoIzquierdo(aux);
        aux=new ArbolBinario<>(4);
        a.getArb().getHijoIzquierdo().agregarHijoDerecho(aux);
        aux=new ArbolBinario<>(6);
        a.getArb().getHijoDerecho().agregarHijoIzquierdo(aux);
        aux=new ArbolBinario<>(7);
        a.getArb().getHijoDerecho().agregarHijoDerecho(aux);
        System.out.println(a.retardoReenvio());
    }
    
}
