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
public class Pagina extends Agenda {
        private boolean festivo;
	private List<Citas> citas;
	

	
	public Pagina( boolean festivo,int anio) {
		super(anio);
		this.festivo=festivo;		
	}
	

	public String getDate(){
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		return timeStamp;
	}
	
	public boolean esFestivo(boolean festivo){
		if(festivo){
			System.out.println("Festivo");
		}else{
			System.out.println("No Festivo");
		}
		return festivo;
	}
	
	public static void main(String[] args) {
		Pagina p= new Pagina(false, 1991);
		p.esFestivo(true);
		p.getDate();
	}
    
}
