/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

/**
 *
 * @author gonza
 */
public class main1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDeEnterosEnlazada l=calcularSucesion(6);
        l.comenzar();
        while(!l.fin()){
            System.out.println(l.proximo());
        }
    }
    
    public static ListaDeEnterosEnlazada calcularSucesion(int n){
        ListaDeEnterosEnlazada l;
        if(n!=1){
            if(n%2==0){
                l=calcularSucesion(n/2);
            }else{
                l=calcularSucesion(n*3+1);
            }
        }else{
            l=new ListaDeEnterosEnlazada();
        }
        l.agregarInicio(n);
        return l;
    }
    
}
