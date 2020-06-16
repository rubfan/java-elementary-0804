public class Dog extends Mammal {
    protected String breed = "Breed - ";

    protected String setBreed(String isBreed) {
        this.breed = breed + isBreed;
        return breed;
    }

    protected String train() {
        return "Easy to train.";
    }

    protected String eatingMeat() {
        return "Eating meat.";

    }
}
