package com.company;

public class Krokodil extends Animals {
    private String nameAnimal;
    private String property;


    public Krokodil(String nameAnimal, String property) {
        super(nameAnimal, property);
    }

    public Krokodil() {
        super("Зубастик", "Плавает");
    }


    public void rest() {
        System.out.println("Любит плавать в речках");

    }
}