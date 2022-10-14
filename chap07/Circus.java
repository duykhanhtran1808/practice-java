package chap07;
import java.util.ArrayList;

public class Circus {
    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayList<Animal> pets = new ArrayList<>();
        pets.add(new Dog());
        pets.add(new Animal());

        pets.get(0).name = "Dug";
        pets.get(0).makeNoise();
        pets.get(0).eat();

        pets.get(1).name = "Drake";
        pets.get(1).makeNoise();
        pets.get(1).eat();
    }
}

class Animal {
    String name;

    void makeNoise() {
        System.out.println(name + " is making noise");
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    void makeNoise() {
        System.out.println(name + " is woofing");
    }

    void eat() {
        System.out.println(name + " is chewing bones");
    }
}
