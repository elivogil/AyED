/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author gonza
 */
public class Profesor extends Persona{
    
    private String catedra;
    private String facultad;

    public Profesor() {
    }  
    
    public Profesor(String catedra, String facultad, String nombre, String ape, String mail) {
        super(nombre, ape, mail);
        this.catedra = catedra;
        this.facultad = facultad;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "catedra=" + catedra + ", facultad=" + facultad + '}';
    }
    
    
}
