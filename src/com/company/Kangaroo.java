package com.company;

public class Kangaroo extends Animals{
    private String nameAnimal;
    private String property;


    public Kangaroo(String nameAnimal, String property) {
        super(nameAnimal, property);
    }

    public Kangaroo() {
        super("Киг-го", "Бегает");
    }


    public void rest() {
        System.out.println("Высоко прыгает");

    }
}
