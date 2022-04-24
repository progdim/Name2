package com.company;

public class Kenguru extends Animals{
    private String nameAnimal;
    private String property;


    public Kenguru(String nameAnimal, String property) {
        super(nameAnimal, property);
    }

    public Kenguru() {
        super("Киг-го", "Бегает");
    }


    public void rest() {
        System.out.println("Высоко прыгает");

    }
}
