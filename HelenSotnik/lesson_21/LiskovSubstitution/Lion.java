package liskovsubstitution;

public class Lion extends WildAnimal {
    @Override
    public void nameYourself() {
        System.out.println("Lion");
    }

    @Override
    public void findFood() {
        System.out.println("Go to savanna and hunt for wildebeest or buffalo. ");
    }

    @Override
    public void eatFood() {
        System.out.println("Eat what you have hunted.");
    }

    @Override
    public void showHabitat() {
        System.out.println("Lions live in pride in Africa's savannas.");
    }

    @Override
    public void showYourVoice() {
        System.out.println("Rrrrr");
    }
}
