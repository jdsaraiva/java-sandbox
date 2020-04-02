package com.company;

// hierarchy of classes related to each other through inheritance
// one method with different implementations

public class AnimalPoly {

    public void makeSound() {
        System.out.println("Grr...");
    }

}

class Cat extends AnimalPoly {
    public void makeSound() {
        System.out.println("Meow");
    }
}
class Dog extends AnimalPoly {
    public void makeSound() {
        System.out.println("Woof");
    }

}
