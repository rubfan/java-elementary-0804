package FarmHW;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FarmTest {
    private Farm farm = new Farm();
    private WorkWithMessages message;

    @Before
    public void init() {
        farm = new Farm();
        message = new WorkWithMessages();
    }

    @Test
    public void testSetFarmCost() {
        assertEquals(message.showMassageWithError(), farm.setFarmCost(199));
        assertEquals("500", farm.setFarmCost(500));
        assertEquals("1000", farm.setFarmCost(1000));
    }

    @Test
    public void testSetCowsNumber() {
        assertEquals("You introduced an incorrect number! Try again", farm.setCowsNumber(199));
        assertEquals("50", farm.setCowsNumber(50));
        assertEquals("100", farm.setCowsNumber(100));
    }

    @Test
    public void testSetMilk() {
        assertEquals("You introduced an incorrect number! Try again", farm.setMilkThatCowGives(199));
        assertEquals("5", farm.setMilkThatCowGives(5));
        assertEquals("1", farm.setMilkThatCowGives(1));
    }

    @Test
    public void testSetCowFood() {
        assertEquals("You introduced an incorrect number! Try again", farm.setNumberOfCowFood(199));
        assertEquals("5", farm.setNumberOfCowFood(5));
        assertEquals("10", farm.setNumberOfCowFood(10));
    }

    @Test
    public void testSetFoodCost() {
        assertEquals("You introduced an incorrect number! Try again", farm.setCowsNumber(199));
        assertEquals("3", farm.setFoodCost(3));
        assertEquals("1", farm.setFoodCost(1));
    }

    @Test
    public void testMilkCost() {
        assertEquals("You introduced an incorrect number! Try again", farm.setMilkCost(199));
        assertEquals("10", farm.setMilkCost(10));
        assertEquals("5", farm.setMilkCost(5));
    }

    @Test
    public void testProfit() {
        assertNotEquals(null, farm.profit());
    }

    @Test
    public void testGetTax() {
        farm.setCowsNumber(100);
        farm.setNumberOfCowFood(5);
        farm.setFoodCost(1);
        farm.setMilkThatCowGives(5);
        farm.setMilkCost(10);
        assertEquals("You introduced an incorrect number! Try again", farm.getTax(1));
        assertThat(farm.getTax(10), is("4050.0"));
        assertThat(farm.getTax(20), is("4275.0"));

    }

    @Test
    public void testSetFarmYouCanBuyTheWorstCaseForFarmer() {
        farm.setFarmCost(1000);
        farm.setCowsNumber(50);
        farm.setNumberOfCowFood(10);
        farm.setFoodCost(3);
        farm.setMilkThatCowGives(1);
        farm.setMilkCost(5);
        farm.profit();
        farm.getTax(20);
        farm.getSalaryPersonal(10);
        double yearProfit = farm.profit() * 365;
        assertThat(farm.getFarmYouCanBuy(yearProfit), is("You need to take a credit to pay a bill"));
    }

    @Test
    public void testSetFarmYouCanBuyTheBestCaseForFarmer() {
        farm.setFarmCost(500);
        farm.setCowsNumber(100);
        farm.setNumberOfCowFood(5);
        farm.setFoodCost(1);
        farm.setMilkThatCowGives(5);
        farm.setMilkCost(10);
        farm.profit();
        farm.getTax(10);
        farm.getSalaryPersonal(5);
        double yearProfit = farm.profit() * 365;
        assertThat(farm.getFarmYouCanBuy(yearProfit), is("SUPER PROFITABLE"));
    }

    @Test
    public void testSetFarmYouCanBuyAverageCaseWithLessThanThreeFarms() {
        farm.setFarmCost(500);
        assertThat(farm.getFarmYouCanBuy(500.00), is("PROFITABLE"));
    }

    @Test
    public void testSetFarmYouCanBuyCaseWithZeroAvailableFarms() {
        farm.setFarmCost(500);
        assertThat(farm.getFarmYouCanBuy(0.00), is("NOT PROFITABLE"));
    }
}
