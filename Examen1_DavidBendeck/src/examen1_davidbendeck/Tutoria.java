/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_davidbendeck;

import examen1_davidbendeck.Alumnos.Estudiante;
import examen1_davidbendeck.Alumnos.Tutor;
import java.util.ArrayList;

/**
 *
 * @author davidbendeck
 */
public class Tutoria {
    
    private int hora;
    private String aula;
    private String dia;
    private String clase;
    private String mes;
    private int year;
    private String tema;
    private Tutor tutor;
    private ArrayList<Estudiante> estudiantes = new ArrayList();

    public Tutoria() {
    }

    public Tutoria(int hora, String aula, String dia, String clase, String mes, int year, String tema, Tutor tutor) {
        this.hora = hora;
        this.aula = aula;
        this.dia = dia;
        this.clase = clase;
        this.mes = mes;
        this.year = year;
        this.tema = tema;
        this.tutor = tutor;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Tutoria{" + "hora=" + hora + ", aula=" + aula + ", dia=" + dia + ", clase=" + clase + ", mes=" + mes + ", year=" + year + ", tema=" + tema + ", tutor=" + tutor + ", estudiantes=" + estudiantes + '}';
    }
    
    
}
