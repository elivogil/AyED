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
public class PilaGenerica<T> {
    
    private ListaGenerica<T> datos=new ListaEnlazadaGenerica<T>();

    public PilaGenerica() {
        
    }
    
    public void apilar(T elem){
        datos.agregarFinal(elem);
    }
    
    public T desapilar(){
        T aux=datos.elemento(datos.tamanio());
        datos.eliminarEn(datos.tamanio());
        return aux;
    }
    
    public T tope(){
        return datos.elemento(datos.tamanio());
    }
    
    public boolean esVacia(){
        return datos.esVacia();
    }
    
}
