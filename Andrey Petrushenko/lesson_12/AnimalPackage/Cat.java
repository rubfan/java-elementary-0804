package AnimalPackage;

public class Cat extends FourLegged {

    private String getCatName() {
        return "our cat name's Vasya";
    }

    public String getCatInfo() {
        Cat.super.setTail("cat has fluffy tail");
        Cat.super.setPaws("cat paws are adapted for jumping and climbing trees");
        Cat.super.setFood("cat likes milk");
        Cat.super.setMove("the cat moves lazily");
        Cat.super.setSurvival("in the wild, representatives of the feline species live and hunt alone");
        return Cat.super.getInfo()
                + Cat.super.getSurvival() + "\n"
                + Cat.super.getPaws() + "\n"
                + Cat.super.getTail() + "\n"
                + Cat.super.getFood() + "\n"
                + Cat.super.getMove() + "\n"
                + getCatName();
    }

    public String getAnimalHierarchy() {
        return Cat.super.getAnimalHierarchy() + "Cat ";
    }


}
