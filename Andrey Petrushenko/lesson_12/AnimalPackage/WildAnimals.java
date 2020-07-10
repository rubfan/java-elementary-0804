package AnimalPackage;

public class WildAnimals extends Mammals {
    private String survival;

    public void setSurvival(String survival) {
        this.survival = survival;
    }

    public String getSurvival() {
        return survival;
    }

    public String getAnimalHierarchy() {
        return super.getAnimalHierarchy() + "WildAnimals, ";
    }

}
