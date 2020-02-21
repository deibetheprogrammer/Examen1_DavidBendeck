/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_davidbendeck.Alumnos;

import examen1_davidbendeck.Examen;
import java.util.ArrayList;

/**
 *
 * @author davidbendeck
 */
public class Estudiante extends Alumno {
    
    private int conocimientoAcumulado;
    private int nivelAprendizaje;
    private ArrayList<Examen> examenesPendientes = new ArrayList();

    public Estudiante() {
    }

    public Estudiante(int conocimientoAcumulado, int nivelAprendizaje) {
        this.conocimientoAcumulado = conocimientoAcumulado;
        this.nivelAprendizaje = nivelAprendizaje;
    }

    public int getConocimientoAcumulado() {
        return conocimientoAcumulado;
    }

    public void setConocimientoAcumulado(int conocimientoAcumulado) {
        this.conocimientoAcumulado = conocimientoAcumulado;
    }

    public int getNivelAprendizaje() {
        return nivelAprendizaje;
    }

    public void setNivelAprendizaje(int nivelAprendizaje) {
        this.nivelAprendizaje = nivelAprendizaje;
    }

    public ArrayList<Examen> getExamenesPendientes() {
        return examenesPendientes;
    }

    public void setExamenesPendientes(ArrayList<Examen> examenesPendientes) {
        this.examenesPendientes = examenesPendientes;
    }

    @Override
    public String toString() {
        return super.toString() + "-->" + "Estudiante{" + "conocimientoAcumulado=" + conocimientoAcumulado + ", nivelAprendizaje=" + nivelAprendizaje + ", examenesPendientes=" + examenesPendientes + '}';
    }
    
}
