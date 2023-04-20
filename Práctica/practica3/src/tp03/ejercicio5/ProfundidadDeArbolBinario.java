/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03.ejercicio5;

import tp02.ejercicio3.ColaGenerica;
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
    
    
    public int sumaElementosProfundidad(int n){
            int cant=0;
            if(n>=0){
                int aux=0;
                ArbolBinario<Integer>arbol;
                ColaGenerica<ArbolBinario<Integer>>cola=new ColaGenerica();
                cola.encolar(this.arb);
                cola.encolar(null);
                while((!cola.esVacia())&&(aux<=n)){
                    arbol=cola.desencolar();
                    if(arbol!=null){
                        if(aux==n){
                            cant+=arbol.getDato();
                        }
                        if(arbol.tieneHijoIzquierdo()){
                            cola.encolar(arbol.getHijoIzquierdo());
                        }
                        if(arbol.tieneHijoDerecho()){
                            cola.encolar(arbol.getHijoDerecho());
                        }
                    }else if(!cola.esVacia()){
                        cola.encolar(null);
                        aux++;
                    }
                }
            }    
            return cant;
	}
}
