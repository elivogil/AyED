/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class mainEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);    
        System.out.println("Ingresar numero");
        int n=leer.nextInt();
        int[]arre=new int[n];
        int j=1;
        for (int i = 0; i < n; i++) {
            arre[i]=n*j;
            j++;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(arre[i]);
        }

    }
    
}
