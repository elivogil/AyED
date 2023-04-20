/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio5;

import tp03.ejercicio1.ArbolBinario;

/**
 *
 * @author gonza
 */
public class mainEj5 {

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
        ProfundidadDeArbolBinario arb=new ProfundidadDeArbolBinario(a);
        System.out.println(arb.sumaElementosProfundidad(2));
    }
    
}
