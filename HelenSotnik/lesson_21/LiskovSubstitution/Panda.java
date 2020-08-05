package liskovsubstitution;

public class Panda extends WildAnimal {
    private int kgBamboo;

    public Panda(int kgBamboo) {
        this.kgBamboo = kgBamboo;
    }

    public int getKgBamboo() {
        return kgBamboo;
    }

    public void setKgBamboo(int kgBamboo) {
        this.kgBamboo = kgBamboo;
    }

    @Override
    public void nameYourself() {
        System.out.println("Panda");
    }

    @Override
    public void findFood() {
        System.out.println("Find bamboo trees.");
    }

    @Override
    public void eatFood() {
        System.out.println("Eat " + getKgBamboo() + "kg of b amboo.");
    }

    @Override
    public void showHabitat() {
        System.out.println("Pandas habitat is China.");
    }

    @Override
    public void showYourVoice() {
        System.out.println("Roar");
    }
}
