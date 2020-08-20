package AnimalPackage;

public class Mammals extends Animals {

    public String getInfo() {
        return super.getInfo() + "mammals are animals that feed on mother's milk as children" + "\n";
    }

    public String getAnimalHierarchy() {
        return super.getAnimalHierarchy() + "Mammals, ";
    }
}

