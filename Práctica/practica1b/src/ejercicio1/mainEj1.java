/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class mainEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresar primer numero del rango");
        int a=leer.nextInt();
        System.out.println("Ingresar segundo numero del rango");
        int b=leer.nextInt();
        System.out.println("");
        rangos.metFor(a, b);
        rangos.metWhile(a, b);
        rangos.sinEst(a, b);
    }
    
}
