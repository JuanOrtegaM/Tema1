/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3;

/**
 *
 * @author samur
 */
public class AñoBisiesto extends Data {
    
       public boolean esBisiesto(){
           if(getAny1()%2==0){
               return true;
           }
           return false;
       }
       
}
