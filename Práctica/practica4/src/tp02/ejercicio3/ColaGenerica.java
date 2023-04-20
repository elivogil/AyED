/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

/**
 *
 * @author gonza
 */
public class ColaGenerica<T> {
    private ListaGenerica<T> datos=new ListaEnlazadaGenerica<>();

    public ColaGenerica() {
    }
    
    public void encolar(T elem){
        datos.agregarFinal(elem);
    }
    
    public T desencolar(){
        T aux=datos.elemento(1);
        datos.eliminarEn(1);
        return aux;
    }
    
    public T tope(){
        return datos.elemento(datos.tamanio());
    }
    
    public boolean esVacia(){
        return datos.esVacia();
    }
    
}
