package com.company;
import pacoteXPTO.Woof;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    static void sayHello(String name, int val) {

        System.out.println("Hello " + name);
        System.out.println("calc " + val * val);

    }

    static int sum(int val1, int val2) {
        return val1 + val2;
    }

    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }

    static int div(int aa, int bb) throws ArithmeticException {

        if(bb == 0) {
            throw new ArithmeticException("Division by Zero");
        } else {
            return aa / bb;
        }
    }


    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Hello mundo!");

        String firstName, lastName;
        firstName = "João";
        lastName = "Saraiva";

        System.out.println("Name is " + firstName + " " + lastName);

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
        Animal dog = new Animal("");
        dog.bark();
        dog.setRace("Rottweiller");

        //String race = dog.getRace();
        //System.out.print("Race: " + race);
        System.out.println("Race: " + dog.getRace());

        // Math functions
        double f = Math.floor(7.343);
        System.out.println("Math: " + f);

        // Static
        Woof c1 = new Woof();
        Woof c2 = new Woof();
        Woof c3 = new Woof();
        System.out.println("Woof: " + Woof.woof);

        // Static method
        c1.bark();

        // Poly class
        AnimalPoly a = new AnimalPoly();
        a.makeSound();

        // Type casting, double to int
        int typeCasting = (int) 3.14;
        System.out.println(typeCasting);

        // Anonymous classes
        Machine m = new Machine() {

            // When creating the Machine object, we can change the start method on the fly.
            @Override public void start() {
                System.out.println("Wooooo");
            }

        };
        m.start();

        Machine m2 = new Machine();
        m2.start();

        // The variables store references to the objects.
        // So, when you compare objects using the equality testing operator (==), it actually compares the references and not the object values.
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        System.out.println(a1 == a2); //Outputs false

        // Enums
        Rank checkRank = Rank.SOLDIER;

        switch(checkRank) {
            case SOLDIER:
                System.out.println("Soldier says hi!");
                break;
            case SERGEANT:
                System.out.println("Sergeant says Hello!");
                break;
            case CAPTAIN:
                System.out.println("Captain says Welcome!");
                break;
        }
        //Outputs "Soldier says hi!"c

        // Exception handling
        // The example below demonstrates exception handling when trying to access an array index that does not exist:
        try {
            int fail[ ] = new int[2];
            System.out.println(fail[5]);
        } catch (Exception e) {
            System.out.println("An error occurred");
        }

        // The throw keyword allows you to manually generate exceptions from your methods, refer to div
        // System.out.println(div(42, 0));

        /*
        There are two ways to create a thread.
        1. Extend the Thread class
        Inherit from the Thread class, override its run() method, and write the functionality of the thread in the run() method.
        Then you create a new object of your class and call it's start method to run the thread.
         */
        class Loader extends Thread {
            public void run() {
                System.out.println("Hello - 1");
            }
        }

        Loader obj = new Loader();
        obj.start();

        /*
        The other way of creating Threads is implementing the Runnable interface.
        Implement the run() method. Then, create a new Thread object, pass the Runnable class to its constructor, and start the Thread by calling the start() method.
         */
        class Loader2 implements Runnable {
            public void run() {
                System.out.println("Hello - 2");
            }
        }

        Thread t = new Thread(new Loader2());
        t.start();

        /*
        ArrayLists store objects. Thus, the type specified must be a class type.
        You cannot pass, for example, int as the objects' type.
        Instead, use the special class types that correspond to the desired value type, such as Integer for int, Double for double, and so on.
         */
        ArrayList colors = new ArrayList();

        // With a specific size
        // ArrayList<String> colors = new ArrayList<String>(10);

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.remove("Green");
        System.out.println(colors);

        // The ArrayList is better for storing and accessing data, as it is very similar to a normal array.
        // The LinkedList is better for manipulating data, such as making numerous inserts and deletes.
        LinkedList<String> c = new LinkedList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Orange");
        c.remove("Green");
        System.out.println(c);

        // You can use the enhanced for loop to iterate over the elements.
        for(String s: c) {
            System.out.println(s);
        }

        // HashMap is used for storing data collections as key and value pairs.
        // One object is used as a key (index) to another object (the value).
        HashMap<String, Integer> points = new HashMap<String, Integer>();
        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 733);
        System.out.println(points.get("Dave"));

        // Set, A aet is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        // The HashSet class does not automatically retain the order of the elements as they're added.
        // To order the elements, use a LinkedHashSet, which maintains a linked list of the set's elements in the order in which they were inserted.
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("tiger");
        animals.add("cat");
        animals.add("snake");
        animals.add("dog");

        // sorts the elements alphabetically
        Collections.sort(animals);
        System.out.println(animals);

        // An Iterator is an object that enables to cycle through a collection, obtain or remove elements.
        Iterator<String> it = animals.iterator();
        String value = it.next();
        System.out.println(value);

        Iterator<String> itr = animals.iterator();
        while(itr.hasNext()) {
            String valueItr = itr.next();
            System.out.println(valueItr);
        }

        // Files, read
        File theFile = new File("test.txt");
        try {

            // Save your text file as ANSI encoding and try again.
            System.out.println(theFile.getName() +  " exists!");
            Scanner sc = new Scanner(theFile);

            while(sc.hasNext()) {
                System.out.println(sc.next());
            }

            sc.close();

        }
        catch (FileNotFoundException e)  {
         System.out.println("The file does not exist");
        }

        // Files, create
        try {

            Formatter createFile = new Formatter("testA.txt");
            createFile.format("%s %s %s", "1","John", "Smith \r\n");
            createFile.format("%s %s %s", "2","Amy", "Brown");
            createFile.close();

        } catch (Exception e) {
            System.out.println("Error");
        }

        int fa=1, i=2;
        while(++i<5)
            fa*=i;
        System.out.println(fa);


    }

}
