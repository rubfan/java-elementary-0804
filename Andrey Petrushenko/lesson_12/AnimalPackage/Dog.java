package AnimalPackage;

public class Dog extends FourLegged {

    private String getDogName() {
        return "our dog name's Nik";
    }

    public String getDogInfo() {
        Dog.super.setPaws("the dog has strong paws to chase prey");
        Dog.super.setFood("dog likes meat and bones");
        Dog.super.setMove("dogs running fast");
        Dog.super.setSurvival("in the wild, representatives of the dog species hunt in packs");
        return Dog.super.getInfo()
                + Dog.super.getSurvival() + "\n"
                + Dog.super.getPaws() + "\n"
                + Dog.super.getFood() + "\n"
                + Dog.super.getMove() + "\n"
                + getDogName();
    }

    public String getAnimalHierarchy() {
        return super.getAnimalHierarchy() + "Dog ";
    }

}
