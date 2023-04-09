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
public class ProfundidadDeArbolBinario {
    private ArbolBinario<Integer> arb;

    public ProfundidadDeArbolBinario(ArbolBinario<Integer> arb) {
        this.arb = arb;
    }
    
    
    private int profundidad(int p,ArbolBinario arb){
        int aux=0;
        if((!arb.esVacio())&&(p!=-1)){
            aux+=(int)arb.getDato();
            if(arb.tieneHijoIzquierdo()){
                aux+=profundidad(p-1, arb.getHijoIzquierdo());
            }
            if(arb.tieneHijoDerecho()){
                aux+=profundidad(p-1, arb.getHijoDerecho());
            }
        }
        return aux;
        
    }
    
    
    public int sumaElementosProfundidad(int p){
        return profundidad(p, arb);
    }
}
