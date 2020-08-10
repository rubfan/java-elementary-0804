import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class BusinessProjectCawFarmTest {
    BusinessProjectCawFarm farm = new BusinessProjectCawFarm();

    @Test
    public void testSetQuantityCow() {
        double a = farm.setQuantityCow(5), b = farm.setQuantityCow(55), c = farm.setQuantityCow(105), d = farm.setQuantityCow(50), e = farm.setQuantityCow(100);
        Assert.assertEquals(-1, a, 0);
        Assert.assertEquals(55, b, 0);
        Assert.assertEquals(-1, c, 0);
        Assert.assertEquals(50, d, 0);
        Assert.assertEquals(100, e, 0);
    }

    @Test
    public void testSetGivesCowMilk() {
        double a = farm.setGivesCowMilk(0.5), b = farm.setGivesCowMilk(3), c = farm.setGivesCowMilk(6), d = farm.setGivesCowMilk(1), e = farm.setGivesCowMilk(5);
        assertThat(c, is(-1.0));
        assertThat(a, is(-1.0));
        assertThat(b, is(3.0));
        assertThat(d, is(1.0));
        assertThat(e, is(5.0));
    }

    @Test
    public void testSetPriceFarm() {
        double a = farm.setPriceFarm(450), b = farm.setPriceFarm(550), c = farm.setPriceFarm(1050), d = farm.setPriceFarm(500), e = farm.setPriceFarm(1000);
        Assert.assertEquals(-1, a, 0);
        Assert.assertEquals(550, b, 0);
        Assert.assertEquals(-1, c, 0);
        Assert.assertEquals(500, d, 0);
        Assert.assertEquals(1000, e, 0);
    }

    @Test
    public void testSetPriceEatingFood() {
        double a = farm.setPriceEatingFood(0.5), b = farm.setPriceEatingFood(2), c = farm.setPriceEatingFood(6), d = farm.setPriceEatingFood(1), e = farm.setPriceEatingFood(3);
        assertThat(c, is(-1.0));
        assertThat(a, is(-1.0));
        assertThat(b, is(2.0));
        assertThat(d, is(1.0));
        assertThat(e, is(3.0));
    }

    @Test
    public void testSetCowEatingFood() {
        double a = farm.setCowEatingFood(4), b = farm.setCowEatingFood(7), c = farm.setCowEatingFood(11), d = farm.setCowEatingFood(5), e = farm.setCowEatingFood(10);
        Assert.assertEquals(-1, a, 0);
        Assert.assertEquals(7, b, 0);
        Assert.assertEquals(-1, c, 0);
        Assert.assertEquals(5, d, 0);
        Assert.assertEquals(10, e, 0);

    }

    @Test
    public void testSetPriseLiterMilk() {
        double a = farm.setPriseLiterMilk(4), b = farm.setPriseLiterMilk(7), c = farm.setPriseLiterMilk(11), d = farm.setPriseLiterMilk(5), e = farm.setPriseLiterMilk(10);
        assertThat(c, is(-1.0));
        assertThat(a, is(-1.0));
        assertThat(b, is(7.0));
        assertThat(d, is(5.0));
        assertThat(e, is(10.0));
    }

    @Test
    public void testSetIncomeTax() {
        double a = farm.setIncomeTax(9), b = farm.setIncomeTax(15), c = farm.setIncomeTax(21), d = farm.setIncomeTax(10), e = farm.setIncomeTax(20);
        Assert.assertEquals(-1, a, 0);
        Assert.assertEquals(15, b, 0);
        Assert.assertEquals(-1, c, 0);
        Assert.assertEquals(10, d, 0);
        Assert.assertEquals(20, e, 0);
    }

    @Test
    public void testSetSalariesToMilkmaids() {
        double a = farm.setSalariesToMilkmaids(4), b = farm.setSalariesToMilkmaids(7), c = farm.setSalariesToMilkmaids(11), d = farm.setSalariesToMilkmaids(5), e = farm.setSalariesToMilkmaids(10);
        assertThat(c, is(-1.0));
        assertThat(a, is(-1.0));
        assertThat(b, is(7.0));
        assertThat(d, is(5.0));
        assertThat(e, is(10.0));
    }

    @Before
    public void testSetProfit() {
        assertThat(farm.setProfit(), notNullValue());
        assertThat(farm.setProfit(), is(-1.0));
        double pr = 55 * 3 * 8 * 365 - 55 * 3 * 7 * 365;
        farm.setQuantityCow(55);
        farm.setGivesCowMilk(3);
        farm.setPriceEatingFood(3);
        farm.setPriseLiterMilk(8);
        farm.setCowEatingFood(7);
        assertThat(farm.setProfit(), is(pr));
    }

    @Before
    public void testSetNetProfit() {
        assertThat(farm.setNetProfit(), notNullValue());
        double netPrNotSal = farm.setProfit() - (farm.setProfit() * 15 / 100);
        double netPr = netPrNotSal - (netPrNotSal * 7 / 100);
        farm.setIncomeTax(15);
        farm.setSalariesToMilkmaids(7);
        assertThat(farm.setNetProfit(), is(netPr));
    }

    @Test
    public void testBuyFarmPay() {
        farm.setPriceFarm(550);
        double bf = (int) farm.setNetProfit() / 550;
        assertThat(farm.buyFarmPay(), is(bf));
    }

    @Test
    public void testProfitable() {
        assertThat(farm.profitable(), is("NOT PROFITABLE"));
        farm.setPriceFarm(550);
        farm.buyFarmPay();
        assertThat(farm.profitable(), is("SUPER PROFITABLE"));
        farm.setQuantityCow(55);
        farm.setGivesCowMilk(3);
        farm.setPriceEatingFood(3);
        farm.setPriseLiterMilk(7.02);
        farm.setCowEatingFood(7);
        farm.setProfit();
        farm.setPriceFarm(550);
        farm.setIncomeTax(15);
        farm.setSalariesToMilkmaids(7);
        farm.setNetProfit();
        farm.buyFarmPay();
        assertThat(farm.profitable(), is("PROFITABLE"));
    }
}
