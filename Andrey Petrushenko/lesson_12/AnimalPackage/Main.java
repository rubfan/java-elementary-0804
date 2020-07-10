package AnimalPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one of those animals:dog,cat,horse");
        String animal = scanner.next();
        getAnimalInfo(animal);

    }

    protected static void getAnimalInfo(String selectAnimal) {
        Dog dog = new Dog();
        if (selectAnimal.equals("dog")) {
            System.out.println(dog.getDogInfo());
            System.out.println("---------------------");
            System.out.println("hierarchy : " + dog.getAnimalHierarchy());
        }
        Cat cat = new Cat();
        if (selectAnimal.equals("cat")) {
            System.out.println(cat.getCatInfo());
            System.out.println("---------------------");
            System.out.println("hierarchy : " + cat.getAnimalHierarchy());
        }
        Horse horse = new Horse();
        if (selectAnimal.equals("horse")) {
            System.out.println(horse.getInfo());
            System.out.println("---------------------");
            System.out.println("hierarchy : " + horse.getAnimalHierarchy());
        }

    }
}
