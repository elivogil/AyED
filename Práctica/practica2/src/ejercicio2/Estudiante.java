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
public class Estudiante extends Persona{
    private String com;
    private String dire;

    public Estudiante() {
    }    
    
    public Estudiante(String com, String dire, String nombre, String ape, String mail) {
        super(nombre, ape, mail);
        this.com = com;
        this.dire = dire;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "com=" + com + ", dire=" + dire + '}';
    }
}
