import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class TestMain {

    Main main = new Main();
    Persian firstPersian = new Persian("Tom");
    GermanShepherd firstShepherd = new GermanShepherd("Gerda");

    Elephant elephant = new Elephant("Elephant");
    Lion lion = new Lion("Lion");

    Animal[] animals = {firstPersian, firstShepherd, elephant, lion};

    @Test
    public void shouldReturnPersianInfo() {
        String animalInfo = Main.getInfoByName(animals, "Tom");
        Main.showInfo(animalInfo);
        Assert.assertThat(animalInfo, equalTo("Name - Tom\n" +
                "Breed - Persian.\n" +
                "Animal can move,eat,sleep and make sound.\n" +
                "Mammals feeds their young with milk.\n" +
                "Pets lives with people.\n" +
                "Cat is a good rodent hunter and other small animals.\n" +
                "Able to purr - true\n" +
                "Have a night vision - true\n" +
                "Persian has short legs and thick coat.\n"));
    }

    @Test
    public void getPersianFullHierarchyOfAnimal() {
        String animalInfo = Main.getFullHierarchyOfAnimal(animals, "Tom");
        Main.showInfo(animalInfo);
        Assert.assertThat(animalInfo, equalTo("Kingdom - Animal.\n" +
                "Class - Mammals.\n" +
                "Category - Pets.\n" +
                "Subspecies - Cat.\n" +
                "Breed - Persian.\n"));
    }

    @Test
    public void shouldReturnGermanShepherdInfo() {
        String animalInfo = Main.getInfoByName(animals, "Gerda");
        Main.showInfo(animalInfo);
        Assert.assertThat(animalInfo, equalTo("Name - Gerda\n" +
                "Breed - German Shepherd.\n" +
                "Animal can move,eat,sleep and make sound.\n" +
                "Mammals feeds their young with milk.\n" +
                "Pets lives with people.\n" +
                "Dog is a good friend for human and smart animal.\n" +
                "Able to bark - true\n" +
                "Have a sharp scent - true\n" +
                "German Shepherd is well for the family and to guard.\n"));
    }

    @Test
    public void getGermanShepherdFullHierarchyOfAnimal() {
        String animalInfo = Main.getFullHierarchyOfAnimal(animals, "Gerda");
        Main.showInfo(animalInfo);
        Assert.assertThat(animalInfo, equalTo("Kingdom - Animal.\n" +
                "Class - Mammals.\n" +
                "Category - Pets.\n" +
                "Subspecies - Dog.\n" +
                "Breed - German Shepherd.\n"));
    }

    @Test
    public void getElephantShortHierarchy() {
        String animalInfo = Main.getShortHierarchyOfAnimal(animals, "Elephant");
        Main.showInfo(animalInfo);
        Assert.assertThat(animalInfo, is("Animal <= Mammals <= Wild animals <= Elephant"));
    }

    @Test
    public void getLionShortHierarchy() {
        String animalInfo = Main.getShortHierarchyOfAnimal(animals, "Lion");
        Main.showInfo(animalInfo);
        Assert.assertThat(animalInfo, is("Animal <= Mammals <= Wild animals <= Lion"));
    }
}
