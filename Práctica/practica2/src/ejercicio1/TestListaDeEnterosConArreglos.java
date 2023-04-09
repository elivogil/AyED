/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import tp02.ejercicio1.ListaDeEnteros;
import tp02.ejercicio1.ListaDeEnterosConArreglos;

/**
 *
 * @author gonza
 */
public class TestListaDeEnterosConArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDeEnteros l=new ListaDeEnterosConArreglos();
        l.agregarFinal(1);
        l.agregarFinal(2);
        l.agregarFinal(3);
        imprimir(l);   
    }
    
    public static void imprimir(ListaDeEnteros l){
        l.comenzar();
        while(!l.fin()){
            System.out.println(l.proximo());
        }
    }
    
    
}
