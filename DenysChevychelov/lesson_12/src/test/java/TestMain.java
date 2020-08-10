import animalInfo.Animal;
import animalInfo.Persian;
import animalInfo.Siam;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class TestMain {
    Main main = new Main();
    Persian firstPersian = new Persian("Barsik");
    Persian secondPersian = new Persian("Murzik");
    Siam firstSiam = new Siam("Murka");
    Animal[] animals = {firstPersian, firstSiam, secondPersian};

    @Test
    public void ifNameMurzikShouldPrintPersianInfo() {
        String animalInfo = main.getInfoByName(animals, "Murzik");
        main.printInfo(animalInfo);
        assertThat(animalInfo, equalTo("Murzik\n" +
                "Breed - Persian.\n" +
                "Are able to move.\n" +
                "Produce milk for feeding their young\n" +
                "Eat other animals.\n" +
                "Have retractile claws, slender muscular bodies and strong flexible forelimbs.\n" +
                "Are able to purr but not roar.\n" +
                "Can hunt small rodents and other animals of a similar size.\n" +
                "Have 4 legs.\n" +
                "Lives near people.\n" +
                "This animal have night vision - true\n" +
                "This animal can growl - false\n" +
                "This animal wild - false\n" +
                "Has an extremely long and thick coat, short legs, a wide head with the ears set far apart, large eyes."));
    }

    @Test
    public void testGetMurzikHierarchySubspeciesOfAnimal() {
        String animalInfo = main.getHierarchySubspeciesOfAnimal(animals, "Murzik");
//        main.printInfo(animalInfo);
        assertThat(animalInfo, equalTo("Kingdom - Animal.\n" +
                "Class - Mammals.\n" +
                "Order - Carnivora.\n" +
                "Family - Cats.\n" +
                "Subfamily - Small Cats.\n" +
                "Genus - Forest Cats.\n" +
                "Species - Domestic Cats.\n" +
                "Breed - Persian.\n"));
    }

    @Test
    public void ifNameMurkaShouldPrintSiamInfo() {
        String animalInfo = main.getInfoByName(animals, "Murka");
        main.printInfo(animalInfo);
        assertThat(animalInfo, equalTo("Murka\n" +
                "Breed - Siam.\n" +
                "Are able to move.\n" +
                "Produce milk for feeding their young\n" +
                "Eat other animals.\n" +
                "Have retractile claws, slender muscular bodies and strong flexible forelimbs.\n" +
                "Are able to purr but not roar.\n" +
                "Can hunt small rodents and other animals of a similar size.\n" +
                "Have 4 legs.\n" +
                "Lives near people.\n" +
                "This animal have night vision - true\n" +
                "This animal can growl - false\n" +
                "This animal wild - false\n" +
                "Is characterized by blue almond-shaped eyes; " +
                "a triangular head shape; " +
                "large ears; " +
                "an elongated, slender, and muscular body; and various forms of point colouration."));
    }

    @Test
    public void testGetMurkaHierarchySubspeciesOfAnimal() {
        String animalInfo = main.getHierarchySubspeciesOfAnimal(animals, "Murka");
        assertThat(animalInfo, equalTo("Kingdom - Animal.\n" +
                "Class - Mammals.\n" +
                "Order - Carnivora.\n" +
                "Family - Cats.\n" +
                "Subfamily - Small Cats.\n" +
                "Genus - Forest Cats.\n" +
                "Species - Domestic Cats.\n" +
                "Breed - Siam.\n"));
    }
}
