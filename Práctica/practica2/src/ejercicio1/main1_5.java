/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import tp02.ejercicio1.ListaDeEnteros;
import tp02.ejercicio1.ListaDeEnterosEnlazada;

/**
 *
 * @author gonza
 */
public class main1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDeEnteros l=new ListaDeEnterosEnlazada();
        l.agregarFinal(1);
        l.agregarFinal(2);
        l.agregarFinal(3);
        l.comenzar();
        imprimir(l);
    }
    
    public static void imprimir(ListaDeEnteros l){
        if(!l.fin()){
            int aux=l.proximo();
            imprimir(l);
            System.out.println(aux);
        }
    }
    
    
}
