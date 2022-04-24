package com.company;

public class Animals {
    private String nameAnimal;
    private String property;

    public Animals(String nameAnimal, String property) {
        this.nameAnimal = nameAnimal;
        this.property = property;
    }


    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getMove() {
        return property;
    }

    public void setMove(String move) {
        this.property = property;
    }
    void sleep(){
        System.out.println("Животное уснуло");
    }
}