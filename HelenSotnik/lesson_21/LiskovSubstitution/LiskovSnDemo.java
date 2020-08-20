package liskovsubstitution;

public class LiskovSnDemo {
    public static void main(String[] args) {

        WildAnimal animal[] = new WildAnimal[3];
        animal[0] = new Monkey("Сhimpanzee");
        animal[1] = new Lion();
        animal[2] = new Panda(28);

        for (int i = 0; i < animal.length; i++) {
            animal[i].nameYourself();
            animal[i].showHabitat();
            animal[i].findFood();
            animal[i].eatFood();
            animal[i].showYourVoice();
            System.out.println();
        }
    }
}
