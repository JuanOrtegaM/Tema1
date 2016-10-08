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
public class Data {
    //Variable de clase , se instancia sin necesidad de un objeto, final no se puede
    //modificar,
    public static final String SEPARADOR = "-";
    private String data;
    private int dia,mes,any2;

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAny2() {
        return any2;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAny2(int any2) {
        this.any2 = any2;
    }
    

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        //#2
        if (!data.contains(SEPARADOR)) throw new Exception();
        this.data = data;
    }

    public int getAny1(){
        return data != null ? descomposaData()[2] : 0;
    }

    private int[] descomposaData(){
        
        String[] dataDescomposada = data.split(SEPARADOR);
        int[] dataDescomposadaInt = new int[dataDescomposada.length];
        dataDescomposadaInt[0] = Integer.parseInt(dataDescomposada[0]);
        dataDescomposadaInt[1] = Integer.parseInt(dataDescomposada[1]);
        dataDescomposadaInt[2] = Integer.parseInt(dataDescomposada[2]);
        
        return dataDescomposadaInt;

    }
}


