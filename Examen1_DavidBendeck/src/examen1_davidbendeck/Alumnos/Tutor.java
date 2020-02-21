/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_davidbendeck.Alumnos;

import java.util.ArrayList;

/**
 *
 * @author davidbendeck
 */
public class Tutor extends Alumno {
    
    private String clases;
    private int ganancias;
    private int tutoriasDadas;
    private int teachingLevel;

    public Tutor() {
    }

    public Tutor(String clases, int ganancias, int tutoriasDadas, int teachingLevel, String name, int age, String career, String birthplace, int account, String username, String password) {
        super(name, age, career, birthplace, account, username, password);
        this.clases = clases;
        this.ganancias = ganancias;
        this.tutoriasDadas = tutoriasDadas;
        this.teachingLevel = teachingLevel;
    }

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public int getTutoriasDadas() {
        return tutoriasDadas;
    }

    public void setTutoriasDadas(int tutoriasDadas) {
        this.tutoriasDadas = tutoriasDadas;
    }

    public int getTeachingLevel() {
        return teachingLevel;
    }

    public void setTeachingLevel(int teachingLevel) {
        this.teachingLevel = teachingLevel;
    }

    @Override
    public String toString() {
        return "Tutor{" + "clases=" + clases + ", ganancias=" + ganancias + ", tutoriasDadas=" + tutoriasDadas + ", teachingLevel=" + teachingLevel + '}';
    }
    
}
