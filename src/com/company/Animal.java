package com.company;

public class Animal {

    private String race;

    void bark(){
        System.out.println("Woof!");
    }

    // Getter
    public String getRace() {
        return race;
    }

    // Setter
    public void setRace(String c) {
        this.race = c;
    }

}
