/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica6;

/**
 *
 * @author samur
 */
public class Docente extends Persona implements Trabajador {
    private String ccc;
    
    public String getCcc(){
      return null;      
}
     public void pagaAlTreballador(Trabajador treballador){
             String ccc = treballador.getCcc();
     }
}
