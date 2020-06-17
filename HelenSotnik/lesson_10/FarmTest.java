package company;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class FarmTest {
    Farm farm = new Farm();

    public void initialization() {
        farm.setCowsAmount(60);
        farm.setCormAmount(6);
        farm.setPriceOfCorm(2);
        farm.setMilkPrice(6);
        farm.setMilkAmount(3);
        farm.setFarmCost(1000);
        farm.setTaxPercentage(15);
        farm.setSalaryPercentage(10);
    }

    public void initialization2() {
        farm.setCowsAmount(50);
        farm.setCormAmount(6);
        farm.setPriceOfCorm(1);
        farm.setMilkPrice(5);
        farm.setMilkAmount(1);
        farm.setFarmCost(500);
        farm.setTaxPercentage(10);
        farm.setSalaryPercentage(5);
    }

    @Test
    public void cowsAmount_IncorrectValueTest1() {
        farm.setCowsAmount(49);
        assertEquals("INPUT PARAMS ARE INCORRECT", 0, farm.feedCows());
    }

    @Test
    public void cowsAmount_InCorrectValueTest2() {
        farm.setCowsAmount(101);
        assertEquals("INPUT PARAMS ARE INCORRECT", 0, farm.feedCows());
    }

    @Test
    public void cowsAmountAndCormAmount_CorrectValueTest1() {
        farm.setCowsAmount(50);
        farm.setCormAmount(5);
        assertEquals(250, farm.feedCows());
    }

    @Test
    public void cowsAmountAndCormAmount_CorrectValueTest2() {
        farm.setCowsAmount(70);
        farm.setCormAmount(8);
        assertThat(farm.feedCows(), not(0));
        assertThat(farm.feedCows(), is(560));
    }

    @Test
    public void cowsAmountAndCormAmount_CorrectValueTest3() {
        farm.setCowsAmount(100);
        farm.setCormAmount(10);
        assertThat(farm.feedCows(), equalTo(1000));
    }

    @Test
    public void cormAmount_IncorrectValueTest1() {
        farm.setCormAmount(4);
        assertEquals("INPUT PARAMS ARE INCORRECT", 0, farm.feedCows());
    }

    @Test
    public void cormAmount_IncorrectValueTest2() {
        farm.setCormAmount(11);
        assertSame("INPUT PARAMS ARE INCORRECT", 0, farm.feedCows());
    }

    @Test
    public void millAmount_IncorrectValueTest() {
        farm.setMilkAmount(0);
        assertSame("INPUT PARAMS ARE INCORRECT", 0, farm.milkTheCows());
    }

    @Test
    public void millAmount_IncorrectValueTest2() {
        farm.setMilkAmount(-1);
        assertSame("INPUT PARAMS ARE INCORRECT", 0, farm.milkTheCows());
    }

    @Test
    public void millAmount_IncorrectValueTest3() {
        farm.setMilkAmount(6);
        assertEquals("INPUT PARAMS ARE INCORRECT", 0, farm.milkTheCows());
    }

    @Test
    public void milkAmount_CorrectValueTest1() {
        initialization();
        farm.setMilkAmount(1);
        boolean a = (farm.milkTheCows() == 60);
        assertTrue(a);
    }

    @Test
    public void milkAmount_CorrectValueTest2() {
        initialization();
        farm.setMilkAmount(3);
        assertTrue(farm.milkTheCows() == 180);
        assertThat(farm.milkTheCows(), not(0));
    }

    @Test
    public void millAmount_CorrectValueTest3() {
        initialization();
        farm.setMilkAmount(5);
        assertEquals(300, farm.milkTheCows());
    }

    @Test
    public void milkPrice_IncorrectValueTest1() {
        farm.setMilkPrice(4);
        assertEquals("INPUT PARAMS ARE INCORRECT", 0, farm.calculateYearMilkProfit());
    }

    @Test
    public void milkPrice_IncorrectValueTest2() {
        farm.setMilkPrice(11);
        assertSame("INPUT PARAMS ARE INCORRECT", 0, farm.calculateYearMilkProfit());
    }

    @Test
    public void milkPrice_CorrectValueTest1() {
        initialization();
        farm.setMilkPrice(5);
        assertThat(farm.calculateYearMilkProfit(), equalTo(328500));
    }

    @Test
    public void milkPrice_CorrectValueTest2() {
        initialization();
        farm.setMilkPrice(7);
        assertNotEquals("INPUT PARAMS ARE INCORRECT", 0, farm.calculateYearMilkProfit());
        assertEquals(459900, farm.calculateYearMilkProfit());
    }

    @Test
    public void milkPrice_CorrectValueTest3() {
        initialization();
        farm.setMilkPrice(10);
        assertNotEquals("INPUT PARAMS ARE INCORRECT", 0, farm.calculateYearMilkProfit());
        assertThat(farm.calculateYearMilkProfit(), equalTo(657000));
    }

    @Test
    public void cormPrice_IncorrectValueTest1() {
        farm.setPriceOfCorm(0);
        assertSame("INPUT PARAMS ARE INCORRECT", 0, farm.calculateYearFeedingExpenses());
    }

    @Test
    public void cormPrice_IncorrectValueTest2() {
        farm.setPriceOfCorm(-1);
        assertEquals("INPUT PARAMS ARE INCORRECT", 0, farm.calculateYearFeedingExpenses());
    }

    @Test
    public void cormPrice_IncorrectValueTest3() {
        farm.setPriceOfCorm(4);
        assertEquals("INPUT PARAMS ARE INCORRECT", 0, farm.calculateYearFeedingExpenses());
    }

    @Test
    public void cormPrice_CorrectValueTest1() {
        initialization();
        farm.setPriceOfCorm(1);
        assertNotEquals("INPUT PARAMS ARE INCORRECT", 0, farm.calculateYearFeedingExpenses());
        boolean result = farm.calculateYearFeedingExpenses() == 131400;
        assertTrue(result);
    }

    @Test
    public void cormPrice_CorrectValueTest2() {
        initialization();
        farm.setPriceOfCorm(2);
        assertNotEquals("INPUT PARAMS ARE INCORRECT", 0, farm.calculateYearFeedingExpenses());
        assertTrue(farm.calculateYearFeedingExpenses() == 262800);
    }

    @Test
    public void cormPrice_CorrectValueTest3() {
        initialization();
        farm.setPriceOfCorm(3);
        assertThat(farm.calculateYearFeedingExpenses(), is(394200));
    }

    @Test
    public void taxPercentage_IncorrectValueTest1() {
        farm.setTaxPercentage(9);
        assertSame("INPUT PARAMS ARE INCORRECT", 0, farm.payTaxes());
    }

    @Test
    public void taxPercentage_IncorrectValueTest2() {
        farm.setTaxPercentage(21);
        assertEquals("INPUT PARAMS ARE INCORRECT", 0, farm.payTaxes());
    }

    @Test
    public void taxPercentage_CorrectValueTest1() {
        initialization();
        farm.setTaxPercentage(10);
        assertNotEquals("INPUT PARAMS ARE INCORRECT", 0, farm.payTaxes());
        assertThat(farm.payTaxes(), is(13140));
    }

    @Test
    public void taxPercentage_CorrectValueTest2() {
        initialization();
        farm.setTaxPercentage(15);
        assertNotEquals("INPUT PARAMS ARE INCORRECT", 0, farm.payTaxes());
        assertThat(farm.payTaxes(), equalTo(19710));
    }

    @Test
    public void taxPercentage_CorrectValueTest3() {
        initialization();
        farm.setTaxPercentage(20);
        assertNotSame("INPUT PARAMS ARE INCORRECT", 0, farm.payTaxes());
        assertEquals(26280, farm.payTaxes());
    }

    @Test
    public void salaryPercentage_IncorrectValueTest1() {
        farm.setSalaryPercentage(4);
        assertEquals("INPUT PARAMS ARE INCORRECT", 0, farm.paySalaries());
    }

    @Test
    public void salaryPercentage_IncorrectValueTest2() {
        farm.setSalaryPercentage(11);
        assertSame("INPUT PARAMS ARE INCORRECT", 0, farm.paySalaries());
    }

    @Test
    public void salaryPercentage_CorrectValueTest1() {
        initialization();
        farm.setSalaryPercentage(5);
        assertNotEquals("INPUT PARAMS ARE INCORRECT", 0, farm.paySalaries());
        assertThat(farm.paySalaries(), equalTo(5584));
    }

    @Test
    public void salaryPercentage_CorrectValueTest2() {
        initialization();
        farm.setSalaryPercentage(8);
        assertNotEquals("INPUT PARAMS ARE INCORRECT", 0, farm.paySalaries());
        assertEquals(8935, farm.paySalaries());
    }

    @Test
    public void salaryPercentage_CorrectValueTest3() {
        initialization();
        farm.setSalaryPercentage(10);
        assertNotSame("INPUT PARAMS ARE INCORRECT", 0, farm.paySalaries());
        assertEquals(11169, farm.paySalaries());
    }

    @Test
    public void farmCost_IncorrectValueTest1() {
        farm.setFarmCost(499);
        assertEquals("INPUT PARAMS ARE INCORRECT", 0, farm.calculateFarmsAmountToBuy());
    }

    @Test
    public void farmCost_IncorrectValueTest2() {
        farm.setFarmCost(1001);
        assertEquals("INPUT PARAMS ARE INCORRECT", 0, farm.calculateFarmsAmountToBuy());
    }

    @Test
    public void farmCost_CorrectValueTest1() {
        initialization();
        farm.setFarmCost(500);
        assertThat(farm.calculateFarmsAmountToBuy(), equalTo(201));
        assertNotEquals("INPUT PARAMS ARE INCORRECT", 0, farm.calculateFarmsAmountToBuy());
    }

    @Test
    public void farmCost_CorrectValueTest2() {
        initialization();
        farm.setFarmCost(750);
        assertThat(farm.calculateFarmsAmountToBuy(), equalTo(134));
        assertNotEquals("INPUT PARAMS ARE INCORRECT", 0, farm.calculateFarmsAmountToBuy());
    }

    @Test
    public void farmCost_CorrectValueTest3() {
        initialization();
        farm.setFarmCost(1000);
        assertTrue(farm.calculateFarmsAmountToBuy() == 100);
        assertFalse("INPUT PARAMS ARE INCORRECT", farm.calculateFarmsAmountToBuy() == 0);
    }

    @Test
    public void profitabilityOfFarmTest1() {
        initialization();
        assertEquals("SUPER PROFITABLE" + "\nCurrent year income allows to buy 100 farms.", farm.profitabilityOfFarm());
    }

    @Test
    public void profitabilityOfFarmTest2() {
        if (farm.calculateFarmsAmountToBuy() == 1)
            assertEquals("PROFITABLE" + "\nCurrent year income allows to buy 1 farms.", farm.profitabilityOfFarm());
    }

    @Test
    public void profitabilityOfFarmTest3() {
        initialization2();
        assertEquals("NOT PROFITABLE", farm.profitabilityOfFarm());
    }
}
