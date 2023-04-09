/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import tp02.ejercicio3.PilaGenerica;

/**
 *
 * @author gonza
 */
public class TestBalanceo {

    /**
     * @param args the command line arguments
     */
    public static boolean esBalanceado(String s){
        PilaGenerica<Character> pil = new PilaGenerica();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if((c=='(')||(c=='{')||(c=='[')){
                pil.apilar(c);
            }else if(c==')'){
                if((pil.esVacia())||(pil.tope()!='(')){
                    return false;
                }else{
                    pil.desapilar();
                }
            }else if(c=='}'){
                if((pil.esVacia())||(pil.tope()!='{')){
                    return false;
                }else{
                    pil.desapilar();
                }
            }else if(c==']'){
                if((pil.esVacia())||(pil.tope()!='[')){
                    return false;
                }else{
                    pil.desapilar();
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String s="{()}";
        if (esBalanceado(s)) {
            System.out.println("Es balanceado");
        }else{
            System.out.println("No es balanceado");
        }
    }
    
    
    
}
