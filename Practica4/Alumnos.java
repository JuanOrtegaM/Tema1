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
public class Alumnos extends Persona {
    protected String fechaAlta;
    protected int edad;

    public Alumnos(String fechaAlta, int edad,String nombre, String direccion) {
        super (nombre,direccion);
        this.fechaAlta = fechaAlta;
        this.edad = edad;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public int getEdad() {
        return edad;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
