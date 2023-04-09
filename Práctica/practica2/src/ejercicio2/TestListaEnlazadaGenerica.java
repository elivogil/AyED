/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

/**
 *
 * @author gonza
 */
public class TestListaEnlazadaGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaGenerica<Persona> l= new ListaEnlazadaGenerica<Persona>();
        for (int i = 0; i < 4; i++) {
            Estudiante e=new Estudiante("pepe","pipi","p","gaga","chch");
            l.agregarFinal(e);
        }
        l.comenzar();
        tusDatos(l);
    }
    
    public static void tusDatos(ListaGenerica l){
        while(!l.fin()){
            System.out.println(l.proximo().toString());
        }
    }
    
}
