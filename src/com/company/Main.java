package com.company;
import java.util.Scanner;

// Fazer um editor hexadécimal ?
// IDE -
// Enviar requests para PHP - 

public class Main {

    static void sayHello(String name, int val) {

        System.out.println("Hello " + name);
        System.out.println("calc " + val * val);

    }

    static int sum(int val1, int val2) {
        return val1 + val2;
    }

    public static void main(String[] args) {

        System.out.println("Hello mundo!");

        String firstName, lastName;
        firstName = "João";
        lastName = "Saraiva";

        //System.out.println("Name is " + firstName + " " + lastName);

        // standard loop
        for (int i = 2; i < 10; i = i*i) {
            System.out.println(i);
        }

        // Loop array
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int i: ar) {

            // i is created for the loop
            System.out.print(i + " ");

        }

        // Multi dimensional array
        String array[ ][ ] =  { {"Hey", "John", "Bye"}, {"John", "Johnson", "Hello"} };
        System.out.println(array[1][1]);

        // Get user input
        Scanner myVar = new Scanner(System.in);
        //System.out.println(myVar.nextLine());

        //
        int arr[ ] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = i;
        }
        int res = arr[0] + arr[2];
        System.out.println("res:" + res);

        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
            } else {
                result += i;
            }
        }
        System.out.println("result:" + result);

        System.out.println("\n");
        System.out.println("# Classes and methods # ");
        System.out.println("\n");

        // Classes and methods
        sayHello("João", 4);

        int x = sum(2, 5);
        System.out.println(x);

        // Getter and setter
        Animal dog = new Animal();
        dog.bark();
        dog.setRace("Rottweiller");
        String race = dog.getRace();
        System.out.print("Race: " + race);

    }
}
