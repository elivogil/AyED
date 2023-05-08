/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/**
 *
 * @author gonza
 */
public class AnalizadorArbol {
    
    public int devolverMaximoPromedio (ArbolGeneral<AreaEmpresa>a){
        int max=-1;
        int cant=0,total=0;
        ColaGenerica<ArbolGeneral<AreaEmpresa>> cola= new ColaGenerica();
        ArbolGeneral<AreaEmpresa> arbol_aux;
        cola.encolar(a);
        cola.encolar(null);
        while (!cola.esVacia()) {
            arbol_aux = cola.desencolar();
            if(arbol_aux!=null){
                cant++;
                total+=arbol_aux.getDato().getRetardo();
                if (arbol_aux.tieneHijos()) {
                    ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = arbol_aux.getHijos();
                    hijos.comenzar();
                    while (!hijos.fin()) {
                        cola.encolar(hijos.proximo());
                    }
                }
            }else{
                int prom=total/cant;
                max=Math.max(max, prom);
                if(!cola.esVacia()){
                    cola.encolar(null);
                    cant=0;
                    total=0;
                }
            }
        }
        return max;
    } 
}
