package AnimalPackage;

public class Horse extends FarmAnimals {

    private String getHorseName() {
        return "our horse name's Raven";
    }

    public String getInfo() {
        Horse.super.setFood("horse herbivore");
        Horse.super.setMove("horses running fast they very strong animals");
        Horse.super.setSurvival("in the wild, horses live in herds");
        return Horse.super.getInfo()
                + Horse.super.getSurvival() + "\n"
                + Horse.super.getFood() + "\n"
                + Horse.super.getMove() + "\n"
                + getHorseName();
    }

    public String getAnimalHierarchy() {
        return super.getAnimalHierarchy() + "Horse ";
    }

}
