/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica2;

/**
 *
 * @author samur
 */
public class Principal {
    
    public static void main(String args[]){
        //Se procesa los datos de memoria de Basura.
        Basura b= new Basura();

        //Añadimos Espera de 10s.
        System.out.println("Objeto inicializandose, esperemos 10s.");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Se deja de apuntar a la posicion de memoria reservada.
        System.out.println("Limpiando objeto...");
        b = null;

        //Limpiando memoria.
        System.out.println("Ejecutandose Garbage Collector");
        System.gc();

        //Esperamos 10 segundos.Aqui es cuando entra en el finalize de "Basura" sin haberlo llamado y limpia el objeto "Basura"
        
        System.out.println("Esperamos 10 seg.");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
