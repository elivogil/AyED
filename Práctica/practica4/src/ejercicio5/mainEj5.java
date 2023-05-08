/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

/**
 *
 * @author gonza
 */
public class mainEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AreaEmpresa area=new AreaEmpresa("heaughsb", 3);
        ArbolGeneral<AreaEmpresa> a1 = new ArbolGeneral(area);
        area=new AreaEmpresa("heaughsb", 1);
        ArbolGeneral<AreaEmpresa> a2 = new ArbolGeneral(area);
        area=new AreaEmpresa("heaughsb", 6);
        ArbolGeneral<AreaEmpresa> a3 = new ArbolGeneral(area);
        ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = new ListaEnlazadaGenerica();
        hijos.agregarFinal(a1);
        hijos.agregarFinal(a2);
        hijos.agregarFinal(a3);
        area=new AreaEmpresa("heaughsb", 7);
        ArbolGeneral<AreaEmpresa> a = new ArbolGeneral(area, hijos);
        AnalizadorArbol anal=new AnalizadorArbol();
        System.out.println(anal.devolverMaximoPromedio(a));
        
    }
    
}
