import animalInfo.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object[] animals = initDataSet();

        System.out.println(animalInfo(animals));

        for (int i = 0; i < animals.length; i++) {
            AnimalInfo animal = (AnimalInfo) animals[i];
            System.out.println("Hierarchy for " + animal.getInfo(true) + ": " + animal.getHierarchy());
        }
    }

    public static String animalInfo(Object[] animalsSet) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input animal name: ");
        String input = scanner.next();
        for (Object animal : animalsSet) {
            String animalName = ((AnimalInfo) animal).getInfo(true);
            if (animalName.equalsIgnoreCase(input)) {
                return ((AnimalInfo) animal).getInfo(false);
            }
        }
        return "Not found";
    }

    private static Object[] initDataSet() {
        Object[] animals = new Object[7];
        animals[0] = new Bull("Mammals", "Cow", 20, "Bulls", "Middle and Equatorial",
                "Cowshed", 600, "Ordinary", 300, 6);
        animals[1] = new Dogs("Mammals", "Dachshund", 14, "Dogs", "Everywhere",
                1, 60, 10, 40, 100);
        animals[2] = new Dogs("Mammals", "Wolf", 14, "Dogs", "North and Middle",
                10, 60, 15, 60, 130);
        animals[3] = new Dove("Birds", "Jacobin", 6, "Flying birds", 600,
                "Cities", "Spring");
        animals[4] = new Cats("Mammals", "Cat", 30, "Cats", "Home",
                1, 30, 3, 1);
        animals[5] = new Cats("Mammals", "Tiger", 30, "Cats", "Middle",
                1, 80, 300, 3);
        animals[6] = new Vulture("Birds", "Vulture", 80, "Ordinary",
                "Middle and Tropical", 15, "Scavenger", 500);
        return animals;
    }
}
