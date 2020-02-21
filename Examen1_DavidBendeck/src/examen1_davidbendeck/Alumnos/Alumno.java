/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_davidbendeck.Alumnos;

/**
 *
 * @author davidbendeck
 */
public abstract class Alumno {
    
    protected String name;
    protected int age;
    protected String career;
    protected String birthplace;
    protected int account;
    protected String username;
    protected String password;

    public Alumno() {
    }

    public Alumno(String name, int age, String career, String birthplace, int account, String username, String password) {
        this.name = name;
        this.age = age;
        this.career = career;
        this.birthplace = birthplace;
        this.account = account;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Alumno{" + "name=" + name + ", age=" + age + ", career=" + career + ", birthplace=" + birthplace + ", account=" + account + ", username=" + username + ", password=" + password + '}';
    }
    
    
}
