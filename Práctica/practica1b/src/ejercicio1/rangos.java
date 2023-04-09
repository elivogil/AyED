/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author gonza
 */
public class rangos {
    
    public static void metFor(int a,int b){
        if (a<b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }else{
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        }
    }
    
    public static void metWhile(int a,int b){
        if (a<b) {
            while (a<=b) {
                System.out.println(a);
                a++;
            }
        }else{
            while (b<=a) {
                System.out.println(b);
                b++;
            }
        }
    }
    
    public static void sinEst(int a,int b){
        if(a<b){
            System.out.println(a);
            sinEst((a+1),b);
        }else if(b<a){
            System.out.println(b);
            sinEst(a,(b+1));
        }else{
            System.out.println(a);
        }
    }
    
}
