/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

import java.util.List;

/**
 *
 * @author samur
 */
public class Agenda {
    int anio;
    private List<Pagina> paginas;

    public Agenda(int anio) {
        this.anio = anio;
    }

    

    public List<Pagina> getPaginas() {
        return paginas;
    }

    public void setPaginas(List<Pagina> pagines) {
        this.paginas = pagines;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int any) {
        this.anio = anio;
    }
}
