/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

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
        int[]vec=new int[5];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Ingresar numero");
            vec[i]=leer.nextInt();
        }
        Datos d1 = met1(vec);
        Datos d2 = new Datos();
        met2(vec,d2);
        met3(vec);
        Calculadora c = new Calculadora();
        System.out.println("metodo 1: "+d1.toString());
        System.out.println("metodo 2: "+d2.toString());
        System.out.println("metodo 3: "+c.d.toString());
    }
    
    
    public static Datos met1(int[]vec){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int total=0;
        for (int i = 0; i < vec.length; i++) {
            if(vec[i]>max){
                max = vec[i];
            }
            if (vec[i]<min) {
                min = vec[i];
            }
            total+=vec[i];
        }
        double prom = (double)total / vec.length;
        Datos d = new Datos(max, min,prom);
        return d;
    }
    
    
    public static void met2(int[]vec,Datos d){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int total=0;
        for (int i = 0; i < vec.length; i++) {
            if(vec[i]>max){
                max = vec[i];
            }
            if (vec[i]<min) {
                min = vec[i];
            }
            total+=vec[i];
        }
        double prom = (double)total / vec.length;
        d.setMax(max);
        d.setMin(min);
        d.setProm(prom);
    }
    
    
    public static void met3(int[]vec){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int total=0;
        for (int i = 0; i < vec.length; i++) {
            if(vec[i]>max){
                max = vec[i];
            }
            if (vec[i]<min) {
                min = vec[i];
            }
            total+=vec[i];
        }
        double prom = (double)total / vec.length;
        Calculadora.d=new Datos(max, min, prom);
    }
    
}
