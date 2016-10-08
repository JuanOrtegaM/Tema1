/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica7;

/**
 *
 * @author samur
 */
public class main {

    public static void main(String[] args) {
        EstudianteDAO dao = (EstudianteDAO) new EstudianteMock();
        dao.getStudent(new Student());
    }
}
