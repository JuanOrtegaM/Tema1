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
public interface EstudianteDAO {

	Student getStudent(Student student);
	void removeStudent(Student student);
	void addStudent(Student student);
	void contractStudent(Student student);
}
