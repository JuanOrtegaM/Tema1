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
public class AlumnosIntercambio extends Alumnos {
    protected String nie,paisOrigen;

    public AlumnosIntercambio(String nie, String paisOrigen, String fechaAlta, int edad, String nombre, String direccion) {
        super(fechaAlta, edad, nombre, direccion);
        this.nie = nie;
        this.paisOrigen = paisOrigen;
    }

    public String getNie() {
        return nie;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setNie(String nie) {
        this.nie = nie;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
}
