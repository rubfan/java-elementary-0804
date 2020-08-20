package animals;

import java.util.Scanner;

public class Main {
    private Beagle beagle = new Beagle();
    private Lion lion = new Lion();
    private Salamander salamander = new Salamander();
    private Crocodile crocodile = new Crocodile();

    protected void typeAnimalName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You can pick animal:Beagle,Crocodile,Salamander or Lion.");
        System.out.println("Enter its name with 1st capital letter.");
        String name = sc.next();
        displayInfo(name);
    }

    protected String displayInfo(String animalName) {
        if (animalName == "Beagle") {
            return beagle.showHierarсhy() + "\n" +
                    beagle.getInfo() + "\n" +
                    beagle.showDescription();
        } else if (animalName == "Lion") {
            return lion.showHierarсhy() + "\n" +
                    lion.getInfo() + "\n" +
                    lion.showDescription();
        } else if (animalName == "Salamander") {
            return salamander.showHierarсhy() + "\n" +
                    salamander.getInfo() + "\n" +
                    salamander.showDescription();

        } else if (animalName == "Crocodile") {
            return crocodile.showHierarсhy() + "\n" +
                    crocodile.getInfo() + "\n" +
                    crocodile.showDescription();
        } else {
            System.out.println("INPUT PARAMETERS ARE INCORRECT");
        }
        return "";
    }
}
