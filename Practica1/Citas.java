/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author samur
 */
public class Citas extends Agenda {
    List <Citas> citas;
	
	public Citas(int anio) {
		super(anio);
		
	}
	
	public String getHora(){
		String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		return timeStamp;
	}
	

	public static void main(String[] args) {
		
	}
}
