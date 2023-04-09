/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author gonza
 */
public abstract class Persona {
    private String nombre;
    private String ape;
    private String mail;

    public Persona() {
    }
    

    public Persona(String nombre, String ape, String mail) {
        this.nombre = nombre;
        this.ape = ape;
        this.mail = mail;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + this.nombre + ", ape=" + this.ape + ", mail=" + this.mail + '}';
    }
}
