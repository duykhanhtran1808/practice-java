package chap09;

public class Duck {
    public static void main(String[] args) {
        MaleHippo john = new MaleHippo(60);
        System.out.println("The age is " + john.getAge());

        FemaleHippo anna = new FemaleHippo();
        System.out.println("The age is " + anna.getAge());
        john.beCute();
        anna.beCute();
    }
}

abstract class Animal {
    private int age;

    public Animal(int ageToSet) {
        age = ageToSet;
        System.out.println("Hello Animal");
    }

    public int getAge() {
        return age;
    }
}

abstract class Hippo extends Animal {
    public Hippo() {
        this(10);
    }

    public Hippo(int ageToSet) {
        super(ageToSet);
        System.out.println("Hello Hippo");
    }

}

class MaleHippo extends Hippo implements Pet {
    public MaleHippo() {
        super();
    }

    public MaleHippo(int ageToSet) {
        super(ageToSet);
    }

    public void beCute() {
        System.out.println("Try to be cute");
    }
}

class FemaleHippo extends Hippo implements Pet {
    public FemaleHippo() {
        super();
    }

    public FemaleHippo(int ageToSet) {
        super(ageToSet);
    }

    public void beCute() {
        System.out.println("Try to be cute");
    }
}

interface Pet {
    public void beCute();
}