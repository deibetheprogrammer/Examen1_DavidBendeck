/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_davidbendeck;

/**
 *
 * @author davidbendeck
 */
public class Examen {
    
    private String clase;
    private int conocimientoRequerido;
    private String tema;
    private int puntaje;

    public Examen() {
    }

    public Examen(String clase, int conocimientoRequerido, String tema, int puntaje) {
        this.clase = clase;
        this.conocimientoRequerido = conocimientoRequerido;
        this.tema = tema;
        this.puntaje = puntaje;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getConocimientoRequerido() {
        return conocimientoRequerido;
    }

    public void setConocimientoRequerido(int conocimientoRequerido) {
        this.conocimientoRequerido = conocimientoRequerido;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Examen{" + "clase=" + clase + ", conocimientoRequerido=" + conocimientoRequerido + ", tema=" + tema + ", puntaje=" + puntaje + '}';
    }
    
    
}
