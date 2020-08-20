import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Persian firstPersian = new Persian("Tom");
        GermanShepherd firstShepherd = new GermanShepherd("Gerda");

        Elephant elephant = new Elephant("Elephant");
        Lion lion = new Lion("Lion");

        Animal[] animals = {firstPersian, firstShepherd, elephant, lion};

        String animalName = typeAnimalName();
        String animalInfo = getInfoByName(animals, animalName);
        showInfo(animalInfo);

        String fullHierarchy = getFullHierarchyOfAnimal(animals, animalName);
        showInfo(fullHierarchy);

        String shortHierarchy = getShortHierarchyOfAnimal(animals, animalName);
        showInfo(shortHierarchy);
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

    public static String getFullHierarchyOfAnimal(Animal[] animals, String animalName) {
        String info = null;

        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(animalName)) {
                info = animal.getGroupName();
            }
        }
        return info;
    }

    public static String getShortHierarchyOfAnimal(Animal[] animals, String animalName) {
        String info = null;

        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(animalName)) {
                info = animal.getShortHierarchy();
            }
        }
        return info;
    }

    public static String typeAnimalName() {
        System.out.println("Enter animal name:");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static void showInfo(String info) {
        System.out.println("Result:\n" + info);
    }
}
