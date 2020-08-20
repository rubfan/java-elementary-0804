package animals;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

public class AnimalInfoTest {
    private Beagle beagle = new Beagle();
    private Crocodile crocodile = new Crocodile();
    private Lion lion = new Lion();
    private Salamander salamander = new Salamander();
    private Main main = new Main();

    @Test
    public void showHierarchy_beagleTest() {
        assertThat(beagle.showHierarсhy(), equalTo("AnimalInfo <= Animal <= Pet <= Dog <= Beagle"));
    }

    @Test
    public void showHierarchy_crocodileTest() {
        assertEquals(("AnimalInfo <= Animal <= WildAnimal <= Reptile <= Crocodile"), crocodile.showHierarсhy());
    }

    @Test
    public void showHierarchy_lionTest() {
        assertEquals("AnimalInfo <= Animal <= WildAnimal <= Mammal <= Lion", lion.showHierarсhy());
    }

    @Test
    public void showHierarchy_salamanderTest() {
        assertThat(salamander.showHierarсhy(), is("AnimalInfo <= Animal <= WildAnimal <= Amphibian <= Salamander"));
    }

    @Test
    public void displayInfoBeagle_test() {
        assertThat(main.displayInfo("Beagle"), equalTo("AnimalInfo <= Animal <= Pet <= Dog <= Beagle\n"
                + "Is an animal. Has an ability to move, eat, sleep and reproduce.\n"
                + "This pet has an owner, lives at home, and has no need to get food himself.\n"
                + "Dog is a best man's friend, it guards and entertains his owner.\n"
                + "A greed of a dog is beagle, which means its a medium size hunting dog.\n"
                + "Favorite food is meat and bones.\n"
                + "Dog prefers to run.\n"
                + "Lives in temperate climate,in aviary or inside owner home.\n"
                + "Dog's voice is Woof-Woof.\n"
                + "Owner name is Helen.\n"
                + "Pet nickname is Herda.\n"
                + "Hunting dog has a strong scent, run fast and has good reaction."));
    }

    @Test
    public void displayInfoSalamander_test() {
        assertThat(main.displayInfo("Salamander"), equalTo("AnimalInfo <= Animal <= WildAnimal <= Amphibian <= Salamander\n"
                + "Is an animal. Has an ability to move, eat, sleep and reproduce.\n"
                + "Wild animals live in the wild, have to protect themselves and get food.\n"
                + "Amphibian live in the water and land, are cold-blooded.\n"
                + "Salamander is a tailed amphibian.\n"
                + "Eats insects.\n"
                + "In the water move with the help of tail, in the land with a help of two pairs of limbs.\n"
                + "Salamander lives in the water, sometimes in the land.\n"
                + "Makes sound like deaf loud squeak.\n"
                + "Fire salamander secretes deadly poison from the skin.\n"
                + "Needs water for breeding."));
    }

    @Test
    public void displayInfoCrocodile_test() {
        assertThat(main.displayInfo("Crocodile"), equalTo("AnimalInfo <= Animal <= WildAnimal <= Reptile <= Crocodile\n"
                + "Is an animal. Has an ability to move, eat, sleep and reproduce.\n"
                + "Wild animals live in the wild, have to protect themselves and get food.\n"
                + "Reptile are cold-blooded and carnivores animals.\n"
                + "Eats any live animal which is able to eat, for example wildebeest.\n"
                + "Swim good, and  move fast in the land.\n"
                + "Lives in tropic climate near fresh water.\n"
                + "Usually very silent, but can make rumbling sound.\n"
                + "Has powerful jaws with sharp teeth.\n"
                + "Has scaly skin impervious to water."));
    }

    @Test
    public void displayInfoLion_test() {
        assertThat(main.displayInfo("Lion"), equalTo("AnimalInfo <= Animal <= WildAnimal <= Mammal <= Lion\n"
                + "Is an animal. Has an ability to move, eat, sleep and reproduce.\n"
                + "Wild animals live in the wild, have to protect themselves and get food.\n"
                + "Mammals has wool, are warm-blooded and feed the young with milk.\n"
                + "Lion is a King of savannah.\n"
                + "Eats wild boars, deer, wildebeests, zebras, buffalos and giraffes, hunts in a group.\n"
                + "Speed of lion run reaches 80 km/h.\n"
                + "In Africa and Asia in hot tropical climate.\n"
                + "Loud roar.\n"
                + "Lives in pride, protects each other.\n"
                + "Has strong 4 limbs."));
    }
}
