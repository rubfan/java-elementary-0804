import animalInfo.Cats;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MainTest {
    Cats bobcat = new Cats("Mammals", "Bobcat", 20, "Cats", "Middle",
            1, 50, 200, 2);

    @Test
    public void animalInfoAllDataTest() {
        String expectedResult = "Animal name: Bobcat" +
                "\n-----Detailed information-----" +
                "\nKingdom name: Mammals" +
                "\nLife length: 20" +
                "\nSub kingdom mame: Cats" +
                "\nTerritory of living: Middle" +
                "\nGroup population: 1" +
                "\nMoving speed: 50" +
                "\nAverage weight: 200" +
                "\nYears to grow: 2";
        assertThat(bobcat.getInfo(false), equalTo(expectedResult));
    }

    @Test
    public void animalInfoNameOnlyTest() {
        String expectedResult = "Bobcat";
        assertThat(bobcat.getInfo(true), equalTo(expectedResult));
    }

    @Test
    public void getHierarchyTest() {
        String expectedResult = "Animal <-- Mammal <-- Predator <-- Hunt <-- Cats";
        assertThat(bobcat.getHierarchy(), equalTo(expectedResult));
    }
}
