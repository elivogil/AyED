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
public class RedBinariaLlena<T>{
    
    private ArbolBinario<T>arb;
    
    public RedBinariaLlena(T dato) {
        this.arb=new ArbolBinario(dato);
    }

    public ArbolBinario<T> getArb() {
        return arb;
    }
    
    
    
    private int retardoReenvio(ArbolBinario arb){
        if(arb.esVacio()){
            return 0;
        }else{
            if(arb.esHoja()){
                return (int)arb.getDato();
            }else{
                return (int)arb.getDato() + Math.max(retardoReenvio(arb.getHijoIzquierdo()),retardoReenvio(arb.getHijoDerecho()));
            }
        }
        
    }
        
    public int retardoReenvio(){
        return retardoReenvio(this.getArb());
    }
    
    
    
    
}
