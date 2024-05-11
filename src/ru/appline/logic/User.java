package ru.appline.logic;

public class User {

    private String name;

    private String surname;

    private double salery;

    public User(String name, String surname, double salery) {
        this.name = name;
        this.surname = surname;
        this.salery = salery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalery() {
        return salery;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }
}
