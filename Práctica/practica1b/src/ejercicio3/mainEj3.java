/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class mainEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante[]vec1 = new Estudiante[2];
        Profesor[]vec2 = new Profesor[3];
        cargarEst(vec1);
        cargarProf(vec2);
        imprimir(vec1, vec2); 
    }
    
    public static void cargarEst(Estudiante[]vec){
        Scanner leer = new Scanner(System.in);
        System.out.println("Empiezo a cargar los estudiantes");
        for (int i = 0; i < 2; i++) {
            Estudiante e = new Estudiante();
            System.out.println("Ingresar nombre");
            e.setNombre(leer.next());
            System.out.println("Ingresar apellido");
            e.setApe(leer.next());
            System.out.println("Ingresar comision");
            e.setCom(leer.next());
            System.out.println("Ingresar mail");
            e.setMail(leer.next());
            System.out.println("Ingresar direccion");
            e.setDire(leer.next());
            vec[i]=e;
        }
    }
    
    public static void cargarProf(Profesor[]vec){
        Scanner leer = new Scanner(System.in);
        System.out.println("Empiezo a cargar los profesores");
        for (int i = 0; i < 3; i++) {
            Profesor p = new Profesor();
            System.out.println("Ingresar nombre");
            p.setNombre(leer.next());
            System.out.println("Ingresar apellido");
            p.setApe(leer.next());
            System.out.println("Ingresar mail");
            p.setMail(leer.next());
            System.out.println("Ingresar catedra");
            p.setCatedra(leer.next());
            System.out.println("Ingresar facultad");
            p.setFacultad(leer.next());
            vec[i]=p;
        }
    }
    
    public static void imprimir(Estudiante[]vec1,Profesor[]vec2){
        for (int i = 0; i < 2; i++) {
            System.out.println(vec1[i].toString());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(vec2[i].toString());
        }
    }
    
    
}
