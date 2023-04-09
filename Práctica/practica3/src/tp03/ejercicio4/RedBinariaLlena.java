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
public class RedBinariaLlena<T>extends ArbolBinario<T>{
    
    public RedBinariaLlena(T dato,int retardo) {
        super(dato,retardo);
    }
 
    
    private int retardoReenvio(ArbolBinario arb){
        if(arb.esVacio()){
            return 0;
        }else{
            if(arb.esHoja()){
                return arb.getRetardo();
            }else{
                return arb.getRetardo() + Math.max(retardoReenvio(arb.getHijoIzquierdo()),retardoReenvio(arb.getHijoDerecho()));
            }
        }
        
    }
        
    public int retardoReenvio(){
        return retardoReenvio(this);
    }
    
    
    
    
}
