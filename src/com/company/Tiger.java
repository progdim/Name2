package com.company;

public class Tiger extends Animals{
    private String nameAnimal;
    private String property;


    public Tiger(String nameAnimal, String property) {
        super(nameAnimal, property);
    }

    public Tiger() {
        super("ЧУК","Сильный");
    }


    public void rest() {
        System.out.println("Любит покушать");

    }
}

