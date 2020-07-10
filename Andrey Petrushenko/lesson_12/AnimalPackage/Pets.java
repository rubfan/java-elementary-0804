package AnimalPackage;

public class Pets extends WildAnimals {

    public String getInfo() {
        return super.getInfo() + "pets are animals that live with humans" + "\n";
    }

    public String getAnimalHierarchy() {
        return super.getAnimalHierarchy() + "Pets, ";
    }

}
