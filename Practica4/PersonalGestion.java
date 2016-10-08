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
public class PersonalGestion extends Trabajadores {
    protected String posicion;

    public PersonalGestion(String posicion, String numSocial, String nombre, String direccion) {
        super(numSocial, nombre, direccion);
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    
    
    
}
