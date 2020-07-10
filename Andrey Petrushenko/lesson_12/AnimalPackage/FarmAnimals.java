package AnimalPackage;

public class FarmAnimals extends WildAnimals {


    public String getInfo() {
        return super.getInfo() + "animals born and living on farms are used by humans for agricultural purposes" + "\n";
    }

    public String getAnimalHierarchy() {
        return super.getAnimalHierarchy() + "FarmAnimals, ";
    }

}


