import animals.Main;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    Main main = new Main();

    @Test
    public void getInfoAboutAnimalTest() {
        String exp = main.getInfoAboutAnimal("Striped kangaroo");
        Assert.assertEquals(exp, ("It's wild.\n" +
                "Mammals class.\n" +
                "Marsupial infraclass.\n" +
                "Kangaroo family.\n" +
                "Striped kangaroo genus.\n" +
                "Grey color.\n" +
                "45 cm of length.\n" +
                "1.5 kg of weight."));
        String exp2 = main.getInfoAboutAnimal("Cat");
        Assert.assertEquals(exp2, "Sorry, your animal is not in the system.");
    }
}
