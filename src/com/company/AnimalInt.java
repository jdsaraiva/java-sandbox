package com.company;

interface AnimalInt {

    public void eat();
    public void makeSound();

}

class Cow implements AnimalInt {
    public void makeSound() {
        System.out.println("Muuu");
    }
    public void eat() {
        System.out.println("omnomnom");
    }
}
