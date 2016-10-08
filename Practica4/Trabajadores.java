/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica4;

/**
 *
 * @author samur
 */
public class Trabajadores extends Persona {
    
     protected String numSocial;

    public Trabajadores(String numSocial, String nombre, String direccion) {
        super(nombre, direccion);
        this.numSocial = numSocial;
    }

    public String getNumSocial() {
        return numSocial;
    }

    public void setNumSocial(String numSocial) {
        this.numSocial = numSocial;
    }
    
}
