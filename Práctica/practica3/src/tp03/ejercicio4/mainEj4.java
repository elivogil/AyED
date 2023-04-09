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
        RedBinariaLlena<Integer>a=new RedBinariaLlena(1,1);
        RedBinariaLlena<Integer>aux=new RedBinariaLlena(2,8);
        a.agregarHijoIzquierdo(aux);
        aux=new RedBinariaLlena(5,5);
        a.agregarHijoDerecho(aux);
        aux=new RedBinariaLlena(3,5);
        a.getHijoIzquierdo().agregarHijoIzquierdo(aux);
        aux=new RedBinariaLlena(4,4);
        a.getHijoIzquierdo().agregarHijoDerecho(aux);
        aux=new RedBinariaLlena(6,6);
        a.getHijoDerecho().agregarHijoIzquierdo(aux);
        aux=new RedBinariaLlena(7,1);
        a.getHijoDerecho().agregarHijoDerecho(aux);
        System.out.println(a.retardoReenvio());
    }
    
}
