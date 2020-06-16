import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnimalInfoTest {
    private String dogName = "Muhtar";
    GetAnimalInfo gai = new GetAnimalInfo();
    Labrador lb = new Labrador();

    @Test
    public void testGetAnimalInfo() {
        assertThat(gai.getAnimalInfo(dogName), is("Name is dog - Muhtar"));
    }

    @Test
    public void testGetInfoExtend() {
        assertThat(gai.getInfoExtend(Labrador.class), notNullValue());
        String dogExtend = "Labrador => Retrievers => Sporting => Dog => Mammal => Animal => AnimalInfo => Object";
        assertThat(gai.getInfoExtend(Labrador.class), is(dogExtend));
    }

    @Test
    public void testSetBreed() {
        String b = new String("Breed - Labrador");
        lb.setBreed("Labrador");
        Assert.assertEquals(lb.breed, b);
    }

    @Test
    public void testGetHeterotrophs() {
        assertThat(lb.getHeterotrophs(), is("Directly or indirectly feed on other living organisms."));
    }

    @Test
    public void testGetFoot() {
        assertThat(lb.getFoot(), is("Have 4 foot."));
    }

    @Test
    public void testFeedWithMilk() {
        assertThat(lb.feedWithMilk(), is("Feeds the young with milk."));
    }

    @Test
    public void testGetTail() {
        assertThat(lb.getTail(), is("Have a tail."));
    }

    @Test
    public void testEatingMeat() {
        assertThat(lb.eatingMeat(), is("Eating meat."));
    }

    @Test
    public void testTrain() {
        assertThat(lb.train(), is("Easy to train."));
    }

    @Test
    public void testCharacter() {
        assertThat(lb.character(), is("Dogs raising game, aporting it and working on water."));
    }

    @Test
    public void testHuntingDog() {
        assertThat(lb.huntingDog(), is("Excellent flair, soft grip (soft mouth), a good and passionate hunter."));
    }

    @Test
    public void testTemperament() {
        assertThat(lb.temperament(), is("With a good character, very agile. Hyperactive, if you deal with it correctly."));
    }

    @Test
    public void testToWeight() {
        assertThat(lb.toWeight(), is("Gaining excess weight with improper feeding."));
    }
}
