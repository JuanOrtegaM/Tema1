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
public class Profesor extends Trabajadores{
    private String titulacion,especialidad;

    public Profesor(String numSocial, String nombre, String direccion) {
        super(numSocial, nombre, direccion);
    }

    public String getTitulacion() {
        return titulacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
