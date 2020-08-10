package DependencyInversion;

public class MyAnimals {
    public static void main(String[] args) {
        Routine routine = new Routine();
        routine.feedAPet(new Dog());
        routine.feedAPet(new Cat());
        routine.feedAPet(new Fish());
    }
}

class Routine {
    void feedAPet(Pet pet) {
        pet.feed();
    }
}

interface Pet {
    void feed();
}

class Dog implements Pet {
    public void feed () {
        System.out.println("I'm feeding my dog!");
    }
}

class Cat implements Pet {
    public void feed () {
        System.out.println("I'm feeding my cat!");
    }
}

class Fish implements Pet {
    public void feed () {
        System.out.println("I'm feeding my fish!");
    }
}
