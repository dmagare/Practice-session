package Package1;

import java.sql.SQLOutput;

public class Animal {
    static int animalCounter = 0;
    String name;
    int age;

    {
        System.out.println("This is a animal");
    }

    public Animal() {
        animalCounter++;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        animalCounter++;

    }

    public void noise() {
        System.out.println("Noise");


    }


}
