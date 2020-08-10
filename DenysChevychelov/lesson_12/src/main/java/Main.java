import animalInfo.Animal;
import animalInfo.Persian;
import animalInfo.Siam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persian firstPersian = new Persian("Barsik");
        Persian secondPersian = new Persian("Murzik");
        Siam firstSiam = new Siam("Murka");
        Animal[] animals = {firstPersian, firstSiam, secondPersian};

        String animalName = typeAnimalName();
        String animalInfo = getInfoByName(animals, animalName);
        printInfo(animalInfo);
        String hierarchy = getHierarchySubspeciesOfAnimal(animals, animalName);
        printInfo(hierarchy);
    }

    public static String getInfoByName(Animal[] animals, String name) {
        String info = null;
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                info = animal.getInfo();
            }
        }
        return info;
    }

    public static String getHierarchySubspeciesOfAnimal(Animal[] animals, String name) {
        String info = null;
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                info = animal.getGroupName();
            }
        }
        return info;
    }

    public static String typeAnimalName() {
        System.out.println("Enter animal Name:");
        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();
        return animalName.trim();
    }

    public static void printInfo(String info) {
        System.out.println("Result:\n" + info);
    }
}
