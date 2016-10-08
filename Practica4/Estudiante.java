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
public class Estudiante extends Alumnos {
    
    protected String nif;

    public Estudiante(String fechaAlta, int edad, String nombre, String direccion) {
        super(fechaAlta, edad, nombre, direccion);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    } 
   
}
