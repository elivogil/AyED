
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gonza
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolGeneral<Integer> a1 = new ArbolGeneral(5);
        ArbolGeneral<Integer> a2 = new ArbolGeneral(10);
        ArbolGeneral<Integer> a3 = new ArbolGeneral(11);
        ArbolGeneral<Integer> a4 = new ArbolGeneral(7);
        ArbolGeneral<Integer> a5 = new ArbolGeneral(4);
        ArbolGeneral<Integer> a6 = new ArbolGeneral(12);
        ArbolGeneral<Integer> a7 = new ArbolGeneral(13);
        ArbolGeneral<Integer> a8 = new ArbolGeneral(9);
        ArbolGeneral<Integer> a9 = new ArbolGeneral(14);
        ArbolGeneral<Integer> a10 = new ArbolGeneral(15);
        ListaGenerica<ArbolGeneral<Integer>> hijos = new ListaEnlazadaGenerica();
        ListaGenerica<ArbolGeneral<Integer>> hijos2 = new ListaEnlazadaGenerica();
        ListaGenerica<ArbolGeneral<Integer>> hijos3 = new ListaEnlazadaGenerica();
        hijos2.agregarFinal(a4);
        hijos2.agregarFinal(a5);
        hijos2.agregarFinal(a6);
        hijos2.agregarFinal(a7);
        hijos3.agregarFinal(a8);
        hijos3.agregarFinal(a9);
        hijos3.agregarFinal(a10);
        a1.setHijos(hijos2);
        a2.setHijos(hijos3);
        hijos.agregarFinal(a1);
        hijos.agregarFinal(a2);
        hijos.agregarFinal(a3);
        ArbolGeneral<Integer> a = new ArbolGeneral(3, hijos);
        System.out.println(a.esAncestro(5, 15));
    }
    
}
